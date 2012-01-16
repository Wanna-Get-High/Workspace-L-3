employe(jean,     23, homme, 2000, ibm,   1).
employe(jacques,  32, homme, 1991, bull,  4).
employe(anne,     45, femme, 1993, bull,  3).
employe(fabienne, 30, femme, 2002, xerox, 1).
employe(eric,     49, homme, 1994, bull,  5).
employe(marc,     25, homme, 2000, xerox, 2).
employe(julie,    24, femme, 2001, ibm,   1).
employe(sonia,    35, femme, 1996, ibm,   3).
employe(franck,   45, homme, 1999, ibm,   2).
employe(odette,   40, femme, 1994, bull,  4).

salaire(ibm, 1, 2000).
salaire(ibm, 2, 3000).
salaire(ibm, 3, 4500).
salaire(ibm, 4, 5500).
salaire(ibm, 5, 7500).

salaire(bull, 1, 1600).
salaire(bull, 2, 3000).
salaire(bull, 3, 4500).
salaire(bull, 4, 6000).
salaire(bull, 5, 7500).

salaire(xerox, 1, 2500).
salaire(xerox, 2, 4500).
salaire(xerox, 3, 5500).
salaire(xerox, 4, 6000).
salaire(xerox, 5, 7000).


jeune_employe(NOM,ENTR) :- employe(NOM,AGE,_,_,ENTR,_), AGE =< 25.
cadre(NOM) :- employe(NOM,_,_,_,_,ECHELON) , ECHELON >= 3. 
collegue(NOM1,NOM2) :- employe(NOM1,_,_,_,Z,_) , employe(NOM2,_,_,_,Z,_) , NOM1 \== NOM2.
gagne_plus_que(NOM1,NOM2) :- employe(NOM1,_,_,_,ENTR1,ECH1) , salaire(ENTR1,ECH1,SALAIRE1) , employe(NOM2,_,_,_,ENTR2,ECH2) , salaire(ENTR2,ECH2,SALAIRE2) , SALAIRE1 > SALAIRE2.
