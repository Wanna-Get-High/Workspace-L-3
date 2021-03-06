package mail;

/**
 * The Class Address.
 */
public class Address 
{
	
	/** The street number. */
	protected int streetNumber;
	
	/** The street name. */
	protected String streetName;
	
	/** The town. */
	protected Town town;
	
	/**
	 * Instantiates a new address.
	 *
	 * @param sNum the street number
	 * @param sName the street name
	 * @param t the town
	 */
	public Address(int sNum, String sName, Town t)
	{
		this.streetNumber = sNum;
		this.streetName = sName;
		this.town = t;
	}
	
	/**
	 * Gets the street number.
	 *
	 * @return the street number
	 */
	public int getStreetNumber()
	{
		return this.streetNumber;
	}
	
	/**
	 * Gets the street name.
	 *
	 * @return the street name
	 */
	public String getStreetName()
	{
		return this.streetName;
	}
	
	/**
	 * Gets the town.
	 *
	 * @return the town
	 */
	public Town getTown()
	{
		return this.town;
	}
}
