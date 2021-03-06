package application.extensions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

/**
 * The Class PluginChecker.
 */
public class PluginChecker 
{
	
	/** The directory. */
	protected File directory;
	
	/** The plug-in listeners. */
	protected List<PluginListener> pluginListeners;
	
	/** The delay of the Timer. */
	
	protected int delay;
	
	/** The plug-in event. */
	protected PluginEvent pluginEvent;
	
	/** The Timer. */
	protected Timer checker;
	
	/**
	 * Instantiates a new plug-in checker.
	 *
	 * @param delay the delay of the Timer
	 * @param dir the directory that will be visited
	 */
	public PluginChecker(int delay, String dir)
	{
		this.directory = new File(dir);
		this.delay = delay;
		this.pluginListeners = new ArrayList<PluginListener>();
	}
	
	/**
	 * Adds the plug-in.
	 *
	 * @param extName the name of the plug-in that will be created
	 */
	public void addPlugin(String extName)
	{
		try {
			this.pluginEvent = new PluginEvent(this,(Extension)Class.forName(extName).newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		this.firePluginAdded();
	}
	
	/**
	 * Fire plug-in added.
	 * broadcast to all of the plug-in Listener that a new plug-in is added
	 */
	protected void firePluginAdded()
	{
		for (PluginListener pl : this.pluginListeners)
		{
			pl.pluginAdded(pluginEvent);
		}
	}
	
	/**
	 * Removes the plug-in.
	 *
	 * @param extName the the name of the plug-in that will be removed
	 */
	public void removePlugin(String extName)
	{
		try {
			this.pluginEvent = new PluginEvent(this,(Extension)Class.forName(extName).newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		this.firePluginRemoved();
	}
	
	/**
	 * Fire plug-in removed.
	 * broadcast to all of the plug-in Listener that a new plug-in is removed
	 */
	public void firePluginRemoved()
	{
		for (PluginListener pl : this.pluginListeners)
		{
			pl.pluginRemoved(pluginEvent);
		}	
	}
	
	/**
	 * Adds the plugin listener.
	 *
	 * @param listener the listener
	 */
	public void addPluginListener(PluginListener listener)
	{
		if (pluginListeners.contains(listener))
			return;
		
		this.pluginListeners.add(listener);
	}
	
	/**
	 * Removes the plug-in listener.
	 *
	 * @param listener the listener
	 */
	public void removePluginListener(PluginListener listener)
	{
		this.pluginListeners.remove(listener);
	}
	
	/**
	 * Creates the Timer that will visit the directory.
	 */
	public void createChecker()
	{
		this.checker = new Timer(this.delay,new ActionListener()
											{
												protected String[] newFileName;
												protected String[] fileName;
												protected int length = 0;
												protected int newLength;
												protected boolean isContained = false;
												protected FilenameFilter onlyClassFile = new OnlyClassFile();
												
												@Override
												public void actionPerformed(ActionEvent arg0)
												{
													this.newFileName = PluginChecker.this.directory.list(this.onlyClassFile);
													this.newLength = this.newFileName.length;
														
													if (this.newLength > this.length)
													{
														for (int i = 0; i< this.newLength; i++)
														{
															this.isContained=false;
															
															for (int j = 0; j< this.length; j++)
															{
																if (this.newFileName[i].equals(this.fileName[j]))
																	this.isContained=true;
															}
															
															if (!isContained) 
																PluginChecker.this.addPlugin(newFileName[i].substring(0, newFileName[i].length()-6));
														}
													} 
													else if (this.newLength < this.length)
													{
														for (int i = 0; i< this.length; i++)
														{
															this.isContained=false;
															
															for (int j = 0; j< this.newLength; j++)
															{
																if (this.fileName[i].equals(this.newFileName[j]))
																	this.isContained=true;
															}
															
															if (!isContained) 
																PluginChecker.this.removePlugin(fileName[i].substring(0, fileName[i].length()-6));
														}
													}
													
													this.fileName = this.newFileName;
													this.length = this.newLength;
												}
											}
								);
		this.checker.start();
	}
}
