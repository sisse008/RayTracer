//GetInput.java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

//static dictionary with input key words


//get access to file input.txt


//read file line by line
	//if line has a word
		//if word is in dictionary
			//get numerical value of key word
			// dictionary[key word] = numerical value


class InputData
{
	public static 

	public static Point eye;
	public static Vector viewDirection;
	public static Vector upDirection;
	public static double fovh;
	public static double[] imageSize = new double[2];
	public static Color bkgcolor;
	public static Color currentMtlColor;
	public static ArrayList<Sphere> spheres = new ArrayList<Sphere>();

}

public class GetInput
{

	private static String GetFileContent(String filename)
	{
		String content = "";
		try
		{
			content = new Scanner(new File(filename)).useDelimiter("\\Z").next();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return content;
	}

	private static int CountLines(String str)
	{
	   	String[] lines = str.split("\r\n|\r|\n");
	   	return  lines.length;
	}

	public static void main(String[] args)
	{

		String content = GetFileContent("input.txt");
		//System.out.println(content);
		//System.out.println("number of lines in string = " + CountLines(content));
		String lines[] = content.split("\\r?\\n");
		for(int i=0; i<lines.length; i++)
		{
			System.out.println(lines[i]);
		}
	}

}