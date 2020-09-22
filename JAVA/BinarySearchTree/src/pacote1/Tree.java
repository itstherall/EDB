package pacote1;
import java.util.ArrayList;

public class Tree {
	Node raiz;
	
	//inicio construtores
	Tree(int chave){
		this.raiz = new Node();
		this.raiz.item = chave;
		this.raiz.direita = null;
		this.raiz.esquerda = null;
	}
	
	Tree(){
		this.raiz = null;
		this.raiz.direita = null;
		this.raiz.esquerda = null;
	}
	//fim construtores
	
	
	boolean adicionar_no(int novo_item) {
		//Variaveis necessárias para adicionar um novo valor a árvore
		Node atual =  this.raiz;
		Node anterior = new Node();
		Node adicionar_no = new Node(novo_item);
		
		/*procura o ultimo nó que aponta para Null
		 *diferenciandos os valores se maior, menor ou igual
		 *ou seja = busca binaria de árvores
		 */
		
		while(atual != null ) {
			//informa se já existe o valor que queremos adicionar na arvoré
			if(atual.item == novo_item ) {	System.out.println("Valor já existente na arvoré"); return false;}
			else if(atual.item > novo_item) {	
				anterior = atual;
				atual = atual.esquerda;
			} else {
				anterior = atual;
				atual = atual.direita;
			}
		}
		
		//adicionando o nó!!!!
		if(anterior.item > novo_item) {
			anterior.esquerda = adicionar_no;
			return true;
		} else {
			anterior.direita = adicionar_no;
			return true;
		}
	}
	
	
	//procurar um elemento na árvore:
	boolean contains(int valor_busca) {
		
		Node atual =  this.raiz;
		Node anterior = new Node();
		
		//pensar em como imprimir a arvore
		while(atual != null) {
			//informa se já existe o valor que queremos adicionar na arvoré
			if(atual.item == valor_busca ) { return true; }
			else if(atual.item > valor_busca) {	
				anterior = atual;
				atual = atual.esquerda;
			} else {
				anterior = atual;
				atual = atual.direita;
			}
		}
		return false;
	}
	
	
	//função para retornar o tamanho da árvore
	public int altura(Node root){
		
		if(root == null) {
		   return 0;
		}
		
		int aux_esquerdo, aux_direito;
		
		aux_esquerdo = altura(root.esquerda);
		aux_direito = altura(root.direita);
			
		return 1 + (aux_esquerdo > aux_direito ? aux_esquerdo : aux_direito);
	}
	
	
	//quantidade de individuos da árvore (size)
	public int quantidade_nos(Node root) {
		if(root == null) {
			return 0;
		}
		return 1 + quantidade_nos(root.direita) + quantidade_nos(root.esquerda);		
	}
	
	
	//informa se a arvore é vazia ou não
	public boolean e_vazia(Node root) {
		if (root == null) {
			return true;
		}
		return false;
	}
	
	
	//Percusos inicio
	void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.item);
		preOrder(root.esquerda);
		preOrder(root.direita);
	}
	
	void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.esquerda);
		System.out.println(root.item);
		inOrder(root.direita);
	}
	
	void posOrder(Node root) {
		if(root == null) {
			return;
		}
		posOrder(root.esquerda);
		posOrder(root.direita);
		System.out.println(root.item);
	}

	/*não consegui!!!
	void levelOrder(Node root) {
		ArrayList<Node> level = new ArrayList<Node>();

		if(root != null) { 
			level.add(root);
			level.add(root.esquerda);
			level.add(root.direita);
		}
		
		for(int i = 0; i < level.size(); ++i) {
			System.out.println(level.get(i).item);
		}
	}*/
	
	//Percusos fim
}	

