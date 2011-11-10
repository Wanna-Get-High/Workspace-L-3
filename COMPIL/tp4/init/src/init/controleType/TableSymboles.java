package init.controleType;
import java.util.HashMap;
import java.util.Iterator;

/** Implantation d'une table des symboles.
 * @author M. Nebut
 */
public class TableSymboles {
    // la table de hash
    private HashMap table;

    /** construit une table des symboles vide. */
    public TableSymboles() {
	this.table = new HashMap<String,Type>();
    }

    /** Ajoute une variable dont le nom est passé en paramètre dans la
     * table (sans effet si la variable y était déjà), fixe son type
     * @param nom le nom de la variable à ajouter
     * @param type le type de la variable à ajouter
     */
    public void ajoutIdentificateur(String nom, Type type) {
	if (! this.table.containsKey(nom))
	    this.table.put(nom, type);
    }

    /** Retourne vrai si la table contient la variable dont le nom est
     * passé en paramètre. 
     * @param nom le nom de la variable
     * @return vrai si la variable de nom nom est dans la table
     */
    public boolean contientIdentificateur(String nom) {
	return this.table.containsKey(nom);
    }

    /** Retourne le type de la variable dont le nom est passé en
     * paramètre, null si elle n'appartient pas à la table.
     * @param nom le nom de la variable dont on veut les attributs
     * @return le type de la variable de nom nom
     */
    public Type getTypeIdentificateur(String nom) {
	return (Type) this.table.get(nom);
    }


    /** Retourne une version imprimable de cette table. 
     * @return une version String de cette table.
     */
    public String toString() {
	Iterator<String> it = this.table.keySet().iterator();
	String res = "";
	while (it.hasNext()) {
	    String nomVar =  it.next();
	    res += nomVar + "\t" + " : ";
	    res += ( this.table.get(nomVar)).toString() + "\n";
	}
	return res;
    }
} 