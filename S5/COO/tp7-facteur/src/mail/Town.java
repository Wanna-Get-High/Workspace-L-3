package mail;

import java.util.*;

/**
 * The Class Town.
 */
public class Town 
{
	/** the inhabitant of the town */
	protected List<Inhabitant> inhabitants; 
	
	/** The box letter. */
	protected List <Mail<?>> boxLetter;
	
	/** The reply box. */
	protected List <Mail<?>> replyBox;
	
	/**
	 * Instantiates a new town.
	 */
	public Town()
	{
		this.boxLetter = new ArrayList<Mail<?>>();
		this.replyBox = new ArrayList<Mail<?>>();
		this.inhabitants = new ArrayList<Inhabitant>();
	}
	
	
	/**
	 * The settle.
	 * add an inhabitant to the town.
	 * 
	 * @param inh the inhabitant
	 */
	public void settle(Inhabitant inh)
	{
		this.inhabitants.add(inh);
	}
	
	/**
	 * The settle.
	 * set all the inhabitant to the town.
	 * 
	 * @param list the inhabitants
	 */
	public void settle(List<Inhabitant> list)
	{
		this.inhabitants = list;
	}
	
	/**
	 * Gets an inhabitant.
	 * 
	 * @param i the index
	 * @return the inhabitant at the index i
	 */
	public Inhabitant getInhabitant(int i)
	{
		return this.inhabitants.get(i);
	}
	
	/**
	 * Gets the inhabitants
	 * 
	 * @return the whole inhabitant of the town
	 */
	public List<Inhabitant> getInhabitants()
	{
		return this.inhabitants;
	}
	/**
	 * Post a mail.
	 * add the mail to the letter box.
	 *
	 * @param m the mail
	 */
	public void postMail(Mail<?> m)
	{
		this.boxLetter.add(m);
	}
	
	/**
	 * Post a reply.
	 * add the mail to the reply box in order to avoid ConcurentModificationException
	 *
	 * @param m the mail
	 */
	public void postReply(Mail<?> m)
	{
		this.replyBox.add(m);
	}
	
	/**
	 * Deliver the mails.
	 * give mails to the appropriate inhabitant and clear it.
	 */
	public void deliverMail()
	{
		for(Mail<?> m : this.boxLetter)
			m.getReceiver().receiveMail(m);

		this.boxLetter.clear();
	}
	
	/**
	 * Deliver over.
	 * add all the mail of the reply box to the letter box and clear it.
	 */
	public void deliverOver()
	{
		this.boxLetter.addAll(this.replyBox);
		this.replyBox.clear();
	}
	
	/**
	 * Mail to deliver.
	 *
	 * @return true, if the box letter isn't empty.
	 */
	public boolean mailToDeliver()
	{
		return !this.boxLetter.isEmpty();
	}
}
