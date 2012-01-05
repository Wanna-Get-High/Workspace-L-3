#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "graphe.h"


/* gestion des couleurs */
typedef enum {ROUGE=0, VERT=1, BLEU=2} tCouleur;
typedef tCouleur tTabCouleur[MAX_SOMMETS];



//////////////////////////////////////////////////////////////
// NE PAS MODIFIER
//////////////////////////////////////////////////////////////
/*
 Parcours profondeur oriente naif
 
 Entree :
 - graphe : un graphe oriente
 - tabCouleurs : un tableau de couleurs
 - s : le sommet de depart du parcours
 - indice : indice dans le tableau tabTri a partir duquel on remplit
 
 Sortie :
 - Renvoie l'indice precedent le dernier sommet ajoute dans le tableau
 
 Methode :
 - parcourt tous les sommets accessibles de s et les stocke
 dans tabTri en faisant varier l'indice de maniere decroissante.
 Un sommet est memorise dans tabTri lorsqu'il passe en rouge.
 
 */
int parcoursProfondeurOriente(tGraphe graphe, tCouleur tabCouleurs[MAX_SOMMETS], tNumeroSommet s, tNumeroSommet tabTri[MAX_SOMMETS], int indice)
{
    /* declaration */
    tPileSommets pile;
    tNumeroSommet x,y;
    int i;
    int trouve;
    
    /* initialisation */
    
    // la coloration des sommets en bleu doit se faire a l'exterieur de la fonction
    
    // vider la pile
    pile = pileSommetsAlloue();
    // colorier s en vert
    tabCouleurs[s] = VERT;
    // empiler s
    pileSommetsEmpile(pile, s);
    
    /* boucle principale */
    
    // tant que la pile n'est pas vide
    while (!pileSommetsEstVide(pile))
    {
        // depiler le sommet de la pile et le ranger dans x
        x = pileSommetsTete(pile);
        // chercher si x a un successeur bleu, si oui le ranger dans y
        trouve = 0;
        i = 0;
        while ( (!trouve) && (i<grapheNbSuccesseursSommet(graphe,x)))
        {
            y = grapheSuccesseurSommetNumero(graphe, x, i);
            if (tabCouleurs[y] == BLEU) 
                trouve = 1;
            else
                i++;
        }
        // si x a un successeur bleu
        if (trouve)
        {
            // colorier y en vert, et l'empiler
            tabCouleurs[y] = VERT;
            pileSommetsEmpile(pile, y);
        }
        else // x n'a pas de successeur bleu
        {
            // colorier x en rouge
            tabCouleurs[x] = ROUGE;
            // depiler x
            x = pileSommetsDepile(pile);
            // ajouter le sommet au tableau
            tabTri[indice] = x;
            // mettre a jour l'indice
            indice--;
        }
    }
    return indice;  
}
//////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////
// NE PAS MODIFIER
//////////////////////////////////////////////////////////////
/*
 Tri topologique
 
 Entree :
 - graphe : un graphe oriente
 
 Sortie :
 - tabTri : un tableau dont les sommets sont tries topologiquement
 
 */
void triTopologique(tGraphe graphe, tNumeroSommet tabTri[MAX_SOMMETS])
{
    /* declaration */
    tCouleur tabCouleurs[MAX_SOMMETS];
    int i;
    int indice;
    int estBleu;
    
    /* graphe oriente */
    if (!grapheEstOriente(graphe)) 
        halt("Le tri topologique n'a de sens que pour un graphe oriente");
    
    /* remplissage des sommets en bleu */
    for(i=0;i<MAX_SOMMETS;i++)
    {
        tabCouleurs[i] = BLEU;
    }
    
    indice = grapheNbSommets(graphe) - 1;
    while (indice != -1)
    {
        /* on cherche un sommet bleu, qui doit exister car indice !=-1 */
        estBleu = 0;
        i=0;
        while ( (!estBleu) && (i <grapheNbSommets(graphe)) )
        {
            if (tabCouleurs[i]==BLEU)
                estBleu=1;
            else
                i++;
        }
        if (i>=grapheNbSommets(graphe))
            halt("Bug !\n");
        
        /*  on lance le parcours depuis l'indice */
        indice = parcoursProfondeurOriente(graphe, tabCouleurs, i, tabTri, indice);
    }
}
//////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////
// A COMPLETER
//////////////////////////////////////////////////////////////
/*
 Recherche du prececesseur du sommet x tel que pi(x) soit minimal
 
 Entree :
 - graphe : un graphe oriente
 - x : le sommet dont on doit chercher le meilleur predecesseur
 - tabPi : les valeurs de pi connues (sommets avant x dans l'ordre topologique)
 - tabAccessibles : les sommets accessibles connus (sommets avant x dans l'ordre topologique)
 
 Sortie :
 - Retourne le prececesseur de x tel que pi(x) soit minimal s'il existe, sinon -1
 
 */
int recherchePredPiMinimal(tGraphe graphe, tNumeroSommet x, tValeurArc tabPi[MAX_SOMMETS], int tabAccessibles[MAX_SOMMETS])
{
	int i;
	tValeurArc min = tabPi[0];
	
	for (i=1; i< nbSomet(graphe); i ++)
	{
		if 
	}
		
    // A COMPLETER ...

}
//////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////
// A COMPLETER
//////////////////////////////////////////////////////////////
/*
 Algo Bellman
 
 Entree :
 - graphe : un graphe oriente
 - s : le sommet de depart

Sortie
 - tabPi : les valeurs de pi calculees par l'algo
 - tabPred : le predecesseur de chaque sommet (-1 si pas de predecesseur ou non accessible)
 - tabAccessibles : les sommets accessibles depuis s (-1 si non accessible)
 
 */
void algoBellman(tGraphe graphe, tNumeroSommet s, tValeurArc tabPi[MAX_SOMMETS], tNumeroSommet tabPred[MAX_SOMMETS], int tabAccessibles[MAX_SOMMETS])
{
    // A COMPLETER ...

    /* Le code commenté qui suit est suggéré, pas imposé.
     Vous pouvez l'utiliser ou l'enlever. */
    
//    tNumeroSommet tabTri[MAX_SOMMETS];
//    tNumeroSommet i;
//
//    /* tri topologique */
//    triTopologique(graphe, tabTri);
//    
//    for (i=0; i<grapheNbSommets(graphe); i++)
//    {
//        tabAccessibles[i] = 0;
//    }
//    tabPi[s] = 0.0;
//    tabPred[s] = -1;
//    tabAccessibles[s] = 1;
//
//    ...

}
//////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////
// A MODIFIER
//////////////////////////////////////////////////////////////
/*
 Affichage basique a modifier
 
 Entree :
 - graphe : un graphe oriente
 - s : le sommet de depart
 - tabPi : les valeurs de pi calculees par Belmann
 - tabPred : le predecesseur de chaque sommet (-1 si pas de predecesseur ou non accessible)
 - tabAccessibles : les sommets accessibles depuis s (-1 si non accessible)
 
 */
void affichage(tGraphe graphe, tNumeroSommet s, tValeurArc tabPi[MAX_SOMMETS], tNumeroSommet tabPred[MAX_SOMMETS], int tabAccessibles[MAX_SOMMETS])
{
    int i;
    tNomSommet nom;
    
    printf("Valeurs des sommets : \n");
    for(i=0; i<grapheNbSommets(graphe); i++)
    {
        grapheRecupNomSommet(graphe, i, nom);
        printf("- %s : ", nom);
        if ( tabAccessibles[i] )
            printf("%f", tabPi[i]);
        else
            printf("Inf");
        printf("\n");
    }

}
//////////////////////////////////////////////////////////////



//////////////////////////////////////////////////////////////
// NE PAS MODIFIER LE MAIN
//////////////////////////////////////////////////////////////
/* programme principal */
int main(int argc, char *argv[])
{
    
    tGraphe graphe;
    char *fic;
    tValeurArc tabPi[MAX_SOMMETS];
    tNumeroSommet tabPred[MAX_SOMMETS];
    int tabAccessibles[MAX_SOMMETS];
    tNumeroSommet sommetDepart;
    
    if (argc<3) 
        halt("Usage : %s <fichier_graphe> <sommet_de_depart>\n", argv[0]);
    
    fic = argv[1];
    
    graphe = grapheAlloue();
    grapheChargeFichier(graphe, fic);
    
    /* sommet de depart */
    sommetDepart = grapheChercheSommetParNom(graphe, argv[2]);
    if ( sommetDepart == -1 )
        halt("Sommet inconnu : %s\n", argv[2]);
    
    if (!grapheEstOriente(graphe))
        halt("L'algorithme de Bellman ne fonctionne que pour les graphe orientes\n");
    
    /* bellman : go */
    algoBellman(graphe, sommetDepart, tabPi, tabPred, tabAccessibles);
    
    /* affichage */
    affichage(graphe, sommetDepart, tabPi, tabPred, tabAccessibles);
    
    exit(EXIT_SUCCESS);
}
//////////////////////////////////////////////////////////////
