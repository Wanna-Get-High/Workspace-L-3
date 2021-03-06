package questionnairesUI;

import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import questionnaires.Answer;
import questionnaires.Question;

/**
 * The Class MultipleAnswerUI.
 */
public class MultipleAnswerUI extends AnswerUI
{
	
	/** The group. */
	ButtonGroup group;
	
	/**
	 * Instantiates a new multiple answerUI.
	 *
	 * @param ans the answer
	 * @param q the question
	 */
	public MultipleAnswerUI(Answer<?> ans, Question q) 
	{
		super(ans, q);
		this.group = new ButtonGroup();
		this.initValues(ans.getPossibleAnswers());
	}

	/**
	 * Initialize the values of the group of buttons. 
	 * (depends on the fact that all of the answers are separated by " | ")
	 *
	 * @param theAnswers the answers in a String
	 */
	public void initValues(String theAnswers)
	{
		 StringTokenizer st = new StringTokenizer(theAnswers,"\\s|\\s");
         boolean first = true;
         while (st.hasMoreElements())
         {
	         String label = st.nextToken();
	         JRadioButton button;
	         if(first)
	         {
	                 first = !first;
	                 button = new JRadioButton(label,true);
	         }
	         else  
	        	 button = new JRadioButton(label);
	         
	         button.setActionCommand(label);
	         this.group.add(button);
	         this.panel.add(button);
         }
	}

	@Override
	public String getValue() 
	{
		return this.group.getSelection().getActionCommand();
	}
}
