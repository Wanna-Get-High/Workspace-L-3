package mail;

public class Simulation 
{
	public static Adress createAdress(Town t)
	{
		return new Adress((int)Math.random()*100, "troud bal", t);
	}
	
	public static Inhabitant[] createInhabitant(int length, Town t)
	{
		Inhabitant[] in = new Inhabitant[length];
		for (int i = 0;i< length;i++)
			in[i] = new Inhabitant(1000,createAdress(t),i);
		
		return in;
	}
	
	public static void main(String[] args)
	{
		Town town = new Town();
		Inhabitant[] inhabitant = createInhabitant(10,town);
		int jour = 4;
		int letterType = 0;
		int receiver = 0;
		int letterSerial = 0;
		int amountOfMoney = 0;
		int recomUrgentMail = 0;
		int depth = 0;
		Mail<?> theMailToSend;

		for (int i = 0;i < jour;i++)
		{
			System.out.println(" -------------- Day "+(i+1)+" -------------------");
			// deliver the mail in the mailbox to the inhabitant
			if (town.mailToDeliver())
				town.deliverMail();
			
			// choosing the type of letter they will send and to whom
			for (int j = 0; j<inhabitant.length;j++)
			{
				depth = (int)(Math.random()*3);					// choosing the accumulation of recommended and urgent for the same mail (up to 2)
				letterType = (int)(Math.random()*2) +1;			// choosing the type of letter it will be
				receiver = (int)(Math.random()*9) +1;			// the inhabitant that will receive the mail
				amountOfMoney = (int)(Math.random()*19) +1; 	// the amount of money the current inhabitant could send
				letterSerial++;									// the serial of all the letter that will be send
				
				// a simple mail
				if (letterType == 1)
					theMailToSend = new SimpleMail(inhabitant[j], inhabitant[receiver], new Text("bla bla"), letterSerial);
				// a bill of exchange
				else 				
					theMailToSend = new BillOfExchange(inhabitant[j], inhabitant[receiver], new Money(amountOfMoney), letterSerial);
				
				
				for (int k = 0; k< depth;k++)
				{
					// choosing if its a recommended mail or urgent mail or mail
					recomUrgentMail = (int)(Math.random()*2) + 1;
					
					if (recomUrgentMail == 1)
						theMailToSend = new RecommendedMail(theMailToSend);
					else
						theMailToSend = new urgentMail(theMailToSend);
				}
				
				inhabitant[j].sendMail(theMailToSend);
			}
		}
		
		int ind = 1;
		
		if (town.mailToDeliver())
		{
			while (town.mailToDeliver())
			{
				System.out.println(" -------------- Day "+(jour+ind)+" -------------------");
				town.deliverMail();
				ind++;
			}
		}
	}
}
