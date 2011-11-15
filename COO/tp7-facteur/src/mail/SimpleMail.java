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
		System.out.println("mail"+this.serial+ " (cost : " + this.getCost() + ") [" + this.getContent().getText() 
				+ "] send by hab" + this.getSender().getSerial() + ", recieved by hab" + this.getReceiver().getSerial());
	}

	@Override
	public float getCost() 
	{
		return 1;
	}
	public String toString()
	{
		return "simple";
	}
}
