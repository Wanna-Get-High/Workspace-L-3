#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>


#define DEFAULT_LINE_SIZE 100

typedef struct list {
	char* line;
	int size;
	int index; } buffer;

typedef struct list2 {
		buffer** lines;
		int size;
		int index; } master_buffer;

buffer* new_buffer(){
	buffer* result = (buffer*)malloc(sizeof(buffer));
	result->size = DEFAULT_LINE_SIZE;
	result->line = (char*)malloc(result->size*sizeof(char));
	result->index = 0;
	return result;
}

void realloc_line(buffer* line){
	char* result;
	line->size *= 2;
printf("size	%d\n",line->size);
	result = realloc(line->line,line->size*sizeof(char));
	if (result == NULL){
		printf("ERROR REALLOC\n");
		exit(EXIT_FAILURE);
	}
	line->line = result;
}

master_buffer* new_master_buffer(int size){
	int index;
	master_buffer* result = (master_buffer*)malloc(sizeof(master_buffer));
	result->lines = (buffer**) malloc(size*sizeof(buffer*));
	for ( index = 0 ; index < size ; index ++) result->lines[index] = new_buffer();
	result->index = 0;
	result->size = size;
	return result;
}

void knuckle(char* file_name,int size){
	FILE* myfile;
	int number_of_line = 0;
	int line_to_begin;
	char current;

	myfile = fopen(file_name,"r");

	while((current = fgetc(myfile)) != EOF){
		if(current == '\n') number_of_line++;
	}

	fclose(myfile);
	/*printf("number of lines %d\n",number_of_line);*/
	line_to_begin = number_of_line - size;
	number_of_line = 0;


	myfile = fopen(file_name,"r");
	if (myfile == NULL)
	{
		printf("Error : %s : no such file \n",file_name);
		exit(EXIT_FAILURE);
	}

	while((current = fgetc(myfile)) != EOF){
		if(current == '\n') number_of_line++;
		if(line_to_begin<=number_of_line) printf("%c",current);
	}
	fclose(myfile);
}


void tail(char* file_name, int size)
{
	master_buffer* lines = new_master_buffer(size);

	/* char buffer[10][DEFAULT_LINE_SIZE]; */
    	FILE* myfile;
	int i;

    	myfile = fopen(file_name,"r");
	if (myfile == NULL)
	{
		printf("Error : %s : no such file \n",file_name);
		exit(EXIT_FAILURE);
	}

	/* count the number of lines and stock all in the buffer */
	/* problem :  it wont print them in the right place (*) */
	while (!feof(myfile)){
		/* we read only one line per iteration */
		int index;
		char * read;
		index = lines->index;
		(lines->lines[lines->index])->index = 0;
		read = fgets(((lines->lines[lines->index])->line)+((lines->lines[lines->index])->index),(lines->lines[lines->index])->size,myfile);
		while (!feof(myfile) && (strlen(read) == (lines->size)-1) && read[lines->size-2] != '\n'){
			/* haven't reach the end of the line, but the buffer is full */
			realloc_line(lines->lines[index]);
			/* read til we reach the end of the line */
			read = fgets(((lines->lines[lines->index])->line)+((lines->lines[lines->index])->index),lines->size,myfile);
			if(read == NULL) printf("ERROR fgets2\n");
		}
		lines->index = (lines->index+1)%lines->size;
	}

	/* lines->index--;  because the index is incremented one more time than it has to be */

    	lines->index--;

	for (i = 0; i< lines->size ; i++)
	{
		/* (*) so i add the index % 10 to be sure it will be printed in the right place*/
		int index = (i+lines->index)%lines->size;
		printf("%s",lines->lines[index]->line);
	}

    fclose(myfile);
}

int main(int argc, char** argv)
{
	if (argc < 3)
	{
		printf("usage : %s <file_name> <number of lines>\n",argv[0]);
		exit(EXIT_FAILURE);
	}
	else
	{
		/* uncomment the next line to test the first (bad) version of tail */
		/* knuckle(argv[1],atoi(argv[2])); */
		tail(argv[1],atoi(argv[2]));
	}

	exit(EXIT_SUCCESS);
}
