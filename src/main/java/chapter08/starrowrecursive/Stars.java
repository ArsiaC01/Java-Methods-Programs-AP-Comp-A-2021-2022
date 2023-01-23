package chapter08.starrowrecursive;

// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
public class Stars
{	
	
	public static int rowCounter = 1;
	public static void main(String[] args)
	{
		int numberOfRow = 23;
		IntermediateStepToMakeThisRecursive(numberOfRow);
	}
	public static void IntermediateStepToMakeThisRecursive(int numberOfRow)
	{
		int numStar = 1;
		int numRowLeft = numberOfRow - 1;
		RowCounter(numberOfRow, numRowLeft, numStar);
	}
	
	public static void RowCounter(int numberOfRow, int numRowLeft, int numStar)
	{
		if (rowCounter < numberOfRow)
		{
			SpaceCounter(numRowLeft);
			StarCounter(numStar);
			numStar += 2;
			numRowLeft--;
			rowCounter++;
			if (rowCounter < numberOfRow)
				RowCounter(numberOfRow, numRowLeft, numStar);
		}
	}
	
	public static void SpaceCounter(int numRowLeft)
	{
		int spaceCounter = 1;
		while (spaceCounter < numRowLeft)
		{
			System.out.print(" ");
			spaceCounter++;
			/*if(spaceCounter < numRowLeft)
				SpaceCounter(numRowLeft);*/
		}
	}
	
	public static void StarCounter(int numStar)
	{
		int starCounter = 1;
		while (starCounter <= numStar)
		{
			System.out.print("*");
			starCounter++;
			/*if(starCounter < numStar)
			StarCounter(numStar);*/
		}
		System.out.println();
	}
}