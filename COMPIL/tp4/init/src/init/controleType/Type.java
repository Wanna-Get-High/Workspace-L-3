package init.controleType;

/** Type énuméré pour les types de données des Init
 * @author M. Nebut
 */
public class Type {
    /** Type entier. */
    public static Type ENTIER = new Type("ENTIER");
    /** Type booléen. */
    public static Type LISTE = new Type("LISTE");
    /** Type programme */
    public static Type PROGRAMME = new Type("PROGRAMME");

    // version imprimable de ce type
    private String nom;

    // constructeur initialisant le nom du type
    private Type (String s) {
	this.nom = s;
    }

    /** Retourne une version imprimable de ce type. 
     * @return une version imprimable de ce type 
     */
    public String toString() {
	return this.nom;
    }
    
}