set FRUIT;

# poids d'un pot de confiture (en g)
param poids >= 0;
# prix d'un pot de confiture
param prix_pot{FRUIT} >= 0;
# quantite de sucre disponible (en g)
param qte_sucre >= 0;
# quantite de fruit disponible (en g)
param qte_fruit{FRUIT} >= 0;
# proportion de sucre
param proportion{FRUIT} >= 0;

# nombre de pots a produire
var nb_pot{FRUIT} >=0;

maximize profit :
   sum{f in FRUIT} nb_pot[f]*prix_pot[f];


#subject to dix_pot_min{f in FRUIT} :
#	nb_pot[f]>=10;

subject to limitation_sucre :
   sum{f in FRUIT} proportion[f] * poids * nb_pot[f] <= qte_sucre;

subject to limitation_fruit{f in FRUIT} :
    (1 - proportion[f]) * poids * nb_pot[f] <= qte_fruit[f];


####################################################################


data;

set FRUIT := ABRICOT FRAISE FRAMBOISE;

param poids := 100;

param qte_sucre := 2200;

param qte_fruit := 
ABRICOT   5000
FRAISE    6500
FRAMBOISE 3000;

param prix_pot := 
ABRICOT   6
FRAISE    7
FRAMBOISE 6;

param proportion :=
ABRICOT   0.25
FRAISE    0.2
FRAMBOISE 0.3;
