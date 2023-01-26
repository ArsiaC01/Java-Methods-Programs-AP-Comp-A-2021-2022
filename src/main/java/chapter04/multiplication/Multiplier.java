// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter04.multiplication;

/**
 * A class that provides an iterative addition implementation (i.e., multiplication).
 */
public class Multiplier {
    /**
     * Multiplies two numbers by iterative addition.
     * <p>
     * This method of multiplication restricts <i>b</i> to positive integers, since adding a number <i>n</i> times,
     * where <i>n</i> is not a natural number, does not make sense. Theoretically, <i>a</i> could be any real number,
     * however for simplicity's sake, <i>a</i> is made to be an integer.
     *
     * @param a Any integer.
     * @param b Any positive integer.
     * @return The product of <i>a</i> and <i>b</i>. If <i>b</i> is negative, returns {@code 0}.
     */
    public static int product(int a, int b) {
        int result = 0;
        for (int counter = 0; counter < b; counter++) {
            result = result + a; // Does not run if "counter < b" is impossible
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(product(10, 5));
    }
}