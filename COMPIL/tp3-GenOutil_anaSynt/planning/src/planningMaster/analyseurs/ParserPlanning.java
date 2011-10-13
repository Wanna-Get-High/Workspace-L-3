
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Oct 10 14:55:55 CEST 2011
//----------------------------------------------------

package planningMaster.analyseurs;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Oct 10 14:55:55 CEST 2011
  */
public class ParserPlanning extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserPlanning() {super();}

  /** Constructor which sets the default scanner. */
  public ParserPlanning(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserPlanning(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\004\000\002\011\002\000\002\011" +
    "\007\000\002\010\002\000\002\010\004\000\002\010\004" +
    "\000\002\010\004\000\002\002\004\000\002\005\004\000" +
    "\002\003\004\000\002\004\007\000\002\004\011\000\002" +
    "\006\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\006\002\000\005\004\001\002\000\004\016" +
    "\042\001\002\000\004\004\011\001\002\000\004\002\007" +
    "\001\002\000\004\002\001\001\002\000\004\006\013\001" +
    "\002\000\004\012\012\001\002\000\004\006\ufff8\001\002" +
    "\000\004\015\041\001\002\000\014\002\ufffe\005\ufffe\007" +
    "\020\010\023\011\015\001\002\000\004\020\030\001\002" +
    "\000\014\002\ufffe\005\ufffe\007\020\010\023\011\015\001" +
    "\002\000\014\002\ufffe\005\ufffe\007\020\010\023\011\015" +
    "\001\002\000\014\002\ufff5\005\ufff5\007\ufff5\010\ufff5\011" +
    "\ufff5\001\002\000\006\002\000\005\004\001\002\000\014" +
    "\002\ufffe\005\ufffe\007\020\010\023\011\015\001\002\000" +
    "\014\002\ufff4\005\ufff4\007\ufff4\010\ufff4\011\ufff4\001\002" +
    "\000\006\002\ufffb\005\ufffb\001\002\000\004\002\uffff\001" +
    "\002\000\006\002\ufffc\005\ufffc\001\002\000\006\002\ufffd" +
    "\005\ufffd\001\002\000\006\013\032\020\031\001\002\000" +
    "\004\020\037\001\002\000\004\020\033\001\002\000\004" +
    "\014\034\001\002\000\004\020\035\001\002\000\004\017" +
    "\036\001\002\000\014\002\ufff6\005\ufff6\007\ufff6\010\ufff6" +
    "\011\ufff6\001\002\000\004\017\040\001\002\000\014\002" +
    "\ufff7\005\ufff7\007\ufff7\010\ufff7\011\ufff7\001\002\000\014" +
    "\002\ufffa\005\ufffa\007\ufffa\010\ufffa\011\ufffa\001\002\000" +
    "\004\004\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\006\005\004\011\005\001\001\000\002\001" +
    "\001\000\004\003\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\002\013\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\004\015\006\016" +
    "\007\021\010\020\001\001\000\002\001\001\000\012\004" +
    "\015\006\016\007\021\010\026\001\001\000\012\004\015" +
    "\006\016\007\021\010\025\001\001\000\002\001\001\000" +
    "\006\005\004\011\024\001\001\000\012\004\015\006\016" +
    "\007\021\010\023\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserPlanning$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserPlanning$actions(this);
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
    return action_obj.CUP$ParserPlanning$do_action(act_num, parser, stack, top);
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
class CUP$ParserPlanning$actions {
  private final ParserPlanning parser;

  /** Constructor */
  CUP$ParserPlanning$actions(ParserPlanning parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserPlanning$do_action(
    int                        CUP$ParserPlanning$act_num,
    java_cup.runtime.lr_parser CUP$ParserPlanning$parser,
    java.util.Stack            CUP$ParserPlanning$stack,
    int                        CUP$ParserPlanning$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserPlanning$result;

      /* select the action based on the action number */
      switch (CUP$ParserPlanning$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // grandePause ::= GRANDEPAUSE 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("grandePause",5, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // petitePause ::= PETITEPAUSE 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("petitePause",4, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // entry ::= SLOT SEPARATOR NAME SEPARATOR ENTREPRISE SEPARATOR OPTIONS 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("entry",2, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-6)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // entry ::= SLOT SEPARATOR SEPARATOR SEPARATOR OPTIONS 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("entry",2, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // date ::= DATECST DATE 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("date",1, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // master ::= MASTERCST MASTER 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("master",3, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // salle ::= ROOMCST ROOM 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("salle",0, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // data ::= grandePause data 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("data",6, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // data ::= petitePause data 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("data",6, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // data ::= entry data 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("data",6, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // data ::= 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("data",6, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // prog ::= master date salle data prog 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("prog",7, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("prog",7, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).value;
		RESULT = start_val;
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserPlanning$parser.done_parsing();
          return CUP$ParserPlanning$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

