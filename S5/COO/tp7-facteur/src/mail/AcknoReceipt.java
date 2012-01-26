package mail;

/**
 * The Class AcknoReceipt.
 */
public class AcknoReceipt extends SimpleMail
{
	
	/**
	 * Instantiates a new acknowledgment receipt.
	 *
	 * @param sen the sender
	 * @param rec the receiver
	 * @param recomendedName the recommended name
	 * @param s the s
	 */
	public AcknoReceipt(Inhabitant sen, Inhabitant rec, String recommendedName, int s) 
	{
		super(sen, rec, new Text(recommendedName), s);
	}
	
	/**
	 * return the type of message in a String
	 */
	public String toString()
	{
		return "acknoledgment";
	}
}