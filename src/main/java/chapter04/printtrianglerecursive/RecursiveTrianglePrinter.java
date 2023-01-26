// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter04.printtrianglerecursive;

/**
 * A class that provides a method to print a triangle recursively.
 */
public class RecursiveTrianglePrinter {
    /**
     * Prints a right triangle made out of stars using recursion.
     *
     * @param stars The number of stars to be printed on the first line.
     * @return The current string. This is not a useful value, it's only used for passing values back from recursion.
     */
    public static String printTriangle(int stars) {
        if (stars <= 0) {
            return "";
        }

        String display = printTriangle(stars - 1);
        display = display + "*";
        System.out.println(display);

        return display;
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}