#include <iostream>

using namespace std;

//ordenação por bolha
//final da primeira varredura o ultimo elementos ser o maior!!!
void bubble(int *v, int n)
{
	//int temporario para realizar trocas caso necessario:
	int tmp, aa , bb ;

	for(aa = 0; aa < n-1; ++aa)
	{
		for( bb = 0; bb < (n-1)-aa ; ++bb)
		{
			if(v[bb] > v[bb+1])
			{
				tmp = v[bb];
				v[bb] = v[bb+1];
				v[bb+1] = tmp;
			}
		}
	}
}


int main()
{
	int *v;
	int quantidade, i;

	cout << "Entre com a quantidade de elementos: \n";
	cin >> quantidade;

	v = new int [quantidade];
	for (i = 0; i < quantidade ; ++i)
	{
		cin >> v[i];
	}

	cout << "vetor não ordenado: ";
	for (i = 0; i < quantidade ; ++i)
	{
		cout << v[i] << " ";
	}
	cout << "\n";

	bubble(v, quantidade);
	
	//imprimi vetor ordenado:
	cout << "vetor ordenado: ";
	for(i = 0 ; i < quantidade ; ++i)
	{
		cout << v[i] << " ";
	}
	cout << "\n";

	return 0;
}