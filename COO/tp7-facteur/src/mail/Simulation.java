package mail;

public class Simulation 
{
	public static Adress createAdress(Town t)
	{
		return new Adress((int)Math.random(), "troud bal", t);
	}
	
	public static Inhabitant[] createInhabitant(int length, Town t)
	{
		Inhabitant[] in = new Inhabitant[length];
		for (int i = 0;i< length;i++)
			in[i] = new Inhabitant(1000,createAdress(t));
		
		return in;
	}
	
	public static void main(String[] args)
	{
		Town town = new Town();
		Inhabitant[] inhabitant = createInhabitant(10,town);
		int jour = 4;
		for (int i = 0;i < jour;i++)
		{
			
		}
	}
}
