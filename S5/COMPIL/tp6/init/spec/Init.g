grammar Init;

// recopié en-tête parser
@header {
package init.analyseurs;
}

// recopié en-tête lexer
@lexer::header {
package init.analyseurs;
}

// code classe Parser, affreux, pour pouvoir lever une exception
// en cas d'échec (par défaut juste affichage sur System.err) 
@members {
public boolean erreur = false;
@Override
public void reportError(RecognitionException e) {
  super.reportError(e);
  this.erreur = true;
}
}

// code classe Lexer, affreux, pour pouvoir lever une exception
// en cas d'échec (par défaut juste affichage sur System.err) 
@lexer::members {
public boolean erreur = false;
@Override
public void reportError(RecognitionException e) {
  super.reportError(e);
  this.erreur = true;
}
}


// axiome est juste un nom, pas un mot-clé
axiome:  entete declaration* affectations read* error1* error2*;

entete: 'program' IDENT ';' ;

declaration: 'int' (IDENT| listId) ';' ;

listId: (IDENT ',')+ IDENT ;

read: 'read' IDENT ';' ;

affectations: error0+ affectation+|affectation*;
affectation: IDENT ':=' ENTIER ';' ;

error0: read {this.reportError(new RecognitionException());} ;
error1: ENTIER ':=' ENTIER ';' {this.reportError(new RecognitionException());} ;
error2: ';' {this.reportError(new RecognitionException());} ;

// lex

fragment LETTRE: ('a'..'z'|'A'..'Z') ;
ENTIER :   '0'..'9'+;
NEWLINE: '\r'? '\n' { skip(); } ; 
BLANCS  :   (' '|'\t')+ { skip(); } ;
IDENT : LETTRE (LETTRE|ENTIER)*;
