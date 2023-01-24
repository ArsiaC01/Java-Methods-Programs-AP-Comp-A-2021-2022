package chapter04.printtrianglerecursive;

// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
public class PrintTriangle
{

	public static void main(String[] args)
	{
		printTriangle(5);
	}
	
	public static String printTriangle (int starNum)
	{
	    String display;
		if(starNum <= 0)
	    	return "";

	    display = printTriangle(starNum - 1);
	    display = display + "*";
	    System.out.println(display);
	    
	    return display;
	 }
	/*Gets numbers of stars, then calls it recursively with (num of stars - 1), then prints a 
	 * line with n stars. It does nothing of num of stars = 0*/

}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
