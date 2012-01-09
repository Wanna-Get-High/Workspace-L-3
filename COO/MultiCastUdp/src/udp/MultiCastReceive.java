package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.net.SocketException;

public class MultiCastReceive 
{
	MulticastSocket ms;
	DatagramPacket dp;
	
	public MultiCastReceive(int port)
	{
		byte[] buffer = new byte[1024];
		
		try {
			ms = new MulticastSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		dp = new DatagramPacket(buffer, buffer.length);

		while(true) {
			try {
				ms.receive(dp);
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			System.out.println("Paquet recu : message = " + new String(buffer) + 
								" - envoyeur = " + dp.getAddress().getHostName() +
								" - port = " + dp.getPort());
		}
	}
	
	public static void main(String[] args) 
	{
		new ReceiveUdp(2015);
	}
}
