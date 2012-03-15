(**
   Evaluateur de phrases pour mini CAML
   Evaluation par valeurs. Liaison dynamique.

   Necessite les modules [Lexical] et [Syntaxe].

   Compilation
   - [ocamlc -c lexical.cmo syntaxe.cmo evaluation.ml{i}]

   @author François Lepan & Benjamin Van Ryseghem
*)

(* directive pour ne pas prefixer toutes les fonctions du module 
   Syntaxe
*)
open Syntaxe

type valeur = 
    Valeur of Syntaxe.expression 
  | Liaison of (string * valeur) 
  | Aucune

and environnement = (string * valeur) list

exception Variable_non_liee of string
exception Condition_incorrecte
exception Application_impossible
exception Typage_incorrect


let rec eval_expr = fun env -> function
	| Expr_bool b -> Valeur (Expr_bool b)
  	| Expr_int n -> Valeur (Expr_int n)
  	| Expr_var v -> try Valeur (Expr_var(List.assoc v env)) with Not_found -> raise (Variable_non_liee v)
  	| _ -> Aucune

let eval = fun env p ->
  match p with
    | Decl (Decla (x,e)) -> 
      		let v = eval_expr env e in
      		((x, v)::env, Liaison (x, v))
    | Expr e -> (env, eval_expr env e)
    | Vide -> (env, Aucune)
