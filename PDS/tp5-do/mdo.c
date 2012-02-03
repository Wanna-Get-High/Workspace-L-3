#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include "makeargv.h"

int mdo(char* argv)
{
	/*int status;*/
	pid_t pid;
	pid = fork();
	
	if (pid == -1) 
	{   /* erreur */
        perror("erreur fork\n");
        exit(EXIT_FAILURE);
    } 
    else if (!pid)
    {  	/* fils */
    	char **cmdargv;
		makeargv(argv, " \t", &cmdargv);
    	if (!execvp(cmdargv[0], cmdargv))
    	{
    		freeargv(cmdargv);
    		printf("fail to execute : %s\n",cmdargv[0]);
    		return 0;
    	}
    }
	
	/* pere */
    return 1;
}
/*
wifexit
wexitstatus
*/
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
	int result = 1;
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
			else if (strcmp(argv[i],"-and") == 0)
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

	for (i=0;i<index;i++)
	{
		/*printf("arg : %s\n",arg[i]);*/
		if (and_or) result |= mdo(arg[i]);
		else 		result &= mdo(arg[i]);
	}
	
	/*printf("%d\n",result);*/
	
	if (result)	printf("class la bite\n");
	else 		printf("pas class la bite\n");
	
	free(arg);
	return result;
}
