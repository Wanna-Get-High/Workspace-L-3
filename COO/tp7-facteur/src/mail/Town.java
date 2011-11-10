package mail;

import java.util.*;

public class Town 
{
	protected List <Mail<?>> boxLetter;
	
	public Town()
	{
		this.boxLetter = new ArrayList<Mail<?>>();
	}
	
	public void postMail(Mail<?> m)
	{
		this.boxLetter.add(m);
	}
	
	public void deliverMail()
	{
		for (Mail<?> m : this.boxLetter)
		{
			m.getReceiver().receiveMail(m);
		}
		this.boxLetter.clear();
	}
	
	public boolean mailToDeliver()
	{
		return !this.boxLetter.isEmpty();
	}
}
