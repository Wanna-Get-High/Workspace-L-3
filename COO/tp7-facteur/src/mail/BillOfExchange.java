package mail;

public class BillOfExchange extends Mail<Money> 
{
	public BillOfExchange(Inhabitant sen, Inhabitant rec, Money content,int s) 
	{
		super(sen, rec, content, s);
	}

	@Override
	public void action() 
	{
		this.sender.debitAccount(this.content.getValue());
		this.receiver.creditAccount(this.content.getValue());
		this.receiver.sendMail(new Thanks(this.receiver, this.sender, " thanks for the bill of exchange number : "+this.getSerial(),this.getSerial()));
	}

	@Override
	public float getCost() 
	{
		return 1 + ((this.content.getValue()*1) / 100);
	}
}
