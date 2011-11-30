package testfilenamefilter;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyClassFile implements FilenameFilter
{
	protected String extention;
	
	public OnlyClassFile()
	{
		this.extention = ".class";
	}
	
	@Override
	public boolean accept(File dir, String name) 
	{
		return name.endsWith(extention);
	}
}
