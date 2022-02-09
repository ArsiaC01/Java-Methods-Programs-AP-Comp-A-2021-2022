// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.import java.util.Scanner;
import java.lang.Math;

public class TheProgram {

	public static void main(String[] args)
	{

		System.out.println("The dog's age is: " + convertToHumanAge(3));
	}
	
	public static int convertToHumanAge (int dogYears)
	{
		double dogAge = 0;
		final double  POST = 5.3333333333;
		
		if (dogYears > 0)
		{
			dogAge += 13;
			dogAge += (POST * (dogYears - 1));
		}
		return (int) Math.round(dogAge);
	}
	
	

}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.