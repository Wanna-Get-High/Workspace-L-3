package testtimer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.Timer;

public class TestTimer
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Timer scheduler = new Timer(1000,new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println(Calendar.getInstance().getTime());
								}
							});
		
		scheduler.start();
		while(true);
	}
}