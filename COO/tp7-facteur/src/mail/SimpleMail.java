package mail;

public class SimpleMail extends Mail<Text> 
{
	public SimpleMail(Inhabitant sen, Inhabitant rec, Text con, int s)
	{
		super(sen, rec, con, s);
	}

	@Override
	public void action() 
	{
	}

	@Override
	public float getCost() 
	{
		return 1;
	}
}