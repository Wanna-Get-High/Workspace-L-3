package mail;

public class Thanks extends SimpleMail
{
	public Thanks(Inhabitant sen, Inhabitant rec, String boeName) 
	{
		super(sen, rec, new Text(boeName));
	}
}
