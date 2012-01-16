package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveUdp 
{
	DatagramSocket ds;
	DatagramPacket dp;
	
	public ReceiveUdp(int port)
	{
		byte[] buffer = new byte[1024];
		
		try {
			ds = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		dp = new DatagramPacket(buffer, buffer.length);

		while(true) {
			try {
				ds.receive(dp);
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
		new ReceiveUdp(Integer.parseInt(args[0]));
	}
}
