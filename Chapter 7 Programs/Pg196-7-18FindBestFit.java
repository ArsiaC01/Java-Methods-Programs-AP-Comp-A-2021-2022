// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
import java.util.Scanner;

public class theClass {

	public static void main(String[] args)
	{
		Scanner theScanner = new Scanner(System.in);
		
		System.out.print("Enter the first file size: ");
		int size1 = theScanner.nextInt();
		System.out.print("Enter the second file size: ");
		int size2 = theScanner.nextInt();
		System.out.print("Enter the total storage space: ");
		int space = theScanner.nextInt();
		
		System.out.println(findBestFit(size1, size2, space));
	}
	
	public static int findBestFit(int size1, int size2, int space)
	{
		int bothSize = size1 + size2;
		int returnValue;
		
		if (bothSize <= space)
		{
			returnValue = 3;
		}
		else if (size2 > size1 && size2 <= space)
		{
			returnValue = 2;
		}
		else if (size1 >= size2 && size1 <= space)
		{
			returnValue = 1;
		}
		else
			returnValue = 0;
			
		return returnValue;
	}
}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.