#include <sys/wait.h>
#include "graphe.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* Necessaire pour la macro WEXITSTATUS */


void graphe_eulerien(tGraphe graphe)
{
	int i;
	int nb_sommet = grapheNbSommets(graphe);
	
	for (i=0;i<nb_sommet;i++)
	{
		
	}
}


void graphe2visu(tGraphe graphe, char* outfile) 
{
	FILE *fic; /* le fichier .dot dan lequel on va ecrire*/
	char commande[80]; /* la commande appeller par sprintf plus bas */
	char dotfile[80]; /* le fichier dot pour creer le ps */
	
	int nb_sommet, i, j, nb_successeur, ret;
	tNomSommet origine;
	tNomSommet destination;
	
	int premiers = 2;
	
	/* on va creer un fichier pour graphviz, dans le fichier "outfile".dot */
	strcpy(dotfile, outfile);
	strcat(dotfile, ".dot");
	
	/* on ouvre le fichier .dot en ecriture */
	fic = fopen(dotfile, "w");

	if (fic==NULL) 
		halt("Ouverture du fichier %s en ecriture impossible\n", dotfile);

	/* on recupere le nombre de sommet du graphe*/
	nb_sommet = grapheNbSommets(graphe);
	
	
	fprintf(fic, "graph {\n"); /* graph pour non oriente */
	for (i=0; i<nb_sommet;i++)
	{
		/* on recupere le nb de voisin du sommet*/
		nb_successeur = grapheNbVoisinsSommet(graphe,i);
		for (j=0;j<nb_successeur;j++)
		{
			/* on recupere le nom du sommet i et on le stock dans la variable origine */
			grapheRecupNomSommet(graphe,i,origine);
			/* on recupere le nom du voisin j du sommet i et on le stock dans la variable destination*/
			grapheRecupNomSommet(graphe,grapheVoisinSommetNumero(graphe,i,j),destination);
			
			/* -- pour non oriente*/
			if (nb_successeur%2 == 0)
			{
				fprintf(fic, "\t%s [color=blue]\n", origine);
			}
			else
			{
				if (premiers > 0)
				{
					fprintf(fic, "\t%s [color=green]\n", origine);
				}
				else
				{
					fprintf(fic, "\t%s [color=red]\n", origine);
				}				
			}
			
			if (strcmp(origine, destination) < 0)
				fprintf(fic, "\t%s -- %s;\n", origine, destination);
			
		}
		premiers--;
	}
	fprintf(fic, "}");

	
	fclose(fic);
	
	/* on stock dans commande la commande qui permet a partir d'un .dot de creer un .ps*/
	sprintf(commande, "dot -Tps %s -o %s.ps", dotfile, outfile);
	/* on appelle la fonction stocker dans commande */
	ret = system(commande);
	
	if (WEXITSTATUS(ret)) 
		halt("La commande suivante a echoue \n%s\n", commande);
}

int main(int argc, char** argv)
{
	if (argc<2)
    	halt("Usage : %s FichierGraphe\n", argv[0]);

	/* creation du graph et allocation memoire */
	tGraphe graphe = grapheAlloue();
	/* creation du fichier grp (argv[1] ne doi pas contenir l'extention) */
	char grpfile[80] = "";
	strcat(grpfile,argv[1]);
	strcat(grpfile,".grp");
	
	/* on charge dans le graphe le fichier passer en param */
	grapheChargeFichier(graphe,grpfile);
	
	/* on appelle la methode ki creer le .ps apartir du .grp en passant par un .dot */
	graphe2visu(graphe,argv[1]);
	
	/* on free le graphe */
	grapheLibere(graphe);
	return 1;
}
