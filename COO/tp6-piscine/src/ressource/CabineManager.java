package ressource;

public class CabineManager extends RessourceManager<Cabine>
{
	public CabineManager(int nbRessource)
	{
		super(nbRessource);
	}

	@Override
	protected Cabine createRessource() 
	{
		return new Cabine();
	}

}
