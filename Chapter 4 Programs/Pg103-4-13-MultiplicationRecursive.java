// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
public class multiplication {

	public static void main(String[] args)
	{
		System.out.println(product(10, 5));

	}
	
	public static int product(int a, int b)
	{
	    if ((a == 0) || (b == 0))
	        return 0;
	    else
	        return (a + product(a, b - 1));

	}
}
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.