
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Dec 01 01:13:15 CET 2011
//----------------------------------------------------

package calcul.analyseurs;

import java_cup.runtime.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Dec 01 01:13:15 CET 2011
  */
public class ParserCalcul extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCalcul() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCalcul(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCalcul(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\006\003\000\002\005" +
    "\003\000\002\005\004\000\002\003\006\000\002\002\003" +
    "\000\002\002\005\000\002\002\005\000\002\002\005\000" +
    "\002\002\005\000\002\002\003\000\002\002\003\000\002" +
    "\002\007\000\002\002\007\000\002\002\007\000\002\002" +
    "\007\000\002\002\005\000\002\002\005\000\002\002\005" +
    "\000\002\004\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\004\005\007\001\002\000\004\002\055\001" +
    "\002\000\006\002\uffff\005\007\001\002\000\004\002\000" +
    "\001\002\000\004\006\010\001\002\000\012\005\016\007" +
    "\011\012\013\015\012\001\002\000\012\005\034\007\011" +
    "\012\013\015\031\001\002\000\016\004\ufffc\010\ufffc\011" +
    "\ufffc\012\ufffc\013\ufffc\014\ufffc\001\002\000\012\005\016" +
    "\007\011\012\013\015\012\001\002\000\016\004\ufff7\010" +
    "\ufff7\011\ufff7\012\ufff7\013\ufff7\014\ufff7\001\002\000\014" +
    "\004\023\011\017\012\020\013\022\014\021\001\002\000" +
    "\016\004\ufff6\010\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6" +
    "\001\002\000\012\005\016\007\011\012\013\015\012\001" +
    "\002\000\012\005\016\007\011\012\013\015\012\001\002" +
    "\000\012\005\016\007\011\012\013\015\012\001\002\000" +
    "\012\005\016\007\011\012\013\015\012\001\002\000\006" +
    "\002\ufffd\005\ufffd\001\002\000\016\004\ufff9\010\ufff9\011" +
    "\ufff9\012\ufff9\013\ufff9\014\ufff9\001\002\000\016\004\ufff8" +
    "\010\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8\001\002\000" +
    "\016\004\ufffb\010\ufffb\011\ufffb\012\ufffb\013\022\014\ufffb" +
    "\001\002\000\016\004\ufffa\010\ufffa\011\ufffa\012\ufffa\013" +
    "\022\014\ufffa\001\002\000\016\004\uffee\010\uffee\011\uffee" +
    "\012\uffee\013\uffee\014\uffee\001\002\000\014\010\053\011" +
    "\ufffc\012\ufffc\013\ufffc\014\ufffc\001\002\000\014\010\052" +
    "\011\ufff7\012\ufff7\013\ufff7\014\ufff7\001\002\000\012\011" +
    "\036\012\037\013\041\014\040\001\002\000\014\010\035" +
    "\011\ufff6\012\ufff6\013\ufff6\014\ufff6\001\002\000\016\004" +
    "\uffef\010\uffef\011\uffef\012\uffef\013\uffef\014\uffef\001\002" +
    "\000\012\005\016\007\011\012\013\015\012\001\002\000" +
    "\012\005\016\007\011\012\013\015\012\001\002\000\012" +
    "\005\016\007\011\012\013\015\012\001\002\000\012\005" +
    "\016\007\011\012\013\015\012\001\002\000\014\010\043" +
    "\011\ufff9\012\ufff9\013\ufff9\014\ufff9\001\002\000\016\004" +
    "\ufff3\010\ufff3\011\ufff3\012\ufff3\013\ufff3\014\ufff3\001\002" +
    "\000\014\010\045\011\ufff8\012\ufff8\013\ufff8\014\ufff8\001" +
    "\002\000\016\004\ufff2\010\ufff2\011\ufff2\012\ufff2\013\ufff2" +
    "\014\ufff2\001\002\000\014\010\047\011\ufffb\012\ufffb\013" +
    "\022\014\ufffb\001\002\000\016\004\ufff5\010\ufff5\011\ufff5" +
    "\012\ufff5\013\ufff5\014\ufff5\001\002\000\014\010\051\011" +
    "\ufffa\012\ufffa\013\022\014\ufffa\001\002\000\016\004\ufff4" +
    "\010\ufff4\011\ufff4\012\ufff4\013\ufff4\014\ufff4\001\002\000" +
    "\016\004\ufff1\010\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1" +
    "\001\002\000\016\004\ufff0\010\ufff0\011\ufff0\012\ufff0\013" +
    "\ufff0\014\ufff0\001\002\000\004\002\ufffe\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\010\003\004\005\005\006\003\001\001\000" +
    "\002\001\001\000\006\003\004\005\053\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\002\014\004\013\001" +
    "\001\000\006\002\032\004\031\001\001\000\002\001\001" +
    "\000\006\002\027\004\013\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\002\026\004\013" +
    "\001\001\000\006\002\025\004\013\001\001\000\006\002" +
    "\024\004\013\001\001\000\006\002\023\004\013\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\002\047\004\013\001\001" +
    "\000\006\002\045\004\013\001\001\000\006\002\043\004" +
    "\013\001\001\000\006\002\041\004\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCalcul$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCalcul$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCalcul$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


 

	private boolean erreurSyntaxique;
	private String messageErreur;
	
	/** Redéfinition de la méthode parse() pour levée de 
	  * ParserException() en cas d'erreur syntaxique.
	  * @throws ParserException en cas d'erreur syntaxique.
	  */
	
	public Symbol parse() throws Exception, ParserException 
	{
		Symbol s = null;
		try {    
			s = super.parse();
		} 
		catch (Exception e) 
		{
			if (this.erreurSyntaxique)
				throw new ParserException(this.messageErreur); 
			else 
				throw e;
		}
		return s;
	} 

	/** Redéfinition de syntax_error() pour qu'elle affiche
	  * le symbole courant.
	  */
	public void syntax_error(Symbol symboleCourant) 
	{
		this.erreurSyntaxique = true;
		this.messageErreur = "erreur syntaxique sur le symbole " 
				+ ((Symbole)symboleCourant).getRepresentationTextuelle() 
				+ " ligne " + (symboleCourant.left + 1) 
				+ " colonne " + (symboleCourant.right + 1);
	}
	

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCalcul$actions {


	HashMap<String, String> affectation = new HashMap<String, String>();

  private final ParserCalcul parser;

  /** Constructor */
  CUP$ParserCalcul$actions(ParserCalcul parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCalcul$do_action(
    int                        CUP$ParserCalcul$act_num,
    java_cup.runtime.lr_parser CUP$ParserCalcul$parser,
    java.util.Stack            CUP$ParserCalcul$stack,
    int                        CUP$ParserCalcul$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCalcul$result;

      /* select the action based on the action number */
      switch (CUP$ParserCalcul$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // exprUnaire ::= MINUS expr 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = "-"+val; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("exprUnaire",2, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= PARENTHESISL VARIABLE PARENTHESISR 
            {
              Object RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object var = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		
				if (!affectation.keySet().contains(var)) throw new ParserException();
				RESULT = "("+var+")"; 
			
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= PARENTHESISL NUMBER PARENTHESISR 
            {
              Object RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int numright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object num = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		 RESULT = "("+num+")"; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= PARENTHESISL exprUnaire PARENTHESISR 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		 RESULT = "("+val+")"; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= PARENTHESISL expr DIVIDE expr PARENTHESISR 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		 RESULT = "("+val1.toString() + "/" + val2.toString()+")"; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= PARENTHESISL expr TIMES expr PARENTHESISR 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		 RESULT = "("+val1.toString() + "*" + val2.toString()+")"; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= PARENTHESISL expr PLUS expr PARENTHESISR 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		 RESULT = "("+val1.toString() + "+" + val2.toString()+")"; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= PARENTHESISL expr MINUS expr PARENTHESISR 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		 RESULT = "("+val1.toString() + "-" + val2.toString()+")"; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= VARIABLE 
            {
              Object RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int varright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object var = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 
				if (!affectation.keySet().contains(var)) throw new ParserException();
				RESULT = var; 
			
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= exprUnaire 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = val; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr DIVIDE expr 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = val1.toString() + "/" + val2.toString(); 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr TIMES expr 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = val1.toString() + "*" + val2.toString(); 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr PLUS expr 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = val1.toString() + "+" + val2.toString(); 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr MINUS expr 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = val1.toString() + "-" + val2.toString(); 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= NUMBER 
            {
              Object RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object num = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = num; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // affect ::= VARIABLE AFFECTATIONCST expr END 
            {
              Object RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).right;
		Object var = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		 
				affectation.put(var.toString(),val.toString());
				RESULT = var +":="+ val+"\n"; 
			
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("affect",1, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // listAffect ::= affect listAffect 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		int listleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int listright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object list = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = val.toString() + list.toString(); 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("listAffect",3, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // listAffect ::= affect 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 RESULT = val; 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("listAffect",3, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // file ::= listAffect 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.peek()).value;
		 System.out.println(val.toString()); 
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("file",4, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          return CUP$ParserCalcul$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= file EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)).value;
		RESULT = start_val;
              CUP$ParserCalcul$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.elementAt(CUP$ParserCalcul$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCalcul$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCalcul$parser.done_parsing();
          return CUP$ParserCalcul$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

