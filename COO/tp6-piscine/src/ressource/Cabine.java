package ressource;

public class Cabine implements Ressource 
{
	protected int cpt;
	protected int index;
	
	public Cabine()
	{
		
	}
	@Override
	public String description() 
	{
		return "Cabine";
	}

}
