package counter;

/**
 * SimpleCounter.java
 *
 * @author <a href="mailto:jean-christophe.routier@lifl.fr">Jean-Christophe Routier</a>
 * @version
 */
public class SimpleCounter extends Counter
{
    public SimpleCounter ()
    {
		super();
		this.name = "SimpleCounter";
    }
    
    public void increment() 
    {
		this.value = this.value + 1;
    }
}// SimpleCounter
