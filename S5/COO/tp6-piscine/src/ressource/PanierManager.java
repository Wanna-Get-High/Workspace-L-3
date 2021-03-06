package ressource;

/**
 * The Class PanierManager.
 */
public class PanierManager extends ResourceManager<Panier> 
{
	
	/**
	 * Instantiates a new panier manager.
	 *
	 * @param nbResource the number resource
	 */
	public PanierManager(int nbResource)
	{
		super(nbResource);
	}

	@Override
	protected Panier createResource() 
	{
		return new Panier();
	}
}
