// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
import java.util.Scanner;

public class theYear
{
	public static void main(String[] args)
	{
		Scanner theScanner = new Scanner(System.in);
		
		System.out.print("Please input your year: ");
		int years = theScanner.nextInt();
		
		theScanner.close();
		
		Boolean bool = isLeapYear(years);
		if (bool == true)
			System.out.println("This is a leap year");
		else
			System.out.println("This is NOT a leap year");
	}
	
	public static Boolean isLeapYear(int year)
	{
	    if (year % 4 == 0) 
	    {

	      if (year % 100 == 0) 
	      {

	        if (year % 400 == 0)
	          return true;
	        else
	          return false;
	      }
	      else
	        return true;
	    }
	    else
	    	return false;
	}
}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.