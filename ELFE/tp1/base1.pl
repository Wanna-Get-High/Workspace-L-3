


femme(mia).
femme(jody).
femme(yolande).

homme(vincent).
homme(pierre).
homme(marcellus).

aime(vincent, mia).
aime(vincent, pierre).
aime(marcellus, mia).
aime(mon_chou, lapin).
aime(lapin, mon_chou).

jaloux(X,Y):- aime(X,Z), aime(Y,Z), X\==Y.
