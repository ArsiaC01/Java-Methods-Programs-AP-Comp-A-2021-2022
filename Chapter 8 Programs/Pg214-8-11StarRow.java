// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
public class Stars {

	public static void main(String[] args) 
	{
		printStarTriangle(500);

	}
	
	public static void printStarTriangle(int numberOfRow)
	{
		int numStar = 1;
		int numRowLeft = numberOfRow - 1;
		
		for (int rowCounter = 1; rowCounter < numberOfRow; rowCounter++)
		{
			for (int spaceCounter = 1; spaceCounter < numRowLeft; spaceCounter++)
			{
				System.out.print(" ");
			}
			
			for (int starCounter = 1; starCounter <= numStar; starCounter++)
			{
				System.out.print("*");
			}
			System.out.println();
			numStar += 2;
			numRowLeft--;
		}
	}
}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.