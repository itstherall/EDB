#include <stdio.h>
#include <stdlib.h>

//function to find what's search with key
void sequential_search (int *v , int s, int k)
{
	//creat a var tmp for the message if don't find the key
	int tmp;

	for (int i = 0; i < s ; ++i)
	{
		if(v[i] == k)
		{
			printf("Key found!\n");
			tmp = 0;
			return;
		}
		else
		{
			tmp = 1;
		}
	}

	if(tmp = 1)
	{
		printf("Don't found the key!\n");
	}
}

int main()
{
	int *vector, sizer, key;

	//get the size
	printf("What's size of vector: \n");
	scanf("%d", &sizer);

	//aloc the vector with a size:
	vector = (int *)malloc(sizer*sizeof(int));
	
	//test the alloc made with success
	if(vector == NULL)
	{
		printf("ERROR: misallocation!!!\n");
		EXIT_FAILURE;
	}

	printf("Set elements of vector: \n");
	for(int i = 0 ; i < sizer ; ++i)
	{
		scanf("%d", &vector[i]);
	}

	//get the key
	printf("What's the key u search for? \n");
	scanf("%d", &key);

	//call the function to make a search
	sequential_search(vector , sizer, key);

	return 0;
}