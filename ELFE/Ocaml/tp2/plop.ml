let rec itere = 
	fun f n x -> if n=0 then 
					x
				else 
					itere f (n-1) (f x)
				

let fact n = 
	snd( itere (function(i,p) -> (i+1,p*i)) n (1,1))

let racine_de_deux n = 
	itere (function x -> x/.2. +. 1./.x) n 1.
	
	
	

