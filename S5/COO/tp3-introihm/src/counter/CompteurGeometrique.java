package counter;

/**
 * CompteurGeometrique.java
 * 
 * @author <a href="mailto:jean-christophe.routier@lifl.fr">Jean-Christophe Routier</a>
 * @version
 */

public class CompteurGeometrique extends Counter 
{
	protected int raison;

	public CompteurGeometrique(int raison) 
	{
		super();
		this.name = "CompteurGeometrique";
		this.raison = raison;
	}

	public void increment() 
	{
		this.value = this.value * this.raison;
	}
}// CompteurGeometrique
