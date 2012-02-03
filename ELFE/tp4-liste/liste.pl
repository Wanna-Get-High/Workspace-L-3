long_min_deux([_,_]).
long_min_deux([_|X]) :- long_min_deux(X).

meme_long([],[]). 
meme_long([_|X],[_|Y]) :- meme_long(X,Y).

member(X,[X]).
member(X, [H|T]) :- X \= H , member(X,T).

deuxFois([],[]).
deuxFois([H|X],[H,H|T]) :-  deuxFois(X,T).

combine1([],[],[]).
combine1([A|P],[C|D],[A,C|T]) :- combine1(P,D,T).

combine2([],[],[]).
combine2([A|P],[C|D],[[A,C]|T]) :- combine2(P,D,T).

combine3([],[],[]).
combine3([A|P],[C|D],[paire(A,C)|T]) :- combine3(P,D,T).

accoler([],L,L).
accoler([T|Q],L2,[T|L3]) :- accoler(Q,L2,L3).
