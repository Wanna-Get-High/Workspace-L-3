#include <sys/wait.h>
#include "graphe.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* Necessaire pour la macro WEXITSTATUS */

void parcourLarg(tGraphe graphe, tNomSommet som) 
{
	int nb_sommet, i, j, nb_successeur;
	tNomSommet origine;
	tNomSommet destination;

	/* on recupere le nombre de sommet du graphe*/
	nb_sommet = grapheNbSommets(graphe); 
	
	if (grapheEstOriente(graphe))
	{
	}
	else
	{
	}
	
}

int main(int argc, char** argv)
{
	if (argc<3)
    	halt("Usage : %s FichierGraphe\n", argv[0]);

	/* creation du graph et allocation memoire */
	tGraphe graphe = grapheAlloue();
	
	/* on charge dans le graphe le fichier passer en param et on init le 1er sommet pour le parcour*/
	grapheChargeFichier(graphe,argv[1]);
	tNomSommet first = argv[2];
	
	parcourLarg(graphe,first);
	
	/* on free le graphe */
	grapheLibere(graphe);
	return 1;
}
