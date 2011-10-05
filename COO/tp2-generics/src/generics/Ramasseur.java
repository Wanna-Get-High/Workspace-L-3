package generics;

/**
 * definit des objets specialises dans le ramassage d'objets d'un type T donne un objet T "tenu" a la fois
 */
public class Ramasseur<E>{
    // ATTRIBUTS a DEFINIR
	protected String name = "";
	/**
	 * @uml.property  name="object"
	 */
	E object;
	
    // METHODES a DEFINIR
    // toString 
    // prend : pour prendre un objet de type T (si aucun de "tenu")
    // getMonObjet : pour connaitre l'objet "porte" (null si saucun)
    // donneA : donne l'objet porte a un autre ramasseur compatible 
    // depose: depose l'objet "tenu"
	
	public String toString(){
		return this.name + " carries " + this.object;
	}

	/**
	 * @return
	 * @uml.property  name="object"
	 */
	protected E getObject(){
		return this.object;
	}
	
	protected E depose(){
		E result = this.object;
		this.object = null;
		return result;
	}

	//ramasseVegetable.takeA(Carot)
	protected <T extends E> void prend(T newObjet) throws IllegalStateException{
		if(this.object != null){
			throw new IllegalStateException("Wrong type");
		}
		this.object = newObjet;
	}
	//Ramasseur<Carotte> ramasseCarotte;
	//Ramasseur<Legume> ramasseLegume;
	
	//ramasseCarot1.giveSthTo(ramasseVegetable);
	protected void donneA(Ramasseur<? super E> ramasseurV) throws IllegalStateException{
		
		ramasseurV.prend(this.object);
		this.depose();
	}
	
    public Ramasseur(String name) {
	this.name = name;
    }



    public static void main(String[] args) {
	
	Carotte c1 = new Carotte(1);
	Carotte c2 = new Carotte(2);
	Carotte c3 = new Carotte(3);
	Pomme p1 = new Pomme(1);
	Pomme p2 = new Pomme(2);
	
 	Ramasseur<Carotte> ramasseCarotte1 = new Ramasseur<Carotte>("ramasse-carotte-1");
 	Ramasseur<Carotte> ramasseCarotte2 = new Ramasseur<Carotte>("ramasse-carotte-2");
 	Ramasseur<Pomme> ramassePomme1 = new Ramasseur<Pomme>("ramasse-pomme-1");
	// attention ici le type d'objets ramasses est Legume :
	Ramasseur<Legume> ramasseLegume = new Ramasseur<Legume>("ramasse-legume");


 	ramasseCarotte1.prend(c3);
	System.out.println(ramasseCarotte1);
	// NE COMPILE PAS
	// ramasseCarotte2.prend(p1);
	
	// NE COMPILE PAS
	// ramasseCarotte1.donneA(ramassePomme1);

	ramasseCarotte1.donneA(ramasseLegume);
	// NE COMPILE PAS
	// ramassePomme1.donneA(ramasseLegume);

 	ramasseCarotte1.prend(c1);
	ramasseCarotte1.donneA(ramasseCarotte2);
	System.out.println(ramasseCarotte1);
	System.out.println(ramasseCarotte2);
	ramasseCarotte1.prend(c2);
	try {
	    ramasseCarotte1.donneA(ramasseCarotte2);
	} catch(IllegalStateException e) {
	    System.out.println("*** exception : "+ramasseCarotte2+" porte deja qque chose");
	    System.out.println(" * "+ e.getMessage());
	}


	ramassePomme1.prend(p2);
	System.out.println(ramassePomme1);
	try {
	    ramassePomme1.prend(p1);
	} catch(IllegalStateException e) {
	    System.out.println("*** exception : "+ramassePomme1+" porte deja qque chose");
	    System.out.println(" * "+e.getMessage());
	}
	ramassePomme1.depose();
	System.out.println(ramassePomme1);
	ramassePomme1.prend(p1);
	
     }
}