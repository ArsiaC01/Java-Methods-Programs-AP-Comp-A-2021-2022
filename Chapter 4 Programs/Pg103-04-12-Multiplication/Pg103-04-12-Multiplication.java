// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
public class multiplication
{
	public static void main(String [] args)
	{
		System.out.println(product(10, 5));
	}
	
	public static int product(int a, int b)
	{
		int result = 0;
		for(int counter = 0; counter < b; counter++)
		{
			result = result + a;
		}
		return result;
	}
}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
