using System;

public class Automobile
{
	private int idNum;
	private int make;
	private int year;
	private double price;

	public Automobile(int idNum, int make, int year, double price)
	{
		this.idNum = idNum;
		this.make = make;
		this.year = year;
		this.price = price;
	}

	public override string ToString()
    {
		string theString;
		theString = $"idNum: {idNum}\n" +
            $"Make: {make}\n" +
            $"Year: {year}\n" +
            $"Price: {price}";
		return theString;
    }

	public int IdNum
    {
        get { return idNum; }
    }
	public int Make
    {
		get { return make; }
    }
	public int Year
    {
		get { return year; }
    }
	public double Price
    {
		get { return price; }
    }
}
