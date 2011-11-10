package mail;

public class urgentMail extends DecorationMail 
{
	private final float urgentFactor = 2;
	
	public urgentMail(Mail<?> con) 
	{
		super(con);
	}
	
	@Override
	public float getCost() 
	{
		return this.content.getCost()*this.urgentFactor;
	}

	@Override
	public void action() 
	{
		this.content.action();
	}
}
