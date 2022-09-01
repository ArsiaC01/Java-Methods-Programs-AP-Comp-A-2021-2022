// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
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