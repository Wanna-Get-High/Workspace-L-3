reset;

set USINES;
set QUALITES;

param qte_com{QUALITES} >= 0;
param cout_journ{USINES} >= 0;
param prod{QUALITES, USINES} >= 0;

var nb_j_travail {USINES} >= 0;

minimise cout_total :
	sum {U in USINES} cout_journ[u]*nb_j_travail[u];
	
subject to satisfaire_demande{q in QUALITES}
	sum {u in USINES} production[q,u]*nb_j_travail[u] >= qte_com[q];
	
data;
	#set QUALITES := inf moy sup;
	#set USINES := A B;
	
param : USINES : cout_journ := 
		A 			1000
		B 			2000

param : QUALITES : qte_com :=
		inf			16
		moy			10
		sup			20
		
param production :
	
