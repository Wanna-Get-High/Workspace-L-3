package mail;

public class AcknoReceipt extends SimpleMail
{
	public AcknoReceipt(Inhabitant sen, Inhabitant rec, String recomendedName) 
	{
		super(sen, rec, new Text(recomendedName));
	}
}