package chapter09.rectangle;

// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 8);
        String squareness;
        if (rectangle.isSquare()) {
            squareness = "is";
        } else {
            squareness = "isn't";
        }

        System.out.println("The rectangle " + squareness + " a square.");

        int newLength = rectangle.quadratize();
        System.out.println("Converted to a square, the closest side length is: " + newLength);
    }
}
