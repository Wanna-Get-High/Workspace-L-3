package ressource;

public class PanierManager extends RessourceManager<Panier> 
{
	public PanierManager(int nbRessource)
	{
		super(nbRessource);
	}

	@Override
	protected Panier createRessource() 
	{
		return new Panier();
	}

}