CC	= gcc
CFLAGS = -Wall -g -std=c99
PROG = est_eulerien

est_eulerien: est_eulerien.o
	$(CC) $(CFLAGS) est_eulerien.c graphe.h graphe.c -o est_eulerien
	
all: $(PROG) 

.PHONY: clean realclean
clean:
	 rm *.o
realclean : clean
	rm $(PROG)
