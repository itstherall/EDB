package pacote1;

public class Main {

	public static void main(String[] args) {
		Tree arvore = new Tree(5);
	
		arvore.adicionar_no(3);
		arvore.adicionar_no(9);
		arvore.adicionar_no(8);
		arvore.adicionar_no(2);
		
		if(arvore.contains(4)) {	System.out.println("Achou!"); }
		else {	System.out.println("Não achou!!!"); }
		
		int h;
		h = arvore.altura(arvore.raiz);
		System.out.println("altura da arvore é: " + h);
		
		//reaprovetando a variavel int h (trocar aqui depois)
		h = arvore.quantidade_nos(arvore.raiz) + 1; //como raiz chamada recursiva = 0 logo +1 para corrigir
		System.out.println("quantidade de nos(contando com a raiz): " + h);
		System.out.println();
		
		if(arvore.e_vazia(arvore.raiz)) {	System.out.println("Arvore vazia!!!");}
		
		System.out.println("Percuroso inOrder: ");
		arvore.inOrder(arvore.raiz);
		System.out.println();
		System.out.println("Percurso posOrder: ");
		arvore.posOrder(arvore.raiz);
		System.out.println();
		System.out.println("Percurso preOrder: ");
		arvore.preOrder(arvore.raiz);
		System.out.println();
		/*System.out.println("Percurso por level: ");
		arvore.levelOrder(arvore.raiz);
		System.out.println();
		*/
	}

}
