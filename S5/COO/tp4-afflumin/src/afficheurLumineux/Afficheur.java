package afficheurLumineux;

public class Afficheur
{
	private String message; 
	private FileFIFO<Character> f;
	private int head;
	
	public Afficheur(int length)
	{
		this.message = "";
		this.head = 0;
		this.f = new FileFIFO<Character>(length);
	}
	/**
	 */
	public void setMessage(String msg)
	{
		this.head = 0;
		this.message = msg;
	}
	
	/**
	 */
	public void decale()
	{
		f.add(this.message.charAt(head));
		this.head = (this.head % this.f.getLargeur()) + 1;
	}

	/**
	 */
	public String toString()
	{
		return this.f.toString();	
	}	
}