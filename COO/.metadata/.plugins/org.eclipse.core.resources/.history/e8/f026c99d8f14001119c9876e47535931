package questionnaires;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnswerFactory 
{	    
    public static final AnswerFactory INSTANCE = new AnswerFactory();
    
	 private AnswerFactory() {}
	
	public Answer<?> buildAnswer(String answerClassName, String answerText) 
		throws NoSuchMethodException,IllegalArgumentException,IllegalAccessException,InvocationTargetException, ClassNotFoundException
	{
		Method method;
		Answer<?> answer;
		Class<?> c;
		
	    // we retrieve the Object Class for the named class answerClassName
		try{
			c = Class.forName(answerClassName);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			throw new ClassNotFoundException();
		}
	    
		// we retrieve for this class the method with signature build(String)
	    try {
	    	method = c.getMethod("build",String.class);
	    }
	    catch (NoSuchMethodException nsme)
	    {
	    	throw new NoSuchMethodException();
	    }
	    
		// we invoke this method , 1st parameter = null because static
	    try {
			answer = (Answer<?>) method.invoke(null,answerText);
		} 
	    catch (IllegalArgumentException e) 
		{
			e.printStackTrace();
			throw new IllegalArgumentException();
		} 
	    catch (IllegalAccessException e)
		{
			e.printStackTrace();
			throw new IllegalAccessException();
		} 
		catch (InvocationTargetException e) 
		{
			e.printStackTrace();
			throw new InvocationTargetException(e);
		}
	    return answer;
	}
}

