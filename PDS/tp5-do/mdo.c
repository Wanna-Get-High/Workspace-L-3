#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int mdo(char** argv)
{
   	int i;
	pid_t pid;
	
	for (i = 0; i < argc; i++)
	{
		pid = fork();
		if (pid == -1) 
		{   /* erreur */
            perror("erreur fork");
            exit(EXIT_FAILURE);
        } 
        else if (!pid)
        {  /* fils */
	        int compt = 0; 
        	while (compt < 5000000) compt++;
        	compt = 0;
			printf("je suis %d et je vous emmerde !\n",i);
			while (compt < 5000000) compt++;
        	exit(EXIT_SUCCESS);
        }
	}
	
	for (i=0;i<10;i++)
	{
	    int status;
    	printf("%d vient de crever comme une merde\n",waitpid(0, &status, 0));
	}
}

void usage()
{
	printf("usage : %s [-and|-or] command [command|...]");
}


int main(int argc,char** argv)
{	
	if (argc < 2)
	{
		usage();
		exit(EXIT_FAILURE);
	}
	
	char** arg = (char**) malloc(sizeof(char*)*argc);
	int i;
	int index = 0;
	int result = 0;
	int and_or = 0;
	
	for (i=1;i<argc;i++)
	{
		if (argv[1][0] == '-')
		{
			if (strcmp(argv[1],"-or") == 0)
			{
				and_or = 1;
			}
			else if (strcmp(argv[1],"-and") != 0)
			{
				usage();
				exit(EXIT_FAILURE);
			}
		}
		else
		{
			arg[index++] = argv[i];
		}
	}
	
	for (i=0;i<index-1;i++)
	{
		if (and_or)
			result |= mdo(argv[i]);
		else 
			result &= mdo(argv[i]);
	}
	
	free(arg);
	return result;
}
