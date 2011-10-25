package ressource;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class RessourceManager<R> 
{
	protected int nbRessource;
	protected int nbDispRessource;
	protected List<R> dispRessource;
	protected List<R> UnDispRessource;
	
	public RessourceManager(int ndr)
	{
		this.nbRessource = this.nbDispRessource = ndr;
		this.dispRessource = new LinkedList<R>();
		this.UnDispRessource = new LinkedList<R>();
		
		for (int i =0; i < this.nbRessource; i++)
		{
			this.dispRessource.add(this.createRessource());
		}
	}
	
	protected abstract R createRessource();
	
	public R giveRessource()
	{
		if (!this.dispRessource.isEmpty())
		{
			R res;
			res = this.dispRessource.get(0);
			this.dispRessource.remove(0);
			this.UnDispRessource.add(res);
			
			this.nbDispRessource--;
			return res;
		}
		throw new NoSuchElementException();
	}
	
	public void libRessource(R res)
	{
		if (this.nbDispRessource < this.nbRessource)
		{
			this.dispRessource.add(res);
			this.UnDispRessource.remove(res);
			
			this.nbDispRessource++;
		}
	}
}
