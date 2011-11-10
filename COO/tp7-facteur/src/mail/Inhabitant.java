package mail;

public class Inhabitant 
{
	private float accountBalance;
	protected Adress adress;
	
	public Inhabitant(float ab, Adress ad)
	{
		this.accountBalance = ab;
		this.adress = ad;
	}
	
	public void receiveMail(Mail<?> m)
	{
		m.action();
	}
	
	public void sendMail(Mail<?> m)
	{
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