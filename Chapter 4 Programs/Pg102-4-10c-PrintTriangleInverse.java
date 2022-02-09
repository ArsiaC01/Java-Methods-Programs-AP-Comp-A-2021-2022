// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
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
