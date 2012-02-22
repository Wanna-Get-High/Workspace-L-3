accoler([],L,L).
accoler([T|Q],L2,[T|L3]) :- accoler(Q,L2,L3).

prefixe(P,L) :- accoler(P,_,L).

suffixe(S,L) :- accoler(_,S,L).

sous_liste(SL,L) :- suffixe(S,L) , prefixe(SL,S).


inv([],[]).
inv([T|Q],R) :- inv(Q,InvQ) , accoler(InvQ,[T],R).


accInv([T|Q],A,R) :- accInv(Q,[T|A],R).
accInv([],A,A).
inverser(L,R) :- accInv(L,[],R).


long([],0).
long([_|L],N) :- long(L,V),N is V+1.

accLong([],Acc,Acc).
accLong([_|L],AccV,Res) :- AccN is AccV + 1, accLong(L,AccN,Res).
longueur(Liste,Res) :- accLong(Liste,0,Res).

ajouteUnNRT([], []).
ajouteUnNRT([H|T], [H1|T1]) :- ajouteUnNRT(T, T1), H1 is H+1.

ajouteUnRT([], []).
ajouteUnRT([H|T], [H1|T1]) :- H1 is H+1, ajouteUnRT(T, T1).

accMax([], A, A).
accMax([H|T], A, Max) :- H > A,  accMax(T, H, Max).
accMax([H|T], A, Max) :- H =< A, accMax(T, A, Max).

accMin([], A, A).
accMin([H|T], A, Min) :- H =< A,  accMin(T, H, Min).
accMin([H|T], A, Min) :- H > A, accMin(T, A, Min).
min(L,X) :- accMax(L,0,Max), accMin(L,Max,X), !.

multiScal(_,[], []) :- !.
multiScal(X,[H|T], [H1|T1]) :- H1 is H*X, multiScal(X, T, T1).

