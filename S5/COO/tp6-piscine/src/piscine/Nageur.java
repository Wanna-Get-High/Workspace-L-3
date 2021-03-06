package piscine;

import ressource.*;
import action.*;

/**
 * The Class Nageur.
 */
public class Nageur extends Scenario
{
	
	/** The resource user of panier. */
	private ResourceUser<Panier> userPanier = new ResourceUser<Panier>();
	
	/** The resource user of cabine. */
	private ResourceUser<Cabine> userCabine = new ResourceUser<Cabine>();
	
	/**
	 * Instantiates a new nageur.
	 *
	 * @param name the name
	 * @param panierManager the panier manager
	 * @param cabineManager the cabine manager
	 * @param timeToUndress the time to undress
	 * @param timeToSwim the time to swim
	 * @param timeToGetDressed the time to get dressed
	 */
	public Nageur(String name,PanierManager panierManager,CabineManager cabineManager,
			int timeToUndress,int timeToSwim,int timeToGetDressed)
	{
		this.setMsg(name);
		this.add(new TakeResource<Panier>(" - take a Panier\n", panierManager, userPanier));
		this.add(new TakeResource<Cabine>(" - take a Cabine\n", cabineManager, userCabine));
		this.add(new Wait(" - undress ", timeToUndress));
		this.add(new LiberateResource<Cabine>(" - give back a Cabine\n", cabineManager, userCabine));
		this.add(new Wait(" - swim ", timeToSwim));
		this.add(new TakeResource<Cabine>(" - take a Cabine\n", cabineManager, userCabine));
		this.add(new Wait(" - get dressed", timeToGetDressed));
		this.add(new LiberateResource<Cabine>(" - give back a Cabine\n", cabineManager, userCabine));
		this.add(new LiberateResource<Panier>(" - give back a Panier\n", panierManager, userPanier));
	}
}
