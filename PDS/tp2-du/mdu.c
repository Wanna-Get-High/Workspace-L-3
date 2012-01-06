#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <dirent.h>

int path_size = 0;

int valid_name(const char *name)
{
	return (strcmp(name,".") != 0) && (strcmp(name,"..") != 0);
}

int du_file(const char *pathname)
{
	int stat_result;
	struct stat* file_info = 	(struct stat*) malloc(sizeof(struct stat));
	struct dirent* file_name = 	(struct dirent*) malloc(sizeof(struct dirent));
	mode_t file_mode;

	stat_result = stat(pathname, file_info);
	file_name 	= dirent
	file_mode 	= file_info->st_mode;
	
	if (S_ISREG(file_mode))
	{
		path_size += stat_result->st_size;
		printf("REG_FILE\n");
	}
	
	if (S_ISDIR(file_mode))
		path_size += stat_result->st_size;
		printf("DIR_FILE\n");
		return du_file(
		
		
	if (S_ISLNK(file_mode))
		printf("LINK_FILE\n");
	
	return 0;
	
}



int main(int argc, char** argv)
{
	if (argc < 2)
	{
		printf("at least 2 arg\n");
	}
	
	du_file(argv [1]);
		
	return 1;
}
