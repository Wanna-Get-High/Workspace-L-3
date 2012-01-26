package mail;

/**
 * The Class Money.
 */
public class Money implements Content 
{
	
	/** The value. */
	private float value;
	
	/**
	 * Instantiates a new money.
	 *
	 * @param val the value
	 */
	public Money(float val)
	{
		this.value = val;
	}
	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public float getValue()
	{
		return this.value;
	}
	
	@Override
	public String getDescription() 
	{
		return "Money";
	}
}
