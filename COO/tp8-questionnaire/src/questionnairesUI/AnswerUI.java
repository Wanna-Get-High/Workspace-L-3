package questionnairesUI;

import questionnaires.Answer;
import questionnaires.Question;

import javax.swing.JPanel;

/**
 * The Class AnswerUI.
 */
public abstract class AnswerUI
{
	
	/** The answer. */
	Answer<?> answer;
	
	/** The panel. */
	JPanel panel;
	
	/** The question. */
	Question question;
	
	/**
	 * Instantiates a new answerUI.
	 *
	 * @param ans the answer
	 * @param q the question
	 */
	public AnswerUI(Answer<?> ans,Question q)
	{
		this.answer = ans;
		this.panel = new JPanel();
		this.question = q;
	}
	
	/**
	 * Gets the answer.
	 *
	 * @return the answer
	 */
	public Answer<?> getAnswer()
	{
		return this.answer;
	}
	
	/**
	 * Gets the question.
	 *
	 * @return the question
	 */
	public Question getQuestion()
	{
		return this.question;
	}
	
	/**
	 * Gets the panel.
	 *
	 * @return the panel
	 */
	public JPanel getPanel()
	{
		return this.panel;
	}
	
	/**
	 * returns the value of the element that compose the panel.
	 * @return a string that is the answer
	 */
	public abstract String getValue();
}
