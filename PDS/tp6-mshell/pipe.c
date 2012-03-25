/* ------------------------------
   $Id: pipe.c,v 1.2 2005/03/29 09:46:52 marquet Exp $
   ------------------------------------------------------------

   mshell - a job manager
   
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <signal.h>
#include <sys/types.h>
#include <unistd.h>
#include <fcntl.h>

#include "pipe.h"
#include "jobs.h"
#include "cmd.h"

void eval(char *cmdline);


void do_pipe(char *cmds[MAXCMDS][MAXARGS], int nbcmd, int bg) 
{
	int i;
	int pid;
	sigset_t mask;       /* signal mask */
	int prevfd;
	prevfd = open("/dev/null", O_RDONLY);

	if(prevfd < 0) 
	{
		perror("/dev/null");
		exit(1);
	}

	for (i=0;i<nbcmd;i++)
	{
		int pipefd[2];
		printf("%s,%s\n",cmds[i][0],cmds[i][1]);
		

		if(i != nbcmd-1 && pipe(pipefd)) 
		{
			  perror("pipe");
			  break;
		}

		pid = fork();

		if (!pid)/*fils*/
		{
			dup2(prevfd, 0);
			close(prevfd);

			if(i != nbcmd-1) 
			{
				dup2(pipefd[1], 1);
				close(pipefd[0]);
				close(pipefd[1]);
			}

			/* Child unblocks signals */
			sigprocmask(SIG_UNBLOCK, &mask, NULL);
	
			/* Each new job must get a new process group ID 
			   so that the kernel doesn't send ctrl-c and ctrl-z
			   signals to all of the shell's jobs */
			if (setpgid(0, 0) < 0) 
			  unix_error("setpgid error"); 
	
			/* Now load and run the program in the new job */
			if (execvp(cmds[i][0], cmds[i]) < 0) 
			{
			  printf("%s: Command not found\n", cmds[i][0]);
			  exit(EXIT_FAILURE);
			}
		}

		close(prevfd);
		prevfd = pipefd[0];
		close(pipefd[1]);
 		jobs_addjob(pid, (bg == 1 ? BG : FG), (char*)cmds[i]);
      	sigprocmask(SIG_UNBLOCK, &mask, NULL);
      
      	if (!bg) 
			waitfg(pid);
      	else
			printf("[%d] (%d) %s\n", jobs_pid2jid(pid), (int) pid,(char*) cmds[i]);
	  }

  	return;
}
