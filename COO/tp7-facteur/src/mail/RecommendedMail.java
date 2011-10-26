package mail;

public class RecommendedMail extends DecorationMail 
{
	private float percentage;
	
	public RecommendedMail(Mail<?> con) 
	{
		super(con);
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
