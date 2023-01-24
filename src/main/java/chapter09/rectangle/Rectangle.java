package chapter09.rectangle;// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
import java.lang.Math;

/**
 * A class representing a simple 2D rectangle.
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * Constructs a {@link Rectangle} by width and height.
     * @param width The width. Defaults to 1 if a non-positive width is given.
     * @param height The height. Defaults to 1 in a non-positive height is given.
     */
    public Rectangle(int width, int height) {
        if (width <= 0) {
            this.width = 1;
        } else {
            this.width = width;
        }
        if (height <= 0) {
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    /**
     * Constructs a square {@link Rectangle} object with the given side length.
     * @param sideLength The side length.
     */
    public Rectangle(int sideLength) {
        width = sideLength;
        height = sideLength;
    }

    /**
     * Constructs a default square {@link Rectangle} object with a width and height of 1.
     */
    public Rectangle() {
        width = 1;
        height = 1;
    }

    /**
     * @return If this rectangle has an equal height and width, i.e., if it is a square.
     */
    public boolean isSquare() {
        return width == height;
    }

    /**
     * Calculates the side length of the square closest in area to this rectangle.
     * @return An integer side length.
     */
    public int quadratize() {
        double area = width * height;
        double newSideLength = Math.sqrt(area);
        return (int) newSideLength;
    }
}
