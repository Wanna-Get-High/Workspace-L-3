package mail;

public class RecommendedMail extends DecorationMail 
{
	
	public RecommendedMail(Mail<?> con) 
	{
		super(con);
	}
	
	@Override
	public float getCost() 
	{
		return this.content.getCost() + ( this.content.getCost() * 15 / 100 ); 
	}
	
	@Override
	public void action() 
	{
		this.content.action();
		this.receiver.sendMail(new AcknoReceipt(this.receiver,this.sender,"acknowledgement of receipt of mail number : "+this.getSerial(),this.getSerial()));
	}
	
	public String toString()
	{
		return "<"+ this.getContent().toString()+ "> recommended";
	}
}
