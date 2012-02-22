%% les employes

employe(jean, 	  23, homme, 2000, ibm,   1).
employe(jacques,  32, homme, 1991, bull,  4).
employe(anne,     45, femme, 1993, bull,  3).
employe(fabienne, 30, femme, 2002, xerox, 1).
employe(eric,     49, homme, 1994, bull,  5).
employe(marc,     25, homme, 2000, xerox, 2).
employe(julie,    24, femme, 2001, ibm,   1).
employe(sonia,    35, femme, 1996, ibm,   3).
employe(franck,   45, homme, 1999, ibm,   2).
employe(odette,   40, femme, 1994, bull,  4).

%% la grille de salaire d'ibm
salaire(ibm, 1, 2000).
salaire(ibm, 2, 3000).
salaire(ibm, 3, 4500).
salaire(ibm, 4, 5500).
salaire(ibm, 5, 7500).

%% la grille de salaire de bull
salaire(bull, 1, 1600).
salaire(bull, 2, 3000).
salaire(bull, 3, 4500).
salaire(bull, 4, 6000).
salaire(bull, 5, 7500).

%% la grille de salaire de xerox
salaire(xerox, 1, 2500).
salaire(xerox, 2, 4500).
salaire(xerox, 3, 5500).
salaire(xerox, 4, 6000).
salaire(xerox, 5, 7000).

jeune_employe(Nom, Entreprise) :- employe(Nom,Age,_,_,Entreprise,_), Age =< 25.

cadre(Nom) :- employe(Nom,_,_,_,Entreprise,Echelon), Echelon >= 3.

collegues(Nom1, Nom2) :- employe(Nom1,_,_,_,Entreprise,_), employe(Nom2,_,_,_,Entreprise,_), Nom1\==Nom2.

gagne_plus_que(Nom1, Nom2) :- employe(Nom1,_,_,_,Entreprise1,Echelon1), employe(Nom2,_,_,_,Entreprise2,Echelon2), salaire(Entreprise1,Echelon1,Salaire1), salaire(Entreprise2,Echelon2,Salaire2), Salaire1 > Salaire2.