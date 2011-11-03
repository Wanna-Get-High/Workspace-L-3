package piscine;

import ressource.*;
import action.*;

public class Nageur extends Scenario
{
	private RessourceUser<Panier> userPanier = new RessourceUser<Panier>();
	private RessourceUser<Cabine> userCabine = new RessourceUser<Cabine>();
	
	public Nageur(String name,PanierManager panierManager,CabineManager cabineManager,
			int timeToUndress,int timeToSwim,int timeToGetdressed)
	{
		this.setMsg(name);
		this.add(new TakeRessource<Panier>(" - take a Panier\n", panierManager, userPanier));
		this.add(new TakeRessource<Cabine>(" - take a Cabine\n", cabineManager, userCabine));
		this.add(new Wait(" - undress ", timeToUndress));
		this.add(new LiberateRessource<Cabine>(" - give back a Cabine\n", cabineManager, userCabine));
		this.add(new Wait(" - swim ", timeToSwim));
		this.add(new TakeRessource<Cabine>(" - take a Cabine\n", cabineManager, userCabine));
		this.add(new Wait(" - get dressed", timeToGetdressed));
		this.add(new LiberateRessource<Cabine>(" - give back a Cabine\n", cabineManager, userCabine));
		this.add(new LiberateRessource<Panier>(" - give back a Panier\n", panierManager, userPanier));
	}
}
