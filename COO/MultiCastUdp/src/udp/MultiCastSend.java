package udp;
import java.io.IOException;
import java.net.*;

public class MultiCastSend 
{
	MulticastSocket ms;
	DatagramPacket dp;
	
	public MultiCastSend(String msg, int nb)
	{	
		InetAddress address=null;
		
		try {
			address = InetAddress.getByName("224.0.0.1");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		// creating our packet to send
		dp = new DatagramPacket(msg.getBytes(),msg.length(),address,7654);
		
		// create a new MultiCastSocket
		// set the living time of the packet to 1
		// we send the packet
		// tell the thread to take a coffee for 2 sec :)
		try {
			ms = new MulticastSocket();
			ms.setTimeToLive(1);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i=0; i< nb;i++)
		{
			try {
				ms.send(dp);
				System.out.println("envoyé : "+msg);
				Thread.sleep(5000);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("usage : ./sendUdp <msg> <times send>");
		}
		else
		{
			new MultiCastSend(args[0],Integer.parseInt(args[1]));
		}
	}
}