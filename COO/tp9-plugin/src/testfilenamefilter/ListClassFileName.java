package testfilenamefilter;

import java.io.*;
class ListClassFileName 
{
	public static void main(String args[]) 
	{
		Object a = "salut";
		System.out.println(a.toString());
		String dirname = "bin/testfilenamefilter";

		File f1 = new File(dirname);

		FilenameFilter only = new OnlyClassFile();
		
		String s[] = f1.list(only);
		for (int i=0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
	}
}