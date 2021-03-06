package ressource;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The Class RessourceManager.
 *
 * @param <R> the generic type
 */
public abstract class ResourceManager<R> 
{
	
	/** The number of resource. */
	protected int nbResource;
	
	/** The number of available resource. */
	protected int nbAvailResource;
	
	/** The available resource. */
	protected List<R> availResource;
	
	/** The Unavailable resource. */
	protected List<R> UnAvailResource;
	
	/**
	 * Instantiates a new resource manager.
	 *
	 * @param ndr the number of available resource to allocate
	 */
	public ResourceManager(int ndr)
	{
		this.nbResource = this.nbAvailResource = ndr;
		this.availResource = new LinkedList<R>();
		this.UnAvailResource = new LinkedList<R>();
		
		for (int i =0; i < this.nbResource; i++)
		{
			this.availResource.add(this.createResource());
		}
	}
	
	/**
	 * Creates a resource.
	 *
	 * @return the resource
	 */
	protected abstract R createResource();
	
	/**
	 * Give resource.
	 *
	 * @return the r
	 * @throws NoSuchElementException the no such element exception
	 */
	public R giveRessource() throws NoSuchElementException
	{
		if (!this.availResource.isEmpty())
		{
			R res;
			res = this.availResource.get(0);
			this.availResource.remove(0);
			this.UnAvailResource.add(res);
			
			this.nbAvailResource--;
			return res;
		}
		throw new NoSuchElementException();
	}
	
	/**
	 * Liberate the resource res from the unavailable resource.
	 *
	 * @param res the res
	 */
	public void libRessource(R res)
	{
		if (this.nbAvailResource < this.nbResource)
		{
			this.availResource.add(res);
			this.UnAvailResource.remove(res);
			
			this.nbAvailResource++;
		}
	}
}
