package mail;

public class urgentMail extends DecorationMail 
{
	private float urgentFactor;
	
	public urgentMail(Mail<?> con) 
	{
		super(con);
	}
	
	@Override
	public float getCost() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
