package questionnaires;

import questionnairesUI.*;

/**
 * The Class OuiNon.
 */
public class OuiNon extends Answer<Positif> 
{
	
	/**
	 * Instantiates a new Oui / Non
	 *
	 * @param p the enumeration type Positive (Oui / Non)
	 */
	public OuiNon(Positif p)
	{
		super(p);
	}
	
	/**
	 * Builds the OuiNon answer.
	 *
	 * @param answerText the answer text
	 * @return the answer
	 * @throws IllegalArgumentException the illegal argument exception
	 */
	public static Answer<?> build(String answerText) throws IllegalArgumentException
	{
		if (answerText.equals("oui"))
		{
			return new OuiNon(Positif.oui);
		}
		else if (answerText.equals("non"))
		{
			return new OuiNon(Positif.non);
		}
		
		throw new IllegalArgumentException();
	}
	
	@Override
	public String getPossibleAnswers()
	{
		return "oui | non";
	}

	@Override
	public boolean checkAnswer(String userAnswer) 
	{		
	    return userAnswer.contains(this.answer.toString());
	}
	
    @Override
    public boolean acceptablePattern(String text) 
    {
        try {
            Positif.valueOf(text);
        } 
        catch (IllegalArgumentException e) 
        {
            return false;
        }
        return true;
    }
    
   @Override
    public String getType()
    {
        return "oui|non";
    }
   
   @Override
   public String toString()
   {
	   return this.answer.toString();
   }

	@Override
	public AnswerUI getUI(Question q)
	{
		return new MultipleAnswerUI(this,q);
	}
}