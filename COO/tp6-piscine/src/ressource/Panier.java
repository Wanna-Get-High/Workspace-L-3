package ressource;

public class Panier implements Ressource 
{
	protected int cpt;
	protected int index;
	
	public Panier()
	{
		
	}
	
	@Override
	public String description() 
	{
		return "Panier";
	}
}