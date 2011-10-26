package mail;

public class Text implements Content
{
	private String Text;
	
	public Text(String text)
	{
		this.Text = text;
	}
	
	public String getText()
	{
		return this.Text;
	}
	
	@Override
	public String getDescription() 
	{
		return "This content is some text";
	}
}
