package afficheurLumineux;


public class Horloge
{
	private Afficheur afficheur ;
	public Horloge(Afficheur a)
	{ 
		this.afficheur = a ; 
	}
	public void tester(int nbTop) 
	{
		String message = "abcd" ;
		this.afficheur.setMessage(message) ;
		for (int i=0 ; i<nbTop ; i++) 
		{
			this.afficheur.decale() ;
			System.out.println("<<"+this.afficheur+">>") ;
		}
	}
	
	public static void main(String[] args)
	{
		Afficheur a = new Afficheur(5);
		a.setMessage("bonjour les amis");
		Horloge h = new Horloge(a);
		h.tester(8);
	}
}
