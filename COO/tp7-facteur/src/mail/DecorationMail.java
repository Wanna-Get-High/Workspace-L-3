package mail;

public class DecorationMail extends Mail<Mail<?>> 
{
	public DecorationMail(Mail<?> con) 
	{
		super(con.getSender(), con.getReceiver(), con);
	}
	
	public Inhabitant getReceiver()
	{
		return this.content.getReceiver();
	}
	
	public Inhabitant getSender()
	{
		return this.content.getSender();
	}
	
	public String toString()
	{
		return this.content.toString();
	}

	@Override
	public float getCost() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void action() 
	{
		// TODO Auto-generated method stub
	}
}
