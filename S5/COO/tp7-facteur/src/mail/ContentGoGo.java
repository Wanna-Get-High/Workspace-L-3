package mail;

/**
 * The Class ContentGoGo.
 */
public class ContentGoGo implements Content
{
	
	/** The beneficiary. */
	private Inhabitant[] beneficiary;
	
	/**
	 * Instantiates a new contentGoGo.
	 *
	 * @param benef the beneficiary
	 * @param val the amount of money that will be split
	 */
	public ContentGoGo(Inhabitant[] benef)
	{
		this.beneficiary = benef;
	}
	
	/**
	 * Gets the inhabitant.
	 *
	 * @return the inhabitant
	 */
	public Inhabitant[] getInhabitant()
	{
		return this.beneficiary;
	}
	
	/**
	 * Sets the beneficiary.
	 *
	 * @param benef the new beneficiary
	 */
	public void setBeneficiary(Inhabitant[] benef)
	{
		this.beneficiary = benef;
	}
	
	@Override
	public String getDescription() 
	{
		return "Money";
	}
}
