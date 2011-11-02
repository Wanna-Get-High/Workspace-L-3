CC	= gcc -ansi -pedantic
CFLAGS = -Wall -Werror
CFLAGS += -g


qsint: qsint.o 
	$(CC) $(CFLAGS) qsint.c qsint.h -o qsint

all: qsint

.PHONY: clean realclean
clean:
	 rm *.o
realclean : clean 
	rm qsint 
 
