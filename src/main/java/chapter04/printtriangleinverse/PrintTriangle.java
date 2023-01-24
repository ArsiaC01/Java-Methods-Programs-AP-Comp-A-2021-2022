package chapter04.printtriangleinverse;

// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
public class PrintTriangle
{
	public static void main(String [] args){
	    String p = "";
	    printTriangle(5, p);
	}   

	public static String printTriangle(int starNum, String display)
	{
		if(starNum <= 0) return "";

		display = display + "*";
		printTriangle(starNum-1, display);
		System.out.println(display);

		return display;
	}
}
