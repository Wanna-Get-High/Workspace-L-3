#include <stdio.h>
#include <stdlib.h>
#include "qsint.h"

void swapElem(int *x,int *y)
{
   int temp;
   temp = *x;
   *x = *y;
   *y = temp;
}

void printTab(int tab[],int n)
{
   int i;
   for(i=0;i<n;i++)
      printf("%d ",tab[i]);
      
   printf("\n");
}

void quicksort_int(int tab[],int beg,int end)
{
	int piv,y,z;

	if(beg < end)
	{
		piv = tab[beg];
		y = beg;
		z = end;
		
		while(y < z)
		{
			while((y <= end) && (tab[y] <= piv)) 
				y++;
				
			while((z >= beg) && (tab[z] > piv)) 
				z--;
				
			if(y < z)
				swapElem(&tab[y],&tab[z]);
		}

		swapElem(&tab[beg],&tab[z]);
		
		quicksort_int(tab,beg,z-1);
		quicksort_int(tab,z+1,end);
	}
}



int main()
{
   int tab[TABSIZE];
   int i;
   
   for(i = 0; i < TABSIZE; i++ )
	   tab[i] = rand() % 10;
   
   printf("The list before :\n");
   printTab(tab,TABSIZE);
   
   quicksort_int(tab,0,TABSIZE-1);

   printf("The list after  :\n");
   printTab(tab,TABSIZE);
   
   return 1;
}
