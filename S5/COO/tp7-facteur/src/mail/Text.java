package mail;

/**
 * The Class Text.
 */
public class Text implements Content
{
	
	/** The Text. */
	private String Text;
	
	/**
	 * Instantiates a new text.
	 *
	 * @param text the text
	 */
	public Text(String text)
	{
		this.Text = text;
	}
	
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText()
	{
		return this.Text;
	}
	
	@Override
	public String getDescription() 
	{
		return "Some text";
	}
}
