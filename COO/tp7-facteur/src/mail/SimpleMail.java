package mail;

public class SimpleMail extends Mail<Text> 
{
	public SimpleMail(Inhabitant sen, Inhabitant rec, Text con)
	{
		super(sen, rec, con);
	}

	@Override
	public void action() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public float getCost() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
