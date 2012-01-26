package ressource;


/**
 * The Class CabineManager.
 */
public class CabineManager extends ResourceManager<Cabine>
{
	
	/**
	 * Instantiates a new cabine manager.
	 *
	 * @param nbRessource the number of resource
	 */
	public CabineManager(int nbResource)
	{
		super(nbResource);
	}

	@Override
	protected Cabine createResource() 
	{
		return new Cabine();
	}

}
