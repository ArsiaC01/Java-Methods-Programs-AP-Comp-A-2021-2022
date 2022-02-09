// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
public class printStar {

	public static void main(String[] args)
	{
		printTriangle(5);
	}
	
	public static void printStars (int starNum)
	{
		for (int counter = 0; counter <= starNum; counter++)
		{
			System.out.print("*");
		}
	}
	
	public static void printTriangle(int lineNum)
	{
		for(int counter = 0; counter < lineNum; counter++)
		{
			printStars(counter);
			System.out.println();
		}
	}

}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
