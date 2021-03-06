package mail;

/**
 * The Class DecorationMail.
 */
public abstract class DecorationMail extends Mail<Mail<?>> 
{
	/**
	 * Instantiates a new decoration mail.
	 *
	 * @param con the content of that decoration mail
	 */
	public DecorationMail(Mail<?> con) 
	{
		super(con.getSender(), con.getReceiver(), con,con.getSerial());
	}
	
	/**
	 * Gets the receiver of this mail
	 * 
	 * @return the receiver
	 */
	public Inhabitant getReceiver()
	{
		return this.content.getReceiver();
	}
	
	/**
	 * Gets the sender of this mail
	 * 
	 * @return the sender
	 */
	public Inhabitant getSender()
	{
		return this.content.getSender();
	}
}
