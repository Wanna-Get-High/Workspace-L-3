package mail;

public abstract class Mail <C extends Content> implements Content
{
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected int serial;
	
	public Mail(Inhabitant sen, Inhabitant rec,C con,int s)
	{
		this.sender = sen;
		this.receiver = rec;
		this.content = con;
		this.serial = s;
	}
	
	public abstract void action();
	public abstract float getCost();
	
	public C getContent()
	{
		return this.content;
	}
	
	public int getSerial()
	{
		return this.serial;
	}
	public Inhabitant getReceiver()
	{
		return this.receiver;
	}
	
	public Inhabitant getSender()
	{
		return this.sender;
	}
	
	@Override
	public String getDescription()
	{
		return "this content is a mail";
	}
}