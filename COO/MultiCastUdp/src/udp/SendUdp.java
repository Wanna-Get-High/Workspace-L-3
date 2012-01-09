package udp;
import java.io.IOException;
import java.net.*;

public class SendUdp 
{
	DatagramSocket ds;
	DatagramPacket dp;
	
	public SendUdp(String msg,int port,String taztavu)
	{
		System.out.println("envoyé : "+msg);
		InetAddress address=null;
		try {
			address = InetAddress.getByName(taztavu);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		dp = new DatagramPacket(msg.getBytes(),msg.length(),address,port);

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
	}
	
	public static void main(String[] args) 
	{
		if (args.length < 2)
		{
			System.out.println("plop :) faux ta vu");
		}
		else
		{
			new SendUdp(args[0],Integer.parseInt(args[1]),args[2]);
		}
	}
}
