package mail;

/**
 * The Class Thanks.
 */

public class Thanks extends SimpleMail
{
	/**
	 * Instantiates a new thanks.
	 *
	 * @param sen the sender
	 * @param rec the receiver
	 * @param boeName the bill of exchange sender name
	 * @param s the serial
	 */
	public Thanks(Inhabitant sen, Inhabitant rec, String boeName,int s) 
	{
		super(sen, rec, new Text(boeName), s);
	}
	
	/**
	 * return the type of the message in a String
	 */
	public String toString()
	{
		return "thanks";
	}
}