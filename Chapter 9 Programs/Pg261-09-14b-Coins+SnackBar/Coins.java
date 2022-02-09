package com.company;

public class Coins
{
    private int quarters, nickles, dimes, pennies;
    public Coins(int cents)
    {
        int remainder;
        quarters = (cents / 25);
        remainder = cents % 25;
        dimes = (int) (remainder / 10);
        remainder %= 10;
        nickles = (int) (remainder / 5);
        remainder %= 5;
        pennies = remainder;
        remainder %= 1;
    }
    public int getQuarters()
    {
        return quarters;
    }
    public int getDimes()
    {
        return dimes;
    }
    public int getNickles()
    {
        return nickles;
    }
    public int getPennies()
    {
        return pennies;
    }
}
