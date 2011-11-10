package mail;

public abstract class DecorationMail extends Mail<Mail<?>> 
{
	public DecorationMail(Mail<?> con) 
	{
		super(con.getSender(), con.getReceiver(), con,con.getSerial());
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
}
