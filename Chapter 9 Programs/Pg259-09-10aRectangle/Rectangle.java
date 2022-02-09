import java.lang.Math;

public class Rectangle
{
    private int width;
    private int height;

    public Rectangle(int width, int height)
    {
        if (width > 0)
            this.width = width;
        if (height > 0)
            this.height = height;

    }
    public Rectangle(int singleSize)
    {
        width = singleSize;
        height = singleSize;
    }
    public Rectangle ()
    {
        width = 1;
        height = 1;
    }

    public String isSquare()
    {
        if (width == height)
            return "is";
        else
            return "isn't";
    }

    public int Quadratize()
    {
        double area = width * height;
        double newSideLength = Math.sqrt(area);
        return (int) newSideLength;

    }
}
