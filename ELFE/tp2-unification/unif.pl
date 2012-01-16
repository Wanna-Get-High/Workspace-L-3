unifie(A,A).

mot(astante,a,s,t,a,n,t,e).
mot(astoria,a,s,t,o,r,i,a).
mot(baratto,b,a,r,a,t,t,o).
mot(cobalto,c,o,b,a,l,t,o).
mot(pistola,p,i,s,t,o,l,a).
mot(statale,s,t,a,t,a,l,e).

motscroises(VERT1,VERT2,VERT3,HORZ1,HORZ2,HORZ3) :- mot(VERT1,_,A,_,D,_,G,_) , mot(VERT2,_,B,_,E,_,H,_) , mot(VERT3,_,C,_,F,_,I,_) 
												  , mot(HORZ1,_,A,_,B,_,C,_) , mot(HORZ2,_,D,_,E,_,F,_) , mot(HORZ3,_,G,_,H,_,I,_).
												  
												  



lex(suis,verbe).

lex(chat,nom).
lex(proute,nom).

lex(le,determinant).
lex(la,determinant).
lex(du,determinant).
