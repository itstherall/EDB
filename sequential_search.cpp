#include <iostream>

using namespace std;

//sequential search algorithm 

void seq_search(int *v , int size, int key)
{
	//creat a var temporary for know if u get the menssage if the algorithm don't find de key
	int tmp;

	for(int i = 0 ; i < size ; ++i)
	{
		if(v[i]== key)
		{
			cout << "Found the key in the vector!\n";
			tmp = 0;
			return;
		}
		else
		{
			tmp = 1;
		}
	}

	if(tmp == 1)
	{
		cout << "Don't found the key!\n";
	}
}


int main ()
{
	int *v, size, key;

	cout << "what's size of vector?\n";
	cin >> size;

	//aloc a vector with size
	v = new int[size];

	//run for the vector and get the elements
	cout << "set elements of vector: \n";
	for (int i=0 ; i < size ; ++i)
	{
		cin >> v[i];
	}	

	//take a key for search
	cout << "what's the key u looking for?\n";
	cin >> key;

	seq_search( v, size, key);

	return 0;
}
