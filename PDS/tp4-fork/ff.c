#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

typedef void (*func_t) (void *);

void plop(void* mes)
{
	printf("%s\n",(char*)mes);
}

void ten_son()
{
	int i;
	pid_t pid;
	
	for (i = 0; i < 10;i++)
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

void forkfork(func_t f, void *arg)
{
    pid_t pid;
    pid = fork();
    if (pid == -1) {        /* erreur */
        perror("erreur fork");
        exit(EXIT_FAILURE);
    } else if (pid) {  /* pere */
    	int status;
        printf("je suis ton pere\n");
        waitpid(pid,&status,0);
    } else {                /* fils */
        pid  = fork();
        if (pid == -1) {        /* erreur */
		    perror("erreur fork");
		    exit(EXIT_FAILURE);
		} else if (pid) {
		    printf("je suis ton fils\n");
		    exit(EXIT_SUCCESS);
		} else {  /*petit fils*/
			while (getppid() != 1) {}
			printf("je suis ton petit-fils : ZOMBIE\n");
			f(arg);
		}
    }
}


int main (void)
{
	/*forkfork(plop,"taz ta vu boutard");*/
	ten_son();
	exit(EXIT_SUCCESS);
}
