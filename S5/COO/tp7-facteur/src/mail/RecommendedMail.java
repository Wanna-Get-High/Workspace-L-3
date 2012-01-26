package mail;

/**
 * The Class RecommendedMail.
 */
public class RecommendedMail extends DecorationMail 
{
	
	/**
	 * Instantiates a new recommended mail.
	 *
	 * @param con the content
	 */
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
		//while (!this.receiver.getAdress().getTown().isDeliverOver()){}
		this.receiver.sendReply(new AcknoReceipt(this.receiver,this.sender,"acknowledgement of receipt of mail number : "+this.getSerial(),this.getSerial()));
	}

	/**
	 * return the type of the message in a String
	 */
	public String toString()
	{
		return "<"+ this.getContent().toString()+ "> recommended";
	}
}
