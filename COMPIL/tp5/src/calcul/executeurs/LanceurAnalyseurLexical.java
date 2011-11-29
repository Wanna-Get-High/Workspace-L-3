package calcul.executeurs;

import calcul.analyseurs.*;

import java.io.*;
import java_cup.runtime.*;

/** Lance l'analyseur lexical de Planning. Si un nom de
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
	Reader flotLecture = obtenirFlotDepuisFichierOuEntreeStandard(args);
	ScannerCalcul scanner = construireAnalyseurLexical(flotLecture);
	avalerSymbolesFournisParScanner(scanner);
    }

    private Reader obtenirFlotDepuisFichierOuEntreeStandard (String[] argsLigneCommande) 
	throws FileNotFoundException {

	if (argsLigneCommande.length == 0)
	    return new InputStreamReader(System.in);
	return new FileReader(argsLigneCommande[0]);
    }

    private ScannerCalcul construireAnalyseurLexical(Reader flot) {
	return new ScannerCalcul(flot);		
    }    

    private void avalerSymbolesFournisParScanner(ScannerCalcul scanner) throws Exception {
	boolean finAnalyse = false;
	Symbol symboleCourant = null;
	do {
	    symboleCourant = obtenirProchainSymbole(scanner);
	    imprimerSymboleCourant(symboleCourant);
	    finAnalyse = (symboleCourant.sym == TypeSymboles.EOF);
	} while (! finAnalyse);
    }

    private Symbol obtenirProchainSymbole(ScannerCalcul scanner) throws Exception {
	return scanner.next_token();
    }

    private void imprimerSymboleCourant(Symbol symbole) {
	System.out.println(symbole);
    }
}