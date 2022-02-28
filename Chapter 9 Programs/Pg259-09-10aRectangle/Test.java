// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
public class Test
{
    public static void main(String[] args)
    {
        Rectangle theRectangle = new Rectangle(2, 8);
        System.out.println("The rectangle " + theRectangle.isSquare() + " a square.");

        int newLength = theRectangle.Quadratize();
        System.out.println("Converted to a square, the closest side length is: " + newLength);
    }
}
