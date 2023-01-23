package chapter07.datetest;// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
import java.util.Scanner;

public class TheClass {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the first date  (month day year): ");
		int month1 = kb.nextInt();
		int day1 = kb.nextInt();
		int year1 = kb.nextInt();

		System.out.print("Enter the second date (month day year): ");
		int month2 = kb.nextInt();
		int day2 = kb.nextInt();
		int year2 = kb.nextInt();

		System.out.println();  // blank line

		String msg = month1 + "/" + day1 + "/" + year1;
		if (isLater(month1, day1, year1, month2, day2, year2))
			msg += " IS ";
		else
			msg += " is NOT ";
		    msg += "later than " + month2 + "/" + day2 + "/" + year2;
		System.out.println(msg);
	}
	
	public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
	{
		if (year1 > year2)
			return true;
		else if (year1 == year2)
		{
			if (month1 > month2)
				return true;
			else if (month1 == month2)
			{
				if (day1 > day2)
					return true;
				else 
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}

}