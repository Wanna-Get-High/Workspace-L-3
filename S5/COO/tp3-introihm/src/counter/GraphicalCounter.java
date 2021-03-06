package counter;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GraphicalCounter 
{
	protected Counter counter;
	private JButton init;
	private JButton increment;
	private JTextField input;
	private JLabel label;
	private JFrame frame;
	private boolean isInit;
	
	
	public GraphicalCounter(Counter counter)
	{
		this.isInit = false;
		this.counter = counter;
		this.frame = new JFrame(this.counter.toString());
		this.frame.addWindowListener(new CloseWindowEvent());
		this.frame.setLocation(100, 300);
		this.frame.setSize(100, 100);
		this.frame.setLayout(new BorderLayout());

		this.init = new JButton("init");
		this.init.addActionListener(new InitActionListener());
		this.increment = new JButton("increment");
		this.increment.addActionListener(new IncrementActionListener());
		this.input = new JTextField(10);
		this.label = new JLabel("enter a value to init the counter");
		
		this.frame.add(this.init, BorderLayout.NORTH);
		this.frame.add(this.increment, BorderLayout.SOUTH);
		this.frame.add(this.input, BorderLayout.WEST);
		this.frame.add(this.label, BorderLayout.EAST);

		this.frame.pack();
		this.frame.setVisible(true);
	}
	
	public static void main (String[] args)
	{
		new GraphicalCounter(new SimpleCounter());
		new GraphicalCounter(new ModularCounter(7));
		new GraphicalCounter(new CompteurGeometrique(3));
	}
	
	// ----------------------------------------------------------------------
	// close the application when we close the window
	// ----------------------------------------------------------------------
	class CloseWindowEvent extends WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent e) 
		{
			System.exit(0);
		}
	}  
	
	
	class InitActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			try {
			    GraphicalCounter.this.counter.init(Integer.parseInt(GraphicalCounter.this.input.getText()));
			    GraphicalCounter.this.isInit = true;
			}
			catch (NumberFormatException nfe)
			{
				GraphicalCounter.this.label.setText("Value isn't an Integer, try again");
			}
		}
	}
	
	class IncrementActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			if (GraphicalCounter.this.isInit)
			{
				GraphicalCounter.this.counter.increment();
				GraphicalCounter.this.label.setText(String.valueOf(GraphicalCounter.this.counter.getCurrentValue()));
			}
			else
			{
				GraphicalCounter.this.label.setText("Value isn't initiated");
			}
		}
	}
} 
	

