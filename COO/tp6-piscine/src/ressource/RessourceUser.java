package ressource;

public class RessourceUser<R> 
{
	protected R ressource;
	
	public R getRessource()
	{
		return this.ressource;
	}
	
	public void resetRessource()
	{
		this.ressource = null;
	}
	
	public void setRessource(R res)
	{
		this.ressource = res;
	}
}
