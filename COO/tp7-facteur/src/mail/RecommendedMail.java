package mail;

public class RecommendedMail extends DecorationMail 
{
	private final float percentage = 15;
	
	public RecommendedMail(Mail<?> con) 
	{
		super(con);
	}
	
	@Override
	public float getCost() 
	{
		return this.content.getCost() + ( this.content.getCost() * this.percentage ); 
	}
	
	@Override
	public void action() 
	{
		this.content.action();
		this.receiver.sendMail(new AcknoReceipt(this.receiver,this.sender,"acknowledgement of receipt of mail number : "+this.getSerial(),this.getSerial()));
	}
}
