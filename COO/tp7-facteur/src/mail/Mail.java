package mail;

public abstract class Mail <C extends Content> implements Content
{
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected String name;
	
	public Mail(Inhabitant sen, Inhabitant rec,C con)
	{
		this.sender = sen;
		this.receiver = rec;
		this.content = con;
	}
	
	public abstract void action();
	public abstract float getCost();
	
	public C getContent()
	{
		return this.content;
	}
	
	public Inhabitant getReceiver()
	{
		return this.receiver;
	}
	
	public Inhabitant getSender()
	{
		return this.sender;
	}
	
	public String toString()
	{
		return this.name;
	}
	
	@Override
	public String getDescription()
	{
		return "this content is a mail";
	}
}
