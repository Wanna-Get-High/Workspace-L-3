reset;
param N , INTEGER, >0;

set USINES;
set QUALITES;
set SEMAINE := 1..N;;

param qte_com{QUALITES,SEMAINE} >= 0;
param cout_journ{USINES} >= 0;
param prod{QUALITES, USINES} >= 0;
param cout_stock >=0;
param stock_init{QUALITE} >=0;


var j_ouvres {USINES, SEMAINE} >= 0;
var qte_prod{QUALITE,SEMAINE}} >= 0;
var qte_vendue{QUALITE,SEMAINE}} >= 0;
var qte_stock{QUALITE,SEMAINE}} >= 0;

var frai_hebdo{SEMAINE} >=0;

minimize cout_total :
	sum {s in SEMAINE} frai_hebdo[s];
	
subject to calcule_frais_hebdo{s in SEMAINE} :
	frai_hebdo[s] = sum {u in USINES} j_ouvres[u,s]*cout_journ[u] +
					sum {q in QALITE} qte_stock[q,s]*cout_stock;

subject to calcule_qte_prod {q in QUAL,s in SEM} :
	qte_prod[q,s] = sum {u in USIN} prod[q,u]* j_ouvres[u,s];
	
subject to equa_conserv{s in SEM,q in QUAL} :
	qte_stock[q,s] + qte_prod[q,s] = qte_vendue[q,s] + qte_stock[q.next(s ni SEM)];
	
	
#var nb_j_travail {USINES} >= 0;

#minimize cout_total :
#	sum {u in USINES} cout_journ[u]*nb_j_travail[u];
		
#subject to satisfaire_demande{q in QUALITES} :
#	sum {u in USINES} prod[q,u]*nb_j_travail[u] >= qte_com[q];
	


data;
	#set QUALITES := inf moy sup;
	#set USINES := A B;
	
param : USINES : cout_journ := 
		A 			1000
		B 			2000

param : QUALITES : qte_com :=
		inf			16
		moy			5
		sup			20
		
param : prod :=
		A		8	1	2
		B		2	1	7
		
