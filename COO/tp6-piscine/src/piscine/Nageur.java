package piscine;

import ressource.CabineManager;
import ressource.PanierManager;

public class Nageur 
{
	protected String name;
	protected PanierManager panierManager;
	protected CabineManager cabineManager;
	protected int timeToGetdressed;
	protected int timeToSwim;
	protected int timeToUndress;
	
	public Nageur(String name,PanierManager panierManager,CabineManager cabineManager,
			int timeToGetdressed,int timeToSwim,int timeToUndress)
	{
		this.name = name;
		this.panierManager = panierManager;
		this.cabineManager = cabineManager;
		this.timeToGetdressed = timeToGetdressed;
		this.timeToSwim = timeToSwim;
		this.timeToUndress = timeToUndress;
	}
}