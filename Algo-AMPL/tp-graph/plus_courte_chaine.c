#include <sys/wait.h>
#include "graphe.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

tNumeroSommet* numerosParcourus;
int parcourusSize = 0;

int dejaVu(tNumeroSommet num)
{
	int i;
	for (i=0 ; i < parcourusSize ; i ++) if(numerosParcourus[i] == num) return 1;		
	return 0;
}

void plus_court(tGraphe graphe, tNomSommet dep) 
{
	int d[MAX_SOMMETS], nb_voisin;
	tNumeroSommet pred[MAX_SOMMETS];
	tNumeroSommet x;
	tFileSommets file;
	
	file = fileSommetsAlloue();
	x = grapheChercheSommetParNom(graphe, dep);
	fileSommetsEnfile(file,x);
	d[x] = 0;
	pred[x] = -1;
	
	while(!fileSommetsEstVide(file))
	{
		x = fileSommetsDefile(file);
		nb_voisin = grapheNbVoisinsSommet(graphe,x);
		
		for (i=0;i<nb_voisin;i++)
		{
			
			if (!dejaVu(grapheSuccesseurSommetNumero(graphe,x,i)))
			{
				
			}
		}
		
	}
	
	fileSommetsLibere(file);
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
	
	if (grapheEstOriente(graphe))
		halt("le graphe ne doit pas etre oriente");
		
	first = (tNomSommet*)(argv[2]);
	
	plus_court(graphe,*first);
	
	/* on free le graphe */
	grapheLibere(graphe);
	return 1;
}
