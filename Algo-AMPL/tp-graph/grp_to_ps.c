#include "sys/wait.h"
/* N ́cessaire pour la macro WEXITSTATUS */
e
void graphe2visu(tGraphe graphe, char *outfile) {
FILE *fic;
char commande[80];
char dotfile[80]; /* le fichier dot pour cr ́er le ps */
e
/* on va cr ́er un fichier pour graphviz, dans le fichier "outfile".dot */
e
strcpy(dotfile, outfile);
strcat(dotfile, ".dot");
fic = fopen(dotfile, "w");
if (fic==NULL)
halt ("Ouverture du fichier %s en ecriture impossible\n", dotfile);
 ́
/*
on parcourt le graphe pour en tirer les informations
n ́cessaires pour graphviz.
e
Pour  ́crire dans le fichier, on utilise fprintf (qui s’utilise
e
comme printf mais on mettant en plus fic comme premier param`tre).
e
Ex :
fprint(fic, "graph {\n");
ou
fprint(fic, " %s -> %s\n", origine, destination);
*/
fclose(fic);
sprintf(commande, "dot -Tps %s -o %s", dotfile, outfile);
ret = system(commande);
if (WEXITSTATUS(ret))
halt("La commande suivante a echou ́\n%s\n", commande);
 ́
e
}

