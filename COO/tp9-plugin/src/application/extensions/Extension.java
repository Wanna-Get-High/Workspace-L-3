package application.extensions;

/**
 * The Interface Extension.
 */
public interface Extension 
{
	
	/**
	 * Transformer.
	 *
	 * @param s the string to transform
	 * @return the string transformed
	 */
	public String transformer(String s) ;
	
	/**
	 * To string.
	 *
	 * @return the name of the file
	 */
	public String toString() ;
}
