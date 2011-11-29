CC	= gcc
CFLAGS = -Wall -g -std=c99
PROG = testAnalyseur testSommet

testAnalyseur: testAnalyseur.o
	$(CC) $(CFLAGS) testAnalyseur.c graphe.h graphe.c -o testAnalyseur

testSommet:testSommet.o
	$(CC) $(CFLAGS) testSommet.c graphe.h graphe.c -o testSommet

all: $(PROG)

.PHONY: clean realclean
clean:
	 rm *.o
realclean : clean
	rm $(PROG)
