package mail;

public class BillOfExchange extends Mail<Money> 
{
	public BillOfExchange(Inhabitant sen, Inhabitant rec, Money con) 
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
