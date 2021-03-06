package application.extensions;

import java.util.EventListener;

/**
 * The listener interface for receiving plug-in events.
 * The class that is interested in processing a plug-in
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addPluginListener<code> method. When
 * the plug-in event occurs, that object's appropriate
 * method is invoked.
 *
 * @see PluginEvent
 */
public interface PluginListener extends EventListener 
{
	
	/**
	 * Plug-in added.
	 *
	 * @param e the plug-in event to add
	 */
	void pluginAdded(PluginEvent e);
	
	/**
	 * Plug-in removed.
	 *
	 * @param e the plug-in event to remove
	 */
	void pluginRemoved(PluginEvent e);
}
