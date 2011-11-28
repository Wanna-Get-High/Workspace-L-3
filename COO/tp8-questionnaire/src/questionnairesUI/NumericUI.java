package questionnairesUI;

import javax.swing.*;
import questionnaires.*;

/**
 * The Class NumericUI.
 */
public class NumericUI extends AnswerUI
{
	
	/** The spinner. */
	JSpinner spinner;
	
	/**
	 * Instantiates a new numericUI.
	 *
	 * @param ans the answer
	 * @param q the question
	 */
	public NumericUI(Answer<Integer> ans, Question q)
	{
		super(ans,q);
		this.spinner = new JSpinner(new SpinnerNumberModel(0,-3000,3000,1));
		this.panel.add(this.spinner);
	}
	
	@Override
	public String getValue()
	{
		return this.spinner.getValue().toString();
	}
}
