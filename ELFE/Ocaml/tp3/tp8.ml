type int_etendu = Non_defini | Int of int;;
let quotient x y =
	match (x ,y) with
	|_,0 -> Non_defini
	|_ -> Int (x/y);;
	
type liste_entiers = Vide | Cons of (int*liste_entiers) ;;	
Cons (1,Cons (2, Cons ( 3, Cons (1,Vide))));;			
			
type booleen = Vrai | Faux ;;			
let negation = function
	| Vrai -> Faux
	| _ -> Vrai ;;
	
let quotient = function
	| _, Int 0 -> Non_defini
	| Int n, Int m -> Int (n/m)
	|_ -> Non_defini;;
	
let rec longueur = function
	| Vide -> 0
	| Cons(_,l) -> 1 + longueur l;;
	
	
let somme n m = 
	match n,m with
	| Int n, Int p -> Int (n+p)
	|_ -> Non_defini;;
	
let rec rang n l =
	match n,l with
	| _,Vide -> Non_defini
	| n, Cons ( p, l) when n=p -> Int 0
	| n, Cons(_,l) -> somme (Int 1) (rang n l);;