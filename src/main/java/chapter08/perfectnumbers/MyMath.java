package chapter08.perfectnumbers;// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.

public class MyMath
{
    /**
     * Returns the sum of all integers from 1 to n, if n >= 1,
     * and 0 otherwise.
     */
    public static int sumUpTo(int n)
    {
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        return sum;
    }

    /**
     *  Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
     */
    public static long factorial(int n)
    {
        long f = 1;

        for (int k = 2; k <= n; k++)
            f *= k;

        return f;
    }


    /**
     *  Tests Goldbach conjecture for even numbers
     *  up to bigNum
     */
    public static boolean testGoldbach(int bigNum)
    {
        for (int n = 6; n <= bigNum; n += 2)  // obviously true for n = 4
        {
            boolean found2primes = false;

            for (int p = 3; p <= n / 2; p += 2)
            {
                if (isPrime(p) && isPrime(n - p))
                    found2primes = true;
            }

            if (!found2primes)
            {
                System.out.println(n + " is not a sum of two primes!");
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args)
    {
        int counter = 1, sumOfFactors = 0, perfectFoundCounter = 0;
	  /*while(perfectFoundCounter <= 4)
	  {
		  sumOfFactors = 0;
		  factors.clear();
		  findFactors(counter);
		  for(int counter2 = 0; counter2 < (factors.size() - 1); counter2++)
		  {
			  sumOfFactors += factors.get(counter2);
		  }
		  if (sumOfFactors == counter)
		  {
			  System.out.println("Perfect number is " + counter);
			  perfectFoundCounter++;
		  }
		  counter++;
	  }*/

        int exponent = 1;
        long insideBracket, outsideBracket, perfectNum;
        boolean isItPrime;
        while (perfectFoundCounter < 8)
        {
            insideBracket = (CalcExponent(2, exponent) - 1);
            isItPrime = isPrime(insideBracket);

            if (isItPrime == true)
            {
                perfectFoundCounter++;
                outsideBracket = CalcExponent(2, (exponent - 1));
                perfectNum = outsideBracket * insideBracket;
                System.out.println("A perfect number is: " + perfectNum);
            }
            exponent++;
        }
    }

    //Calculates exponents and returns the result
    public static long CalcExponent(int base, int exponent)
    {
        long result = 1;
        while (exponent != 0)
        {
            result *= base;
            exponent--;
        }

        return result;
    }

    /**
     *  Returns true if n is a prime; otherwise returns false
     */
    public static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;

        long m = 2;

        while (m * m <= n)
        {
            if (n % m == 0)
                return false;
            m++;
        }

        return true;
    }
}