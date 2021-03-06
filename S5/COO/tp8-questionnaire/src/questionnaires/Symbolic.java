package questionnaires;
import questionnairesUI.*;

/**
 * The Class Symbolic.
 */
public class Symbolic extends Answer<String>
{	
	
	/**
	 * Instantiates a new symbolic.
	 *
	 * @param s the string 
	 */
	public Symbolic(String s)
	{
		super(s);
	}
	
	/**
	 * Builds the symbolic answer.
	 *
	 * @param answerText the answer text
	 * @return the answer
	 * @throws IllegalArgumentException the illegal argument exception
	 */
	public static Answer<?> build(String answerText) throws IllegalArgumentException
	{
		return new Symbolic(answerText);
	}

	@Override
	public boolean checkAnswer(String userAnswer)
	{
	    return this.answer.equals(userAnswer);
	}
	
    @Override
    public String getType() 
    {        
        return "symbolique";
    }

    @Override
    public boolean acceptablePattern(String text) 
    {
        return true;
    }

	@Override
	public AnswerUI getUI(Question q) 
	{
		return new SymbolicUI(this,q);
	}

	@Override
	public String getPossibleAnswers() 
	{
		return this.answer;
	}
}