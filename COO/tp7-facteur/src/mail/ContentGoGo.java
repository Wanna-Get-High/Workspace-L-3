package mail;

public class ContentGoGo implements Content
{
	private Inhabitant[] beneficiary;
	private float value;
	
	public ContentGoGo(Inhabitant[] benef, float val)
	{
		this.beneficiary = benef;
		this.value = val;
	}
	
	public void setValue(float val)
	{
		this.value=val;
	}
	
	public Inhabitant[] getInhabitant()
	{
		return this.beneficiary;
	}
	
	public float getValue() 
	{
		return this.value / this.beneficiary.length;
	}
	
	public void setBeneficiary(Inhabitant[] benef)
	{
		this.beneficiary = new Inhabitant[benef.length];
		this.beneficiary = benef;
	}
	
	@Override
	public String getDescription() 
	{
		return "Money";
	}
}
