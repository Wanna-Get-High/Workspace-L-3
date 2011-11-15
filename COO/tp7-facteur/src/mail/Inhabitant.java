package mail;

public class Inhabitant 
{
	private int serial;
	private float accountBalance;
	protected Adress adress;
	
	public Inhabitant(float ab, Adress ad,int serial)
	{
		this.accountBalance = ab;
		this.adress = ad;
		this.serial  = serial;
	}
	
	public int getSerial()
	{
		return this.serial;
	}
	
	public void receiveMail(Mail<?> m)
	{
		m.action();
	}
	
	public void sendMail(Mail<?> m)
	{
		System.out.println("hab" + this.serial + " send mail" + m.getSerial() + " <" + m.toString() + "> mail (cost : " + m.getCost() + ") to hab" + m.getReceiver().getSerial());
		this.adress.getTown().postMail(m);
	}
	
	public void debitAccount(float amount)
	{
		this.accountBalance -= amount;
	}

	public void creditAccount(float amount)
	{
		this.accountBalance += amount;
	}
}
