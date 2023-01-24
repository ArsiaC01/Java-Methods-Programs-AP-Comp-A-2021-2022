// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter09.coins;

public class Coins {
    private int quarters;
    private int nickles;
    private int dimes;
    private int pennies;

    public Coins(int cents) {
        int remainder = cents;

        quarters = cents / 25;
        remainder %= 25;

        dimes = remainder / 10;
        remainder %= 10;

        nickles = remainder / 5;
        remainder %= 5;

        pennies = remainder;
    }

    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickles() {
        return nickles;
    }

    public int getPennies() {
        return pennies;
    }
}
