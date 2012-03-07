
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Nov 16 18:22:57 CET 2011
//----------------------------------------------------

package planningMaster.analyseurs;

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Nov 16 18:22:57 CET 2011
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
    "\000\015\000\002\002\004\000\002\010\002\000\002\010" +
    "\007\000\002\011\002\000\002\011\004\000\002\011\004" +
    "\000\002\011\004\000\002\002\004\000\002\005\004\000" +
    "\002\003\004\000\002\004\011\000\002\006\003\000\002" +
    "\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\006\002\000\005\004\001\002\000\004\016" +
    "\037\001\002\000\004\002\036\001\002\000\004\004\010" +
    "\001\002\000\004\006\012\001\002\000\004\012\011\001" +
    "\002\000\004\006\ufff8\001\002\000\004\015\035\001\002" +
    "\000\014\002\ufffe\005\ufffe\007\020\010\022\011\014\001" +
    "\002\000\004\020\027\001\002\000\014\002\ufffe\005\ufffe" +
    "\007\020\010\022\011\014\001\002\000\014\002\ufffe\005" +
    "\ufffe\007\020\010\022\011\014\001\002\000\006\002\000" +
    "\005\004\001\002\000\014\002\ufff6\005\ufff6\007\ufff6\010" +
    "\ufff6\011\ufff6\001\002\000\014\002\ufffe\005\ufffe\007\020" +
    "\010\022\011\014\001\002\000\014\002\ufff5\005\ufff5\007" +
    "\ufff5\010\ufff5\011\ufff5\001\002\000\006\002\ufffb\005\ufffb" +
    "\001\002\000\004\002\uffff\001\002\000\006\002\ufffc\005" +
    "\ufffc\001\002\000\006\002\ufffd\005\ufffd\001\002\000\004" +
    "\013\030\001\002\000\004\020\031\001\002\000\004\014" +
    "\032\001\002\000\004\020\033\001\002\000\004\017\034" +
    "\001\002\000\014\002\ufff7\005\ufff7\007\ufff7\010\ufff7\011" +
    "\ufff7\001\002\000\014\002\ufffa\005\ufffa\007\ufffa\010\ufffa" +
    "\011\ufffa\001\002\000\004\002\001\001\002\000\004\004" +
    "\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\006\005\005\010\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\006\001\001\000\004" +
    "\002\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\004\014\006\015\007\020\011\016" +
    "\001\001\000\002\001\001\000\012\004\014\006\015\007" +
    "\020\011\025\001\001\000\012\004\014\006\015\007\020" +
    "\011\024\001\001\000\006\005\005\010\023\001\001\000" +
    "\002\001\001\000\012\004\014\006\015\007\020\011\022" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

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


	private EcritureTexteFlot file;

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
          case 12: // grandePause ::= GRANDEPAUSE 
            {
              Object RESULT =null;
		int gpleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int gpright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		Object gp = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
				RESULT = ConstantesLatex.GRANDE_PAUSE;
			
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("grandePause",5, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // petitePause ::= PETITEPAUSE 
            {
              Object RESULT =null;
		int ppleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int ppright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		Object pp = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
				RESULT = ConstantesLatex.PETITE_PAUSE;
			
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("petitePause",4, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // entry ::= SLOT SEPARATOR NAME SEPARATOR ENTREPRISE SEPARATOR OPTIONS 
            {
              Object RESULT =null;
		int slotleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-6)).left;
		int slotright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-6)).right;
		Object slot = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-6)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)).right;
		Object name = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)).value;
		int entleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-2)).left;
		int entright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-2)).right;
		Object ent = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-2)).value;
		int optleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int optright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		Object opt = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
			RESULT = slot + ConstantesLatex.SEPARATEUR_CASE + name + ConstantesLatex.SEPARATEUR_CASE
					+ ent + ConstantesLatex.SEPARATEUR_CASE + opt + ConstantesLatex.FIN_LIGNE_TABLEAU;
		
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("entry",2, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-6)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // date ::= DATECST DATE 
            {
              Object RESULT =null;
		int dateleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int dateright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		Object date = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
			RESULT = date;
		
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("date",1, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // master ::= MASTERCST MASTER 
            {
              Object RESULT =null;
		int masterleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int masterright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		Object master = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
			RESULT = master;
		
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("master",3, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // salle ::= ROOMCST ROOM 
            {
              Object RESULT =null;
		int roomleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int roomright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		Object room = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
			RESULT = room;
		
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("salle",0, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // data ::= grandePause data 
            {
              String RESULT =null;
		int gpleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).left;
		int gpright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).right;
		Object gp = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).value;
		int dataleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int dataright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		String data = (String)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
			RESULT = (String)gp;
			if (data != null)
				RESULT+= (String)data;
		
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("data",7, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // data ::= petitePause data 
            {
              String RESULT =null;
		int ppleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).left;
		int ppright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).right;
		Object pp = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).value;
		int dataleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int dataright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		String data = (String)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
			RESULT = (String)pp;
			if (data != null)
				RESULT+= (String)data;
		
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("data",7, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // data ::= entry data 
            {
              String RESULT =null;
		int entleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).left;
		int entright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).right;
		Object ent = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).value;
		int dataleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).left;
		int dataright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()).right;
		String data = (String)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.peek()).value;
		
			RESULT = (String)ent;
			if (data != null)
				RESULT+= (String)data;
		
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("data",7, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // data ::= 
            {
              String RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("data",7, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // file ::= master date salle data file 
            {
              Object RESULT =null;
		int mastleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)).left;
		int mastright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)).right;
		Object mast = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)).value;
		int dateleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-3)).left;
		int dateright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-3)).right;
		Object date = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-3)).value;
		int salleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-2)).left;
		int salright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-2)).right;
		Object sal = (Object)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-2)).value;
		int dataleft = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).left;
		int dataright = ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).right;
		String data = (String)((java_cup.runtime.Symbol) CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-1)).value;
		
			/** .tex file */
			EcritureTexteFlot file = new EcritureTexteFlot(new java.io.FileOutputStream(mast+"_"+date+"_"+sal+".tex"));
			file.ecrire(ConstantesLatex.DEBUT_DOCUMENT);
			file.ecrire(ConstantesLatex.DEBUT_COMMANDE_MASTER + mast + ConstantesLatex.FIN_COMMANDE);
			file.ecrire(ConstantesLatex.DEBUT_COMMANDE_DATE + date + ConstantesLatex.FIN_COMMANDE);
			file.ecrire(ConstantesLatex.DEBUT_COMMANDE_SALLE + sal + ConstantesLatex.FIN_COMMANDE);
			file.ecrire(ConstantesLatex.DEFINITION_TITRE);
			file.ecrire(ConstantesLatex.DEBUT_TABLEAU);
			file.ecrire(data);
			file.ecrire(ConstantesLatex.FIN_TABLEAU);
			file.ecrire(ConstantesLatex.FIN_DOCUMENT);
			file.terminer();
		
              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("file",6, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.elementAt(CUP$ParserPlanning$top-4)), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // file ::= 
            {
              Object RESULT =null;

              CUP$ParserPlanning$result = parser.getSymbolFactory().newSymbol("file",6, ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserPlanning$stack.peek()), RESULT);
            }
          return CUP$ParserPlanning$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= file EOF 
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
