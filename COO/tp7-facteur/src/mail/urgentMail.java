package mail;

/**
 * The Class urgentMail.
 */
public class urgentMail extends DecorationMail 
{
	
	/** The urgent factor. */
	private final float urgentFactor = 2;
	
	/**
	 * Instantiates a new urgent mail.
	 *
	 * @param con the content
	 */
	public urgentMail(Mail<?> con) 
	{
		super(con);
	}
	
	@Override
	public float getCost() 
	{
		return this.content.getCost()*this.urgentFactor;
	}

	@Override
	public void action() 
	{
		this.content.action();
	}
	
	/**
	 * return the type of the message in a String
	 */
	public String toString()
	{
		return "<"+this.getContent().toString() + "> urgent";
	}
}
