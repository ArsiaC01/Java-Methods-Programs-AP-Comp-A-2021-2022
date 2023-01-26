// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter04.printtriangleinverse;

/**
 * A class that provides a method to print an inverted triangle recursively.
 */
public class InvertedTrianglePrinter {
    /**
     * Prints an inverted right triangle made out of stars using recursion.
     *
     * @param stars The number of stars to be printed on the first line.
     * @param display The current string. For a standard triangle, a string of {@code ""} should be passed, but
     *                additional constant width can be added by passing in a string of asterisks.
     */
    public static void printTriangle(int stars, String display) {
        if (stars <= 0) {
            return;
        }

        display = display + "*";
        printTriangle(stars - 1, display);
        System.out.println(display);
    }

    public static void main(String[] args) {
        String p = "";
        printTriangle(5, p);
    }
}
