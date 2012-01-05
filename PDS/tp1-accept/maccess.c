#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <limits.h>
#include <unistd.h>
#include <errno.h>


int main (int argc, char** argv)
{
	int i;
	int error;
	int flags = 0<<3;
	char* file = NULL;
	
	if (argc < 3)
	{
		printf("ERROR : usage : ./maccept <option(s)> <file>\n");
		exit(EXIT_FAILURE);
	}
	
	for (i=1;i<argc;i++)
	{
		if (argv[i][0] == '-')
		{
			if (strcmp(argv[i],"-r") == 0)
			{
				flags |= R_OK << 1; /* 1000 */
			} 
			else if (strcmp(argv[i],"-w") == 0)
			{
				flags |= W_OK << 1;	/* 0100 */
			}
			else if (strcmp(argv[i],"-x") == 0)
			{
				flags |= X_OK << 1;	/* 0010 */
			}
			else if (strcmp(argv[i],"-v") == 0)
			{
				flags |= 1;			/* 0001 */
			}
			else
			{
				printf("the option  %s  doesn't exist.\n",argv[i]);
				printf("The only possible otions are :  -r (read)\n");
				printf("								-w (write)\n");
				printf("								-x (execute)\n");
				printf("								-v (verbose)\n");	
				exit(EXIT_FAILURE);
			}
		}
		else
		{
			file = argv[i];
		}

	}
	
	if (file == NULL)
	{
		printf("ERROR : no file name \n");
		printf("ERROR : usage : ./maccept <option(s)> <file>\n");
		exit(EXIT_FAILURE);
	}
	
	error = access(file,flags>>1);

	else if ((flags & 1 << 1))
	{
		
	} 
	
	
	return error;
}
