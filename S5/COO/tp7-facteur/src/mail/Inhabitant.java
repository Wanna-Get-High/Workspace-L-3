package mail;

/**
 * The Class Inhabitant.
 */
public class Inhabitant 
{
	
	/** The serial. */
	private int serial;	
	
	/** The account balance. */
	private float accountBalance;
	
	/** The address. */
	protected Address address;
	
	/**
	 * Instantiates a new inhabitant.
	 *
	 * @param ab the account balance of the inhabitant
	 * @param ad the address
	 * @param serial the serial
	 */
	public Inhabitant(float ab, Address ad,int serial)
	{
		this.accountBalance = ab;
		this.address = ad;
		this.serial  = serial;
	}
	
	/**
	 * Gets the serial.
	 *
	 * @return the serial
	 */
	public int getSerial()
	{
		return this.serial;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public Address getAddress()
	{
		return this.address;
	}
	
	/**
	 * Receive a mail.
	 * do the action of that mail
	 *
	 * @param m the mail
	 */
	public void receiveMail(Mail<?> m)
	{
		m.action();
	}
	
	/**
	 * Send a mail.
	 * add this mail to the letter box of the town
	 *
	 * @param m the mail
	 */
	public void sendMail(Mail<?> m)
	{
		System.out.println(">> hab" + this.serial + " send mail" + m.getSerial() + " <" + m.toString() + "> mail (cost : " + m.getCost() + ") to hab" + m.getReceiver().getSerial());
		this.address.getTown().postMail(m);
	}
	
	/**
	 * Send a reply.
	 *add this mail to the reply box (to avoid ConcurentModificationException)
	 *
	 * @param m the mail
	 */
	public void sendReply(Mail<?> m)
	{
		System.out.println(">> hab" + this.serial + " send mail" + m.getSerial() + " <" + m.toString() + "> mail (cost : " + m.getCost() + ") to hab" + m.getReceiver().getSerial());
		this.address.getTown().postReply(m);
	}
	
	/**
	 * Debit the account of the amount.
	 *
	 * @param amount the amount
	 */
	public void debitAccount(float amount)
	{
		this.accountBalance -= amount;
	}

	/**
	 * Credit account of the amount.
	 *
	 * @param amount the amount
	 */
	public void creditAccount(float amount)
	{
		this.accountBalance += amount;
	}
}
