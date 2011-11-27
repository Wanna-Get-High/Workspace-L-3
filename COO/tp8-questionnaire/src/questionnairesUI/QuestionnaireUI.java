package questionnairesUI;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import javax.swing.*;

import questionnaires.Question;
import questionnaires.Questionnaire;

/**
 * The Class QuestionnaireUI.
 */
public class QuestionnaireUI 
{
	
	/** The points. */
	int points;
	
	/** The submit button. */
	JButton submit;
	
	/** The frame. */
	JFrame frame;
	
	/** The answers. */
	List <AnswerUI> answers;
	
	/**
	 * Instantiates a new questionnaireUI.
	 *
	 * @param q the questionnaire
	 */
	public QuestionnaireUI(Questionnaire q)
	{
		this.answers = new ArrayList<AnswerUI>();
		this.frame = new JFrame("Questionnaire");
		this.frame.setLayout(new GridLayout(q.getNumberOfQuestions()+1,2));
		
		// add all the Answers to a List
		for (Question quest : q.getQuestions())
		{
			this.answers.add(quest.getAnswer().getUI(quest));
		}
		
		//use that List to create the frame
		for (AnswerUI ans : this.answers)
		{
			this.frame.add(new JLabel(ans.getQuestion().getQuestion()));
			this.frame.add(ans.getPanel());
		}
		
		this.submit = new JButton("submit");
		this.submit.addActionListener(new SubmitAnswers());
		
		this.frame.add(this.submit);
		
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.pack();
		this.frame.setVisible(true);
	}
	
	 /**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 */
 	public static void main(String[] args)
	    {
	    	Questionnaire quiz = new Questionnaire();
	    	try {
				quiz.initQuestionnaire("question_tolkien.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			new QuestionnaireUI(quiz);
	    }
	 
	 
	 /**
 	 * The Class SubmitAnswers.
 	 * 
 	 */
 	class SubmitAnswers implements ActionListener 
	 {
		@Override
		public void actionPerformed(ActionEvent arg)
		{
			String mes="";
			int it=1;
			
			// for all of the answers of the challenger check if its true or false
			// add points if he answered good 
			// add the good answers if not
			// and show it in a dialogBox.
			for (AnswerUI ans : QuestionnaireUI.this.answers)
			{
				if (ans.getAnswer().checkAnswer(ans.getValue()))
					QuestionnaireUI.this.points += ans.getQuestion().getPoints();
				
				else
					mes += "Q"+it+" : Wrong the correct answer was : " +ans.getAnswer().getCorrectAnswer()+"\n";
				
				it++;
			}
			
			mes +="\nYou have won "+QuestionnaireUI.this.points+" points";
			
			JOptionPane.showMessageDialog(frame, mes);
		}
	 }
}


