package application.extensions;

import java.io.File;
import java.io.FilenameFilter;

/**
 * The Class OnlyClassFile.
 */
public class OnlyClassFile implements FilenameFilter
{
	
	/** The extension. */
	protected String extension;
	
	/**
	 * Instantiates a new only class file.
	 */
	public OnlyClassFile()
	{
		this.extension = ".class";
	}
	
	@Override
	public boolean accept(File dir, String name) 
	{
		if (name.endsWith(extension))
		{
			try {
				return Extension.class.isAssignableFrom(Class.forName(name.substring(0, name.length()-6)));
			} catch (ClassNotFoundException e) {
				return false;
			}
		}
		return false;
	}
}
