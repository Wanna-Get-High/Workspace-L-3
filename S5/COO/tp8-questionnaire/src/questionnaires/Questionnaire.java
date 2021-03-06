package questionnaires;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import questionnaires.Question;

/**
 * The class Questionnaire
 */
public class Questionnaire 
{
    /** the questions for the players */
    private List<Question> questions;
    
    /** the points of this questionnaire */
    protected int points;
    
    /**
     * Instantiate a new Questionnaire
     */
    public Questionnaire()
    {
        this.questions = new ArrayList<Question>();
    }

    /**
     * the method ask.
     * it will ask the question to the player and check his answer.
     */
    public void ask()
    {
        int score = 0;
        Iterator<Question> it = this.questions.iterator();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Question q;
        String givenAnswer = "";
        
        while (it.hasNext())
        {
            q = it.next();
            
            // print the question
            System.out.println(q.getQuestion());

            // the payer write an answer unless it has the right type (int, yes/no, symolique(string))
            do {
                System.out.print("(" + q.getAnswer().getType() + ") ");
               
                // read the answer of the player
                try {
					givenAnswer = input.readLine();
				} 
                catch (IOException e) 
                {
					e.printStackTrace();
				}
                
            } while (!q.getAnswer().acceptablePattern(givenAnswer));

            // check and print the answer (if not correct)
            if (q.getAnswer().checkAnswer(givenAnswer)) 
            {
                System.out.println("correct (" + q.getPoints() + ")");
                // increment the score
                score += q.getPoints();
            } 
            else 
            {
                System.out.println("incorrect, la bonne réponse est : " + q.getAnswer().getCorrectAnswer());
            }
        } 
        // end of the questionnaire
        System.out.println("\nVous avez " + score + " points.");
    }

    public Question createQuestion(String questionText, String answerText, String points,String answerClassName) 
    	throws IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException 
    {
        Answer<?> sol = AnswerFactory.INSTANCE.buildAnswer(answerClassName, answerText);
        return (new Question(questionText, sol, Integer.parseInt(points)));
    }

    public void initQuestionnaire(String FileName) 
    	throws FileNotFoundException,IOException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException
    {
    	BufferedReader br;
    	String line = "";
    	int lineNumb = 0;
    	String questionText ="" , answerText = "" , points  = "";
    	
        // create a question with the data of the file
        // add the question to  this.questions
    	try {
    		br = new BufferedReader(new InputStreamReader(new FileInputStream(FileName)));
    		while ((line=br.readLine())!=null)
    		{
    			if (lineNumb == 0)
    			{
    				questionText = line;
    			}
    			else if (lineNumb == 1)
    			{
    				answerText = line;
    			}
    			else if (lineNumb == 2)
    			{
    				points = line;
    			}
    			else
    			{
    				this.questions.add(this.createQuestion(questionText, answerText, points, "questionnaires."+line));
    				lineNumb = -1;
    			}
    			//System.out.println(line);
    			lineNumb++;
    		}
    		br.close(); 
    	}
    	catch (FileNotFoundException fnfe)
    	{
    		throw new FileNotFoundException();
    	}
    	catch (IOException ioe)
    	{
    		throw new IOException();
    	}
    }
    
    public List<Question> getQuestions()
    {
    	return this.questions;
    }
    
    public int getNumberOfQuestions()
    {
    	return this.questions.size();
    }
    
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
		quiz.ask();
    }
}
