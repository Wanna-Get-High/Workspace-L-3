package enumeration;

import scanner.TestScanner;

public class ArcEnCielTest {

	protected enum ArcEnCiel{rouge, orange, jaune, vert, bleu, indigo, violet;
		protected ArcEnCiel next(){
			int index = this.ordinal();
			if(index + 1 == ArcEnCiel.values().length) return ArcEnCiel.values()[0];
			return ArcEnCiel.values()[index+1];
		}
		protected static ArcEnCiel retrieveColorFrom(String name){
			try{
				return ArcEnCiel.valueOf(name);
			}
			catch(IllegalArgumentException e){
				return ArcEnCiel.orange;
			}
		}
	}
	
	protected enum Jour{ lundi(true), mardi(true), mercredi(true), jeudi(true), vendredi(true), samedi(false), dimanche(false);
		boolean estTravaille;
		private Jour(boolean estTravaille){
			this.estTravaille = estTravaille;
		}
		protected Jour lendemain(){
			int index = this.ordinal();
			if(index + 1 == Jour.values().length) return Jour.values()[0];
			return Jour.values()[index+1];
		}
		protected void printNextWeek(){
			Jour next = this;
			for ( int i = 0; i < 7 ; i++){
				System.out.println(next.name()+" est travaillé: "+next.estTravaille);
				next = next.lendemain();
			}
		}
		protected static Jour retrieveDayFrom(String name){
			try{
				return Jour.valueOf(name);
			}
			catch(IllegalArgumentException e){
				return Jour.lundi;
			}
		}
	}
	
	
	
	
	
	public static void main (String[] args){
		ArcEnCiel a = ArcEnCiel.retrieveColorFrom("violet");
		ArcEnCiel b = a.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println("------------------");
		for(ArcEnCiel color : ArcEnCiel.values()){
			System.out.println(color.name());
		}
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("enter a day index:");
		int index = TestScanner.saisieEntier(7);
		Jour selection = Jour.values()[index];
		System.out.println("You chose "+selection.name());
		selection.printNextWeek();
	}
}
