package mail;

public class Adress 
{
	protected int streetNumber;
	protected String streetName;
	protected Town town;
	
	public Adress(int sNum, String sName, Town t)
	{
		this.streetNumber = sNum;
		this.streetName = sName;
		this.town = t;
	}
	
	public int getStreetNumber()
	{
		return this.streetNumber;
	}
	
	public String getStreetName()
	{
		return this.streetName;
	}
	
	public Town getTown()
	{
		return this.town;
	}
}
