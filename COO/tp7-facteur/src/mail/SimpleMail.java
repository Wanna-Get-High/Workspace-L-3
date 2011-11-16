package mail;

/**
 * The Class SimpleMail.
 */
public class SimpleMail extends Mail<Text> 
{
	
	/**
	 * Instantiates a new simple mail.
	 *
	 * @param sen the sender
	 * @param rec the receiver
	 * @param con the content
	 * @param s the serial
	 */
	public SimpleMail(Inhabitant sen, Inhabitant rec, Text con, int s)
	{
		super(sen, rec, con, s);
	}

	@Override
	public void action()
	{
		System.out.println("mail"+this.serial+ " (cost : " + this.getCost() + ") [" + this.getContent().getText() 
				+ "] send by hab" + this.getSender().getSerial() + ", recieved by hab" + this.getReceiver().getSerial());
	}

	@Override
	public float getCost() 
	{
		return 1;
	}
	
	/**
	 * return the type of the message in a String
	 */
	public String toString()
	{
		return "simple";
	}
}