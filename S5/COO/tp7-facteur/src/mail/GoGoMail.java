package mail;

/**
 * The Class GoGoMail.
 */
public class GoGoMail extends Mail<ContentGoGo>
{
	/**
	 * Instantiates a new go go mail.
	 *
	 * @param sen the sender
	 * @param rec the receiver
	 * @param con the contentgogo
	 * @param s the serial
	 */
	public GoGoMail(Inhabitant sen, Inhabitant rec, ContentGoGo con, int s) 
	{
		super(sen, rec, con, s);
	}

	@Override
	public void action() 
	{
		for (int i = 0; i < this.content.getInhabitant().length ; i++)
			this.receiver.sendReply(new BillOfExchange(this.receiver, this.content.getInhabitant()[i],new Money(1), this.serial));
			
		Inhabitant[] newList = this.content.getInhabitant();
		
		for (int i=1; i<newList.length;i++)
			newList[i-1] = newList[i];
		
		newList[newList.length-1] = this.receiver;
		
		for (int i = 0; i < 10 ; i++)
		{
			int inhabIndex = (int)(Math.random() * this.receiver.getAddress().getTown().getInhabitants().size())-1;
			this.receiver.sendReply( new GoGoMail(	this.receiver,
													this.receiver.getAddress().getTown().getInhabitant(inhabIndex),
													new ContentGoGo(newList),
													this.serial));
		}
	}

	@Override
	public float getCost()
	{
		return 1;
	}
	
	/**
	 * return the type of message in a String
	 */
	public String toString()
	{
		return "gogo mail";
	}
}
