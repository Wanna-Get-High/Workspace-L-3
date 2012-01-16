package application.extensions;

import java.util.EventObject;

/**
 * The Class PluginEvent.
 */
public class PluginEvent extends EventObject
{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The extension. */
	protected Extension extension;
	
	/**
	 * Instantiates a new plug-in event.
	 *
	 * @param source the source of the event
	 * @param ext the extension
	 */
	public PluginEvent(Object source, Extension ext)
	{
		super(source);
		this.extension = ext;
	}

	/**
	 * Gets the extension.
	 *
	 * @return the extension
	 */
	public Extension getExtension()
	{
		return this.extension;
	}
}
