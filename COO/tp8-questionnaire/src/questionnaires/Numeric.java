package questionnaires;

/**
 * The Class Numeric.
 */
public class Numeric extends Answer<Integer> 
{
    /**
     * Instantiates a new Numeric.
     *
     * @param a the integer.
     */
    public Numeric(Integer a) 
    {
        super(a);
    }

    /**
     * Builds the numeric answer.
     *
     * @param answerText the answer text
     * @return the answer
     */
    public static Answer<?> build(String answerText) throws NumberFormatException
    {
    	 try {
             return new Numeric(Integer.parseInt(answerText));
         } 
         catch (NumberFormatException e) 
         {
             throw new NumberFormatException();
         }
    }
    
    @Override
    public boolean checkAnswer(String userAnswer) 
	{
	    return this.answer.equals(Integer.parseInt(userAnswer));
	}
    
    @Override
    public boolean acceptablePattern(String text) 
    {
        try {
            Integer.parseInt(text);
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
        return true;
    }
    
    @Override
    public String getType() 
    {
        return "numerique";
    }
    
    @Override
	public String toString()
	{
		return String.valueOf(this.answer);
	}
}
