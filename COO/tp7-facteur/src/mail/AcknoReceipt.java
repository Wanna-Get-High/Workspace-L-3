package mail;

public class AcknoReceipt extends SimpleMail
{
	public AcknoReceipt(Inhabitant sen, Inhabitant rec, String recomendedName, int s) 
	{
		super(sen, rec, new Text(recomendedName), s);
	}
}