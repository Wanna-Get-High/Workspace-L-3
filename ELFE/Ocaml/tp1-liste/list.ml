
let rec nth liste index = 
	match (liste,index) with 
	| ([],_) -> failwith "nth : Out of bound / empty list"
	| (h::t,0) -> h 
	| (_::t,index) -> nth t (index-1)
	


let rec append l1 l2 =
	match (l1,l2) with
	| ([],l2) -> l2
	| (t::q , l2) -> t::(append q l2)
	
	
let rec flatten l1 = 
	match l1 with
	| []   -> []
	| h::t -> match h with
				| [] -> flatten t
				| h1::t1 -> h1::(flatten (t1::t))
				
				
let rec map f l = 
	match l with
	| [] -> []
	| h::t -> (f h)::(map f t)
	
let rec somme l =
	match l with
	| [] -> 0
	| h::t -> h+somme t
	
let length l = 
	somme (map (fun x -> 1) l)
	
let rec iter f v n =
	match n with
	| 0 -> []
	| _ -> v::(map f (iter f v (n-1)))
