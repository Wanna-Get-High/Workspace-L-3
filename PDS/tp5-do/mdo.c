#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include "makeargv.h"

int mdo(char* argv)
{
	int status;
	pid_t pid;
	pid = fork();
	
	if (pid == -1) 
	{   /* erreur */
        perror("erreur fork\n");
        exit(EXIT_FAILURE); /* 1 */
    } 
    else if (!pid)
    {  	/* fils */
    	char **cmdargv;
		makeargv(argv, " \t", &cmdargv);
    	execvp(cmdargv[0], cmdargv);
    	freeargv(cmdargv);
		printf("error the command \"%s\" doesn't exist \n",argv);
		exit(EXIT_FAILURE); /* 1 */
    }

	waitpid(pid,&status,0); /* on attend le code de retour du fils pour continuer*/
	
	if (WIFEXITED(status)) /* si le processus du fils s'est fini correctement */			
		return WEXITSTATUS(status)==0?0:1; /* si le code de retour du processus du fils indique qu'il s'est fini correctement */
	
	return 1; /* failure */
}

void usage(char* arg)
{
	printf("\n");
	printf("\tusage : %s [-and|-or] command [command|...]\n",arg);
	printf("\n");
}


int main(int argc,char** argv)
{	
	char** arg = (char**) malloc(sizeof(char*)*argc);
	int i;
	int index = 0;
	int result;
	int and_or = 0;
	if (argc < 2)
	{
		usage(argv[0]);
		exit(EXIT_FAILURE);
	}
	
	for (i=1;i<argc;i++)
	{
		if (argv[i][0] == '-')
		{
			if (strcmp(argv[i],"-or") == 0)
			{
				and_or = 1;
			}
			else if (strcmp(argv[i],"-and") != 0)
			{
				usage(argv[0]);
				exit(EXIT_FAILURE);
			}
		}
		else
		{
			arg[index++] = argv[i];
		}
	}

	if (index == 0) /* si il m'y a pas de commande a lancer*/
	{
		usage(argv[0]);
		exit(EXIT_FAILURE);
	}
		
	result = mdo(arg[0]);

	for (i=1;i<index;i++)
	{
		/* il faut inverser & et | pour que cela coresponde au retour : 0 = success et non 1 = success */
		if (and_or)	result &= mdo(arg[i]);
		else 		result |= mdo(arg[i]);
	}

	if (result == 0)	printf("class la bite\n");
	else 				printf("pas class la bite\n");
	
	free(arg);
	return result;
}
