package chapter04.multiplicationrecursive;

// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
public class Multiplication {

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