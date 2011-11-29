/**********************************************************************
 *testAnalyseur.c
 *
 *  (François lemaire)  <Francois.Lemaire@lifl.fr> 
 * Time-stamp: <2010-10-06 15:06:29 lemaire>
 ***********************************************************************/

/* Ce program prend un nom de graphe en entrée, le charge,
   et l'affiche de façon détaillée.
*/

#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "graphe.h"

int main(int argc, char *argv[]) 
{
	tGraphe graphe;
	tNomSommet nom_sommet;
	int nb_sommet, i;

	if (argc<2) 
	{
		halt("Usage : %s FichierGraphe\n", argv[0]);
	}
  
	graphe = grapheAlloue();
	grapheChargeFichier(graphe,argv[1]);

	nb_sommet = grapheNbSommets(graphe);
	
	printf("liste sommet qui n'ont pas de voisin : ");
	for (i=0;i<nb_sommet;i++)
	{
		if (grapheNbVoisinsSommet(graphe,i) == 0) 
		{
			grapheRecupNomSommet(graphe,i,nom_sommet);
			printf("%s ",nom_sommet);
		}
	}
	printf("\nliste sommet qui ont le plus de voisin : ");
	for (i=0;i<nb_sommet;i++)
	{
		if (grapheNbVoisinsSommet(graphe,i) == nb_sommet) 
		{
			grapheRecupNomSommet(graphe,i,nom_sommet);
			printf("%s ",nom_sommet);
		}
	}
	printf("\n");
	
	grapheLibere(graphe);
	exit(EXIT_SUCCESS);
}
