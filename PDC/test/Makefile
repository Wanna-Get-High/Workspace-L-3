CC	= gcc -ansi -pedantic
CFLAGS = -Wall -Werror
CFLAGS += -g

tests: tests.o 
	$(CC) $(CFLAGS) tests.c -o tests

all: tests

.PHONY: clean realclean
clean:
	 rm *.o
realclean : clean 
	rm tests
