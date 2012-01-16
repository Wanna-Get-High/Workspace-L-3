package init.executeurs;

import init.analyseurs.*;
import org.antlr.runtime.*;

import java.io.*;


/** Lance l'analyseur syntaxique de Init. Si un nom de
 * fichier est fourni, ce fichier est analysé, sinon c'est l'entrée
 * standard qui l'est.
 * @version 16/12/04 revu 09/09
 * @author M. Nebut
 */
public class LanceurAnalyseurSyntaxique {

    public static void main(String[] args) throws Exception {
	if (args.length > 1)
            System.out.println("Attention: un seul fichier pris en compte");
	new LanceurAnalyseurSyntaxique().run(args);
    }


    public void run(String[] args) throws Exception {
	CharStream flotLecture = obtenirFlotDepuisFichierOuEntreeStandard(args);
	InitLexer scanner = construireAnalyseurLexical(flotLecture);
        CommonTokenStream tokens = new CommonTokenStream(scanner);
	InitParser parser = new InitParser(tokens);
	parser.axiome();
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


}