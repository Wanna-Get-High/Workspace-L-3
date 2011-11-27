/*****************************************************
 * Analyseur lexical pour Init version simple
 * fichier de description pour JFlex
 * produit anLexInit/ScannerInit.java
 * M. Lepan & M. Van Ryseghem
 * 2011/10/05
 ****************************************************/

/***********************************************************************
 * Première partie : code utilisateur inclus tel quel dans le fichier
 * .java généré. On met typiquement ici les déclarations de paquetage
 * (package) et les importations de classes (import).
 ***********************************************************************/

// déclaration du paquetage auquel appartient la classe générée
package calcul.analyseurs;
%%

/***********************************************************************
 * Seconde partie : options et déclarations de macros.
 ***********************************************************************/

/************************* Options **********************/

// ATTENTION : le % doit toujours être en 1ère colonne

// la classe générée implantant l'analyseur s'appelle ScannerCalcul.java
%class 
// et est publique
%public
// la cl. générée implante l'itf java_cup.runtime.Scanner fournie par Cup
%implements java_cup.runtime.Scanner
// pour utiliser les caractères unicode
%unicode
// pour garder trace du numéro de ligne du caractère traité
%line
// pour garder trace du numéro de colonne du caractère traité
%column
// l'an. lex. retourne des symboles de type java_cup.runtime.Symbol
%type java_cup.runtime.Symbol
// la fonction de l'analyseur fournissant le prochain Symbol s'appelle
// next_token...
%function next_token
// ... et lève une exception ScannerException en cas d'erreur lexicale
%yylexthrow{
	ScannerException
%yylexthrow}
// action effectuée qd la fin du fichier à analyser est rencontrée
// le type EOF est généré automatiquement par Cup
%eofval{
  return new Symbole(TypeSymboles.EOF);
%eofval}
// code recopié dans la classe générée
%{
  private Symbole creerSymbole(String representation, int type) {
    return new Symbole(representation,type,yyline,yycolumn);
  }

  private Symbole creerSymbole(String representation, int type, Object valeur) {
    return new Symbole(representation,type,valeur,yyline,yycolumn);
  }
%}

/************************* définitions macros **********************/

// une macro est une abbréviation pour une expression régulière

// syntaxe : <nom_macro> = <expr_reg>
// une macro peut être utilisée pour en définir une autre (de
// manière non récursive !) : il faut alors entourer son
// identificateur d'accolades.

endOfLine = \r|\n|\r\n // convention Java
// | est le choix des expr reg de JFlex
// \n = retour-chariot sous Unix, \r = rc sous Windows

blancs = {endOfLine} | [ \t\f]
// \t = tabulation, \f = form-feed
// [ \t\f] est une classe de caractères qui dénote soit " ", soit \t,
// soit \f



variable = [A-Za-z]+
digit = [:digit:]+

minus = '-'
plus = '+'
times = '*'
divide = '\/'

%%

/***********************************************************************/
/* Troisième partie : règles lexicales et actions. */
/***********************************************************************/

// syntaxe : { <nom_macro> | <expr_reg> } { <code_java> } un return ds
// le code Java correspond au retour d'un symbole (ici de type Symbol)
// résultat de la méthode d'analyse (ici la fonction next_token).
// S'il n'y a pas de return, on passe au symbole suivant.

{blancs} { /* on ne fait rien */ }

{minus} { // on a reconnu le mot-clé minus
  return creerSymbole("-",TypeSymboles.MINUS);
}

{plus} { // on a reconnu le mot-clé plus
  return creerSymbole("+",TypeSymboles.PLUS);
}

{times} {// on a reconnu le mot-clé times
  return creerSymbole("*",TypeSymboles.TIMES);
}

{divide} {// on a reconnu le mot-clé  divide
  return creerSymbole("/",TypeSymboles.DIVIDE);
}

{variable} {// on a reconnu le mot-clé variable
  return creerSymbole("var",TypeSymboles.VAR);
}

// on a défini tous les mot-clés qui pourraient préfixer un indentificateur :
// on définit donc maintenant seulement les identificateurs

{digit} {
	return creerSymbole("digit",TypeSymboles.DIGIT,yytext());
}

.|\n {// erreur : .|\n désigne n'importe quel caractère non reconnu
      // par une des règles précédentes
  throw new ScannerException("symbole inconnu, caractère " + yytext() +
" ligne " + yyline + " colonne " + yycolumn);
} 
