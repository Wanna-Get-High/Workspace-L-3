#include <sys/wait.h>
#include "graphe.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* Necessaire pour la macro WEXITSTATUS */
tNumeroSommet* numerosParcourus;
tNumeroSommet* numerosEnfiles;
int parcourusSize = 0;
int enfilesSize = 0;
int enfilesIndex = 0;


int fileEstVide(){
	return enfilesSize == enfilesIndex;
}

int dejaVu(tNumeroSommet num){
	int i;
	for ( i = 0 ; i < parcourusSize ; i ++) if ( numerosParcourus[i] == num) return 1;		
	return 0;
}

void enfiler(tNumeroSommet num){
	if(!dejaVu(num)){
		numerosEnfiles[enfilesSize++] = num;
		numerosParcourus[parcourusSize++] = num;
	}
}

void parcourLarg(tGraphe graphe, tNomSommet som) 
{
	int nb_sommets;
	tNumeroSommet current;
	//tNomSommet destination;

	nb_sommets = grapheNbSommets(graphe); 
	numerosParcourus = (tNumeroSommet*)malloc(nb_sommets*sizeof(tNumeroSommet));
	numerosEnfiles = (tNumeroSommet*)malloc(nb_sommets*sizeof(tNumeroSommet));
	
	current = grapheChercheSommetParNom(graphe, som);
	enfiler(current);
	
	while(!fileEstVide()){
		int i, nb_successeurs;
		current = numerosEnfiles[enfilesIndex++];
		tNomSommet sommet;
		grapheRecupNomSommet (graphe, current, sommet);
		printf(" %s ",sommet);
		if (grapheEstOriente(graphe))
		{
			nb_successeurs = grapheNbSuccesseursSommet(graphe,current);
			for ( i = 0 ; i <  nb_successeurs ; i++ ){
				enfiler(grapheSuccesseurSommetNumero(graphe,current,i));
			}
		}
		else
		{
			nb_successeurs = grapheNbVoisinsSommet(graphe,current);
			for ( i = 0 ; i <  nb_successeurs ; i++ ){
				enfiler(grapheVoisinSommetNumero(graphe,current,i));
			}
		}
	}
}

int main(int argc, char** argv)
{
	tNomSommet* first;
	if (argc<3)
    	halt("Usage : %s FichierGraphe\n", argv[0]);

	/* creation du graph et allocation memoire */
	tGraphe graphe = grapheAlloue();
	
	/* on charge dans le graphe le fichier passer en param et on init le 1er sommet pour le parcour*/
	grapheChargeFichier(graphe,argv[1]);
	first = (tNomSommet*)(argv[2]);
	
	parcourLarg(graphe,*first);
	
	/* on free le graphe */
	grapheLibere(graphe);
	return 1;
}
