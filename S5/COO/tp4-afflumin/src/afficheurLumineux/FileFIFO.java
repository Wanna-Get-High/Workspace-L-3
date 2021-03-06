package afficheurLumineux;

import java.util.*;

public class FileFIFO <E>
{
	private List <E> element;
	private int length;
	private int head;
	
	public FileFIFO(int l)
	{
		this.element = new ArrayList<E>();
		this.length = l;
		this.head = 0;
	}
	public int getLargeur()
	{
		return this.length;
	}
	
	public E add(E e)
	{
		E outputElem;
		outputElem = this.element.get(this.head);
		this.element.add(this.head,e);
		this.head = (this.head % this.length) +1;
		return outputElem;
	}
	
	public void raz(E e)
	{
		for (int i=0; i<getLargeur();i++)
		{
			this.element.add(head,e);
			this.head = (this.head % this.length) +1;
		}
	}
	
	public String toString()
	{
		return this.element.toString();
	}
	
	public static void main (String [] args)
	{
		FileFIFO<String> f = new FileFIFO<String>(5);
		//f.add("e");
		System.out.println("elements de la file : "+f.toString());
		System.out.println("largeur de la file : "+f.getLargeur());
		f.raz("test");
		System.out.println("elements de la file : "+f.toString());
		f.add("e");
		System.out.println("elements de la file : "+f.toString());
	}
}