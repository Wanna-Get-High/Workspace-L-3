package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastReceive 
{
	MulticastSocket ms;
	DatagramPacket dp;
	
	public MultiCastReceive()
	{	
		// create a new socket on the 7654 port and join the group "224.0.0.1"
		try {
			ms = new MulticastSocket(7654);
			ms.joinGroup(InetAddress.getByName("224.0.0.1"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// receive every message on the address 224.0.0.1
		while(true) {
			byte[] buffer = new byte[1024];
			try {
				dp = new DatagramPacket(buffer, buffer.length);
				ms.receive(dp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			String m = new String(dp.getData());
			System.out.println("envoyeur [" + dp.getAddress().getHostName() +
								"] - port [" + dp.getPort()+"] = "+ m);
		}
	}
	
	public static void main(String[] args) 
	{
		new MultiCastReceive();
	}
}
