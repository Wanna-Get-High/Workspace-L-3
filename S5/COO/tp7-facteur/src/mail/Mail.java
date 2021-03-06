package mail;

/**
 * The Class Mail.
 *
 * @param <C> the content of the mail
 */
public abstract class Mail <C extends Content> implements Content
{
	
	/** The content. */
	protected C content;
	
	/** The sender. */
	protected Inhabitant sender;
	
	/** The receiver. */
	protected Inhabitant receiver;
	
	/** The serial. */
	protected int serial;
	
	/**
	 * Instantiates a new mail.
	 *
	 * @param sen the sender
	 * @param rec the receiver
	 * @param con the content
	 * @param s the serial of the mail
	 */
	public Mail(Inhabitant sen, Inhabitant rec,C con,int s)
	{
		this.sender = sen;
		this.receiver = rec;
		this.content = con;
		this.serial = s;
	}
	
	/**
	 * the action of the mail.
	 */
	public abstract void action();
	
	/**
	 * Gets the cost of the mail.
	 *
	 * @return the cost
	 */
	public abstract float getCost();
	
	/**
	 * Gets the content of the mail.
	 *
	 * @return the content
	 */
	public C getContent()
	{
		return this.content;
	}
	
	/**
	 * Gets the serial of the mail.
	 *
	 * @return the serial
	 */
	public int getSerial()
	{
		return this.serial;
	}
	
	/**
	 * Gets the receiver of the mail.
	 *
	 * @return the receiver
	 */
	public Inhabitant getReceiver()
	{
		return this.receiver;
	}
	
	/**
	 * Gets the sender of the mail.
	 *
	 * @return the sender
	 */
	public Inhabitant getSender()
	{
		return this.sender;
	}
	
	@Override
	public String getDescription()
	{
		return "A mail";
	}
}
