package questionnaires;

import questionnairesUI.AnswerUI;

/**
 * The Class Answer.
 *
 * @param <T> the generic type
 */
public abstract class Answer<T> 
{
	
	/** The answer. */
	protected T answer;
	
	/**
	 * Instantiates a new answer.
	 *
	 * @param a the answer
	 */
	public Answer(T a)
	{
		this.answer = a;
	}
	
	/**
	 * Gets the correct answer.
	 *
	 * @return the answer
	 */
	public T getCorrectAnswer()
	{
	    return this.answer;
	}
	
	/**
	 * Check the answer.
	 *
	 * @param userAnswer the user answer
	 * @return true, if the user answer is equal to the answer
	 */
	public abstract boolean checkAnswer(String userAnswer);
	
	 /**
 	 * return the type of answer in a String.
 	 *
 	 * @return the type in a String
 	 */
	public abstract String getType();
	
	/**
	 * returns all of the possible answers in a String
	 * (the answers has to be separated by a " | ")
	 * 
	 * @return a String that contains all of the possible answers
	 */
	public abstract String getPossibleAnswers();
	
	/**
	 * check if the text passed in parameter is in the good format.
	 * 
	 * @param text the text to check
	 * @return true if the text is in the good format
	 */
	public abstract boolean acceptablePattern(String text);
	
	/**
	 * returns an AnswerUI for the graphical Interface
	 * @return an AnswerUI that matches the type of answer
	 */
	public abstract AnswerUI getUI(Question q);
}
