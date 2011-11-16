package questionnaires;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Class Question.
 */
public class Question 
{
	
	/** A question. */
	private String aQuestion;
	
	/** The solution. */
	private Answer<?> theSolution;
	
	/** The points. */
	private int points;
	
	/**
	 * Instantiates a new question.
	 *
	 * @param aQuestion a question
	 * @param theSolution the solution
	 * @param points the points
	 */
	public Question(String aQuestion, Answer<?> theSolution, int points)
	{
		this.aQuestion = aQuestion;
		this.theSolution = theSolution;
		this.points = points;
	}
	
	/**
	 * Ask a question.
	 */
	public void askQuestion()
	{
		int score = 0;
		System.out.println(this.aQuestion);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String givenAnswer = "";
		
		try {
			givenAnswer = input.readLine();
		}
		catch (IOException e) 
        {
            e.printStackTrace();
        }

		System.out.println(givenAnswer);
		// check and print the answer
        if (this.getAnswer().checkAnswer(givenAnswer)) 
        {
            System.out.println("correct (" + this.getPoints() + ")");
            // increment the score
            score += this.getPoints();
        } 
        else 
        {
            System.out.println("incorrect, la bonne réponse est : " + this.getAnswer().toString());
        }
	}
	
	/**
	 * Gets the points.
	 *
	 * @return the points
	 */
	public int getPoints()
	{
		return this.points;
	}

	/**
	 * Gets the answer.
	 *
	 * @return the answer
	 */
	public Answer<?> getAnswer() 
	{
	    return this.theSolution;
	}
	
	/**
	 * Gets the question.
	 *
	 * @return the question
	 */
	public String getQuestion()
	{
		return this.aQuestion;
	}
}
