femme(mia).
femme(jody).
femme(yolande).

hommme(vincent).
hommme(marcellus).
hommme(pierre).

aime(vincent,mia).
aime(vincent,pierre).
aime(marcellus,mia).
aime(monchou,lapin).
aime(lapin,monchou).

jaloux(X,Y) :- aime(X,Z) , aime(Y,Z) , X\=Y.

