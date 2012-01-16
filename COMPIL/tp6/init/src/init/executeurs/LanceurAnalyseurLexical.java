package init.executeurs;

import init.analyseurs.*;
import org.antlr.runtime.*;

import java.io.*;

/** Lance l'analyseur lexical de Init. Si un nom de
 * fichier est fourni, ce fichier est analysé, sinon c'est l'entrée
 * standard qui l'est.
 * @version 16/12/04 revu 09/09
 * @author M. Nebut
 */
public class LanceurAnalyseurLexical {

    public static void main(String[] args) throws Exception {
	if (args.length > 1)
            System.out.println("Attention: un seul fichier pris en compte");
	new LanceurAnalyseurLexical().run(args);
    }

    public void run(String[] args) throws Exception {
	CharStream flotLecture = obtenirFlotDepuisFichierOuEntreeStandard(args);
	InitLexer scanner = construireAnalyseurLexical(flotLecture);
	avalerSymbolesFournisParScanner(scanner);
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

    private void avalerSymbolesFournisParScanner(InitLexer scanner) throws Exception {
	boolean finAnalyse = false;
	Token symboleCourant = null;
	do {
	    symboleCourant = obtenirProchainSymbole(scanner);
	    imprimerSymboleCourant(symboleCourant);
	    finAnalyse = (symboleCourant.getType() == Token.EOF);
	} while (! finAnalyse);
    }

    private Token obtenirProchainSymbole(InitLexer scanner) throws Exception {
	return scanner.nextToken();
    }

    private void imprimerSymboleCourant(Token symbole) {
	if (symbole.getType() == Token.EOF)
	    System.out.println("<EOF>");
	else
	    System.out.println(InitParser.tokenNames[symbole.getType()]);
    }
}