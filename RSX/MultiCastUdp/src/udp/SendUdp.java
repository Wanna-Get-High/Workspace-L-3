package udp;
import java.io.IOException;
import java.net.*;

public class SendUdp 
{
	DatagramSocket ds;
	DatagramPacket dp;
	
	public SendUdp(String msg,int port,String ad)
	{
		InetAddress address=null;
		// retrieve the InetAdresss from the address passed in argument
		try {
			address = InetAddress.getByName(ad);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		// create a new datagramPacket with the passed message
		dp = new DatagramPacket(msg.getBytes(),msg.length(),address,port);

		
		// create a new datagramSocket and send the datagramPacket.
		try {
			ds = new DatagramSocket(port+1);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		try {
			ds.send(dp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("envoyé : "+msg);
	}
	
	public static void main(String[] args) 
	{
		if (args.length < 3)
		{
			System.out.println("usage : ./SendUdp <msg> <port> <adress>");
		}
		else
		{
			new SendUdp(args[0],Integer.parseInt(args[1]),args[2]);
		}
	}
}
