package init.controleType;

import java.util.List;

/* 
Code très laid car la dépendance à TableSymboles n'est pas explicitée.
 */
public class ControleurType {

    private TableSymboles tableSymboles;

    public ControleurType() {
	this.tableSymboles = new TableSymboles();
    }

    public void imprimerTable() {
	System.out.println("*********\n" + this.tableSymboles);
    }

    public void typerIdentificateurCommeProgramme(String nom) {
	this.tableSymboles.ajoutIdentificateur(nom, Type.PROGRAMME);  
    } 

    public void typerIdentificateursCommeEntier(List<String> liste) throws TypeCheckingException {
	for (String nom : liste) {
	    if (this.tableSymboles.contientIdentificateur(nom))
		throw new TypeCheckingException("double declaration de " + nom);
	    this.tableSymboles.ajoutIdentificateur(nom, Type.ENTIER); 
	}
    }

    public void typerIdentificateursCommeListe(List<String> liste) throws TypeCheckingException {
	for (String nom : liste) {
	    if (this.tableSymboles.contientIdentificateur(nom))
		throw new TypeCheckingException("double declaration de " + nom);
	    this.tableSymboles.ajoutIdentificateur(nom, Type.LISTE); 
	}
    }
    
    public void verifierIdentificateurEstUnEntier(String nom) throws TypeCheckingException {
	if (! this.tableSymboles.contientIdentificateur(nom))
	    throw new TypeCheckingException(nom + " pas déclaré");
	if (this.tableSymboles.getTypeIdentificateur(nom) != Type.ENTIER)
	    throw new TypeCheckingException(nom + " pas de type ENTIER");	
    }

    public void verifierIdentificateurEstUneListe(String nom) throws TypeCheckingException {
	if (! this.tableSymboles.contientIdentificateur(nom))
	    throw new TypeCheckingException(nom + " pas déclaré");
	if (this.tableSymboles.getTypeIdentificateur(nom) != Type.LISTE)
	    throw new TypeCheckingException(nom + " pas de type LISTE");	
    }

    

}