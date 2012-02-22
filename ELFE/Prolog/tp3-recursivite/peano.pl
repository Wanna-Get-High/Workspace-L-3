entier(zero).
entier(succ(X)) :- entier(X).

inf_ou_egal(zero,X) :- entier(X).
inf_ou_egal(succ(X),succ(Y)) :- inf_ou_egal(X,Y).

add(zero,X,X) :- entier(X).
add(X,zero,X) :- entier(X).
add(succ(X),succ(Y),succ(succ(Z))) :- add(X,Y,Z).

sub(X,zero,X) :- entier(X).
sub(succ(X),succ(Y),Z) :- sub(X,Y,Z).

mult(zero,X,zero) :- entier(X).
mult(X,zero,zero) :- entier(X).
mult(succ(X),Y,T) :- mult(X,Y,Z) , add(X,Z,T).
mult(X,succ(Y),T) :- mult(X,Y,Z) , add(Y,Z,T).
