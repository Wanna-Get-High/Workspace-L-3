package afficheurLumineux;

import java.util.*;

public abstract class FileFIFO <E>
{
	private List <E> element;
	private int length;
	private int head;
	
	public FileFIFO()
	{
		
	}
	public int getLargeur()
	{
		return this.length;
	}
	
	public void add(E e)
	{
		this.element.add(e);
	}
	
	public void init(E e)
	{
		for (int i=0; i<getLargeur();i++)
		{
			this.element.add(e);
		}
	}
}
