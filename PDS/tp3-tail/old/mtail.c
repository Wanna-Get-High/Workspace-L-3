#include <stdio.h>
#include <stdlib.h>

#define MAX_LINE_SIZE 100

void tail(char* file_name)
{
	char buffer[10][MAX_LINE_SIZE];
    FILE* myfile;
	int index = 0, i;
	
    myfile = fopen(file_name,"r");
	
	/* count the number of lines and stock all in the buffer */
    while (!feof(myfile))
    {
        fgets(buffer[index++%9],100,myfile);
        /*printf("%s\n",buffer);*/
    }
    
    
	for (i = 0; i< 10 ; i++)
	{
		printf("%s",buffer[i]);
	}
	
	printf("\n");
    /*printf("nb of line read : %d\n",nb_of_line-1);*/
    fclose(myfile);
}

int main(int argc, char** argv)
{
	if (argc < 2)
	{
		printf("usage : %s <file_name>\n",argv[0]);
		exit(EXIT_FAILURE);	
	}
	else
	{
		tail(argv[1]);
	}
	
	exit(EXIT_SUCCESS);	
}
