package mail;

import java.util.*;

public class Town 
{
	protected List <Mail<?>> boxLetter;
	protected boolean isMod;
	
	public Town()
	{
		this.boxLetter = new ArrayList<Mail<?>>();
		this.isMod = false;
	}
	
	public void postMail(Mail<?> m)
	{
		this.boxLetter.add(m);
		this.isMod = true;
	}
	
	public void deliverMail()
	{
		for(Mail<?> m : this.boxLetter)
			m.getReceiver().receiveMail(m);

		this.boxLetter.clear();
	}
	
	public boolean mailToDeliver()
	{
		return !this.boxLetter.isEmpty();
	}
	
	public List <Mail<?>> getBoxLetter()
	{
		return this.boxLetter;
	}
}
