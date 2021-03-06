package mail;

import java.util.*;

public class Simulation 
{
	public static Address createAdress(Town t)
	{
		return new Address((int)Math.random()*100, "troud bal", t);
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
		int nbInhab = 5; 	// number of inhabitant that will send mail
		int jour = 4; 		// number of days that people will send mail
		int letterType, receiver, letterSerial = 0, amountOfMoney, recomUrgentMail, depth; //explained later
		Mail<?> theMailToSend; // the mail that will be send
		Town town = new Town();
		Inhabitant[] inhabitant = createInhabitant(nbInhab,town);
		
		// set the inhabitant to the town (only for contentGoGo mail).
		town.settle(new ArrayList<Inhabitant>(Arrays.asList(inhabitant)));
		
		
		for (int i = 0;i < jour;i++)
		{
			System.out.println(" -------------- Day "+(i+1)+" -------------------");
			
			// deliver the mail in the mailbox to the inhabitant
			if (town.mailToDeliver())
				town.deliverMail();
			
			// put the answer of recommended, bill of exchange in the letter box for the next delivery
			town.deliverOver();
			
			// choosing the type of letter they will send and to whom
			for (int j = 0; j<inhabitant.length;j++)
			{
				depth = (int)(Math.random()*3);					// choosing the accumulation of recommended and urgent for the same mail (up to 2)
				letterType = (int)(Math.random()*2) +1;			// choosing the type of letter it will be
				receiver = (int)(Math.random()*(nbInhab-1)) +1;	// the inhabitant that will receive the mail
				amountOfMoney = (int)(Math.random()*19) +1; 	// the amount of money the current inhabitant could send
				letterSerial++;									// the serial of all the letter that will be send
				
				if (letterType == 1) // a simple mail
					theMailToSend = new SimpleMail(inhabitant[j], inhabitant[receiver], new Text("bla bla"), letterSerial);
				else // a bill of exchange
					theMailToSend = new BillOfExchange(inhabitant[j], inhabitant[receiver], new Money(amountOfMoney), letterSerial);
				
				// if depth = 0 then it will send a mail without being recommended or urgent
				for (int k = 0; k< depth;k++)
				{
					// choosing if its a recommended mail or urgent mail
					recomUrgentMail = (int)(Math.random()*2) + 1;
					
					if (recomUrgentMail == 1)
						theMailToSend = new RecommendedMail(theMailToSend);
					else
						theMailToSend = new urgentMail(theMailToSend);
				}
				
				// the inhabitant send the mail
				inhabitant[j].sendMail(theMailToSend);
			}
		}
		
		int ind = 1;
		// deliver the last mail of the letter box (acknowledgment, thanks) until there is nothing left
		while (town.mailToDeliver())
		{
			System.out.println(" -------------- Day "+(jour+ind)+" -------------------");
			town.deliverMail();
			town.deliverOver();
			ind++;
		}
	}
}
