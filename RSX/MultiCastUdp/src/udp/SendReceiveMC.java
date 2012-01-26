package udp;

public class SendReceiveMC extends Thread
{
	//Create a new Thread that will create a MultiCastReceive
	public void run()
	{
		new MultiCastReceive();
	}
	
	public static void main(String[] args) 
	{
		SendReceiveMC srmc = new SendReceiveMC();
		srmc.start();
		
		if (args.length < 2)
		{
			System.out.println("usage : ./SendReceiveMC <msg> <times send>");
		}
		else
		{
			new MultiCastSend(args[0],Integer.parseInt(args[1]));
		}
	}
}
