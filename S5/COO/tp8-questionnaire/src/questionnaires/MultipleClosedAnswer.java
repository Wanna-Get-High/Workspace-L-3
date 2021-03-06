package questionnaires;

import java.util.StringTokenizer;
import questionnairesUI.*;


/**
 * The Class MultipleClosedAnswer.
 */
public class MultipleClosedAnswer extends Answer<String> 
{
	
	/** all of the possible answers. */
	protected static String TheAnswers;
	
    /**
     * Instantiates a new MultipleClosedAnswer.
     *
     * @param a the integer.
     */
    public MultipleClosedAnswer(String a) 
    {
    	super(a);
    }

    /**
     * Builds the Multiple Closed Answer.
     *
     * @param answerText the answer text
     * @return the answer
     */
    public static Answer<?> build(String answerText)
    {
    	StringTokenizer st = new StringTokenizer(answerText,"\\s+|\\s+");
    	String answer = "";
    	int it = 0;

    	if (st.hasMoreTokens())
    	{
    		answer = st.nextToken();
    		TheAnswers = answer;
    	}

    	while (st.hasMoreElements())
    	{
			if (it%2 == 0)
				TheAnswers = st.nextToken() + " | " + TheAnswers;
			
			else
				TheAnswers +=  " | " + st.nextToken();
 
    		it++;
    	}
    	
    	return new MultipleClosedAnswer(answer);
    }
    
    @Override
    public String getPossibleAnswers()
	{
		return TheAnswers;
	}

    @Override
    public boolean checkAnswer(String userAnswer) 
	{
		if (this.answer.contains(userAnswer) || userAnswer.contains(this.answer))
			return true;

    	return false;
	}

    @Override
    public boolean acceptablePattern(String text) 
    {
    	StringTokenizer st = new StringTokenizer(TheAnswers,"\\s+|\\s+");
    	while (st.hasMoreTokens())
    	{	
    		if (st.nextToken().contains(text))
    			return true;
    	}
    	return false;
    }
    
	 /**
 	 * return all of the possible answer in a String.
 	 *
 	 * @return return all of the possible answer
 	 */
    public String getType() 
    {
        return this.getPossibleAnswers();
    }

	@Override
	public AnswerUI getUI(Question q) 
	{
		return new MultipleAnswerUI(this,q);
	}
}
