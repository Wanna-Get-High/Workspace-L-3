package questionnaires;

import java.util.*;

import questionnairesUI.*;

/**
 * The Class MultipleOpenedAnswer.
 */
public class MultipleOpenedAnswer extends Answer<String> 
{	
    /**
     * Instantiates a new MultipleOpenedAnswer.
     *
     * @param a the answers.
     */
    public MultipleOpenedAnswer(String a) 
    {
    	super(a);
    }

    /**
     * Builds the Multiple opened answer.
     *
     * @param answerText the answer text
     * @return the answer
     */
    public static Answer<?> build(String answerText)
    {
    	return new MultipleOpenedAnswer(answerText);
    }
    
    @Override
    public boolean checkAnswer(String userAnswer) 
	{
    	StringTokenizer st = new StringTokenizer(this.answer,"\\s;\\s");
    	String currentToken;
    	while (st.hasMoreTokens())
		{
    		currentToken = st.nextToken();
    		if (currentToken.contains(userAnswer) || userAnswer.contains(currentToken))
    			return true;
		}
    	return false;
	}
    
    @Override
    public boolean acceptablePattern(String text) 
    {
    	return true;
    }
    
    /**
 	 * return the number of possible answer in a String.
 	 *
 	 * @return return the number of possible answer
 	 */
    public String getType()
    {
    	StringTokenizer st = new StringTokenizer(this.answer,"\\s;\\s");
        return "there are " + st.countTokens() + " possible answers";
    }

	@Override
	public AnswerUI getUI(Question q) 
	{
		return new SymbolicUI(this, q);
	}

	@Override
	public String getPossibleAnswers() 
	{
		return this.answer;
	}
}
