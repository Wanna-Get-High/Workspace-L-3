package init.testeurs;

import init.analyseurs.*;
import org.antlr.runtime.*;

import java.io.*; 

/** Classe de test (test positifs) pour 
 * l'analyseur syntaxique. 
 * @author M. Nebut 08/07 revu 09/09
 */
public class TesteurPositifAnalyseurSyntaxique {

    public static void main(String[] args) throws Exception {	
	if (args.length != 1)
            System.out.println("Attention: un fichier est attendu.");
	new TesteurPositifAnalyseurSyntaxique().run(args);
    }


    public void run(String[] args) throws Exception {
	CharStream flotLecture = obtenirFlotDepuisFichierOuEntreeStandard(args);
	InitLexer scanner = construireAnalyseurLexical(flotLecture);
        CommonTokenStream tokens = new CommonTokenStream(scanner);
	InitParser parser = new InitParser(tokens);
	
	parser.axiome();
	if (! parser.erreur)
	    indiquerVerdictPositif();
	else
	    indiquerVerdictNegatif();
    }

    private CharStream obtenirFlotDepuisFichierOuEntreeStandard (String[] argsLigneCommande) 
	throws FileNotFoundException, IOException {

	if (argsLigneCommande.length == 0)
	    return new ANTLRInputStream(System.in);
	return new ANTLRFileStream(argsLigneCommande[0]);
    }

    private InitLexer construireAnalyseurLexical(CharStream flot) {
	return new InitLexer(flot);
    }    

    private void indiquerVerdictPositif() {
	System.out.println("Test positif OK");
    }

    private void indiquerVerdictNegatif() {
	System.out.println("Test positif KO");
    }


}