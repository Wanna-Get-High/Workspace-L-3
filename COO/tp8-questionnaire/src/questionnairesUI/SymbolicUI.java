package questionnairesUI;

import javax.swing.JTextField;

import questionnaires.Answer;
import questionnaires.Question;

/**
 * The Class SymbolicUI.
 */
public class SymbolicUI extends AnswerUI
{

	/** The field of answer. */
	JTextField fieldOfAnswer;
	
	/**
	 * Instantiates a new symbolicUI.
	 *
	 * @param ans the answer
	 * @param q the question
	 */
	public SymbolicUI(Answer<String> ans,Question q)
	{
		super(ans,q);
		this.fieldOfAnswer = new JTextField(20);
		this.panel.add(this.fieldOfAnswer);
	}
	
	@Override
	public String getValue()
	{
		return this.fieldOfAnswer.getText();
	}
}
