/**********************************************************************
 * est_eulerien
 *
 * (LW) 
 * Time-stamp: <2011-12-05 18:37:21 weinberl>
 ***********************************************************************/

/* Ce program prend un nom de graphe en entrée, le charge,
   le graphe ne doit pas être orienté.
   et determine si le graphe est eulerien. (voir poly pour la définition)
*/

#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "sys/wait.h"
/* Nécessaire pour la macro WEXITSTATUS */

#include "graphe.h"

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

int est_eulerien(tGraphe graphe){
  int cpt ;
  int i;

  cpt=0;
  for(i=0; i < grapheNbSommets(graphe);i++) {
    if (grapheNbVoisinsSommet(graphe, i) % 2 != 0) {
      cpt++;
    }
  }	
  return ((cpt==0)||(cpt==2));
}

int main(int argc, char *argv[]) {
  tGraphe graphe;

  if (argc<1) {
    halt("Usage : %s FichierGraphe\n", argv[0]);
  }

  
  graphe = grapheAlloue();
  
  grapheChargeFichier(graphe,  argv[1]);
  if (grapheEstOriente(graphe)) {halt(" Erreur : le graphe ne doit pas être orienté\n");
  }
  
  graphe2visu(graphe,argv[1]);
  
  if (est_eulerien(graphe))
    { printf("Le graphe est eulerien\n");
    }
  else
    { printf("Le graphe n'est pas eulerien\n");
    }

  grapheLibere(graphe);

  exit(EXIT_SUCCESS);
}
