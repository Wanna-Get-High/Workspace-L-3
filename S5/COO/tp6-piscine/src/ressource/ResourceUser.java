package ressource;

/**
 * The Class ResourceUser.
 *
 * @param <R> the generic type
 */
public class ResourceUser<R> 
{
	
	/** The resource. */
	protected R resource;
	
	/**
	 * Gets the resource.
	 *
	 * @return the resource
	 */
	public R getResource()
	{
		return this.resource;
	}
	
	/**
	 * Reset the resource.
	 */
	public void resetResource()
	{
		this.resource = null;
	}
	
	/**
	 * Sets the resource.
	 *
	 * @param res the new resource
	 */
	public void setResource(R res)
	{
		this.resource = res;
	}
}
