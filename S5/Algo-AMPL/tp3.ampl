reset;

set PROD;
set MATIERES;
var qtes_prod {PROD} >= 0;
param prix_vente {prod} >= 0;
param stocks{MATIERES} >= 0;
param consom {MATIERS,PROD} >=0;

maximize profit :
	sum {p in PROD} prix_vente[p]*qtes_prod[p];
	
subject to stock_limite 
