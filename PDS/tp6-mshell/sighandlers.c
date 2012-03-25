/* ------------------------------
   $Id: sighandlers.c,v 1.1 2005/03/17 13:00:46 marquet Exp $
   ------------------------------------------------------------

   mshell - a job manager
   
*/

#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <signal.h>
#include <sys/wait.h>
#include <errno.h>
#include <unistd.h>



#include "jobs.h"
#include "common.h"
#include "sighandlers.h"

/*
 * Signal - wrapper for the sigaction function
 */
int signal_wrapper(int signum, handler_t *handler)
{
    struct sigaction sa;
 	sa.sa_handler = handler;
 	sigemptyset(&sa.sa_mask);
 	sa.sa_flags = SA_RESTART; /*SA_SIGINFO*/
 	if(sigaction(signum,&sa,NULL)<0) unix_error("signal_wrapper");
 
 	return 1;
}


/* 
 * sigchld_handler - The kernel sends a SIGCHLD to the shell whenever
 *     a child job terminates (becomes a zombie), or stops because it
 *     received a SIGSTOP or SIGTSTP signal. The handler reaps all
 *     available zombie children
 */
void sigchld_handler(int sig)
{
	struct job_t* job;
	int status, pid;

    if (verbose) printf("sigchld_handler: entering\n");

	if ((pid = waitpid(-1,&status,WNOHANG | WUNTRACED)) == -1)
		pid = jobs_fgpid();
		
    if (pid > 0)
    {
    	job = jobs_getjobpid(pid);
		if (WIFSTOPPED(status))
		{
			job->jb_state = ST;
			printf("[%d] (%d) : Stopped\n",job->jb_jid,job->jb_pid);
		}
		else if (WIFEXITED(status))
		{
			printf("[%d] (%d) : Exited\n",job->jb_jid,job->jb_pid);
			jobs_deletejob(pid);
		}
		else if (WIFSIGNALED(status))
		{
			printf("[%d] (%d) : Exited by User\n",job->jb_jid,job->jb_pid);
			jobs_deletejob(pid);
		}
		else
		{
			printf("Error on : [%d] (%d)  - %s \n",job->jb_jid,job->jb_pid,job->jb_cmdline);
		}
    }
    
    if (verbose) printf("sigchld_handler: exiting\n");
    
    return;
}

/* 
 * sigint_handler - The kernel sends a SIGINT to the shell whenver the
 *    user types ctrl-c at the keyboard.  Catch it and send it along
 *    to the foreground job.
 */
void sigint_handler(int sig) 
{
	int pid;
	
    if (verbose) printf("sigint_handler: entering\n");

    if ((pid = jobs_fgpid()))
	    kill(pid,sig);	/* sig or SIGINT */

    if (verbose) printf("sigint_handler: exiting\n");
    
    return;
}

/*
 * sigtstp_handler - The kernel sends a SIGTSTP to the shell whenever
 *     the user types ctrl-z at the keyboard. Catch it and supid : 6031, getpid 6030
spend the
 *     foreground job by sending it a SIGTSTP.  
 */
void sigtstp_handler(int sig)
{
	int pid;

    if (verbose) printf("sigtstp_handler: entering\n");
	;
	
    if ((pid = jobs_fgpid()))
    	kill(pid,SIGSTOP); /* sig or SIGTSTP */

    if (verbose) printf("sigtstp_handler: exiting\n");
    
    return;
}
