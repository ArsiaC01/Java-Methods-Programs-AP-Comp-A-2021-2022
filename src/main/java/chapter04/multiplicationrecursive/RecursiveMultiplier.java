// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter04.multiplicationrecursive;

/**
 * A class that provides an iterative addition implementation by recursion.
 */
public class RecursiveMultiplier {
    /**
     * Multiplies two numbers by iterative addition using recursion.
     * <p>
     * This method of multiplication restricts <i>b</i> to positive integers. Again, <i>a</i> could be any real
     * number, but is an integer for simplicity.
     *
     * @param a Any integer.
     * @param b Any positive integer.
     * @return The product of <i>a</i> and <i>b</i>.
     * @throws StackOverflowError If a negative integer is passed to <i>b</i>. Because of the way this is implemented,
     * passing a negative number to <i>b</i> runs the function and never reaches the base case (i.e., never satisfies
     * the conditions needed to end recursion). Thus, the call stack's maximum allowed depth is reached with infinite
     * recursion and the fatal {@link StackOverflowError} is thrown. This is a reason recursion should be used
     * cautiously.
     */
    public static int product(int a, int b) {
        if ((a == 0) || (b == 0)) { // StackOverflowError could be avoided if "b == 0" is changed to "b <= 0"
            return 0;
        } else {
            return (a + product(a, b - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(product(10, 5));
    }
}