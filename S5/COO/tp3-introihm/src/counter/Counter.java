package counter;

/**
 * Counter.java
 * 
 * @author <a href="mailto:jean-christophe.routier@lifl.fr">Jean-Christophe Routier</a>
 * @version
 */

public abstract class Counter 
{
	protected int value;
	protected String name;

	public Counter() 
	{
		this.value = 0;
	}

	public int getCurrentValue() 
	{
		return this.value;
	}

	public abstract void increment();

	public void init(int init) 
	{
		this.value = init;
	}
	public String toString()
	{
		return this.name;
	}

		
		/**
		 */
		public int truc(int s){
			return 0;
		}
}// Counter
