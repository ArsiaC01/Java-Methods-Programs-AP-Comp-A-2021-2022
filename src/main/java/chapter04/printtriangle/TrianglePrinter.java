// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter04.printtriangle;

/**
 * A class that provides methods to print stars and triangles.
 */
public class TrianglePrinter {
    /**
     * Prints a given number of stars on the same line.
     *
     * @param stars The number of stars.
     */
    public static void printStars(int stars) {
        for (int counter = 0; counter <= stars; counter++) {
            System.out.print("*");
        }
    }

    /**
     * Prints a right triangle made of stars.
     *
     * @param lineNum The number of lines high the triangle is to be printed.
     */
    public static void printTriangle(int lineNum) {
        for (int counter = 0; counter < lineNum; counter++) {
            printStars(counter);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}