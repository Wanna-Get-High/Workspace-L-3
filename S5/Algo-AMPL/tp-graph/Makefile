CC	= gcc
CFLAGS = -Wall -g -std=c99
PROG = testAnalyseur testSommet grp_to_ps parcour_larg parcour_larg_bibli plus_courte_chaine

testAnalyseur: testAnalyseur.o
	$(CC) $(CFLAGS) testAnalyseur.c graphe.h graphe.c -o testAnalyseur

testSommet:testSommet.o
	$(CC) $(CFLAGS) testSommet.c graphe.h graphe.c -o testSommet
	
grp_to_ps:grp_to_ps.o
	$(CC) $(CFLAGS) grp_to_ps.c graphe.h graphe.c -o grp_to_ps
	
parcour_larg:parcour_larg.o
	$(CC) $(CFLAGS) parcour_larg.c graphe.h graphe.c -o parcour_larg

parcour_larg_bibli:parcour_larg_bibli.o
	$(CC) $(CFLAGS) parcour_larg_bibli.c graphe.h graphe.c -o parcour_larg_bibli

plus_courte_chaine:plus_courte_chaine.o
	$(CC) $(CFLAGS) plus_courte_chaine.c graphe.h graphe.c -o plus_courte_chaine
	
all: $(PROG)

.PHONY: clean realclean
clean:
	 rm *.o
realclean : clean
	rm $(PROG)
