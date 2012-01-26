CC	= gcc -ansi -pedantic
CFLAGS = -Wall -Werror
CFLAGS += -g

ast: ast.o 
	$(CC) $(CFLAGS) ast.c ast.h  parse.c parse.h -o ast

all: ast

.PHONY: clean realclean
clean:
	 rm *.o
realclean : clean 
	rm ast
