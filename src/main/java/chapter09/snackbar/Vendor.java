// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter09.snackbar;

/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */

public class Vendor
{
    private final int price;  //the price of a single item in cents
    private int stock; //number of items to place in stock
    private int deposit; //number of cents deposited
    private int change; //number of cents currently in change

    /**
     * Constructs a Vendor
     *
     * @param price the price of a single item in cents (int)
     * @param stock number of items to place in stock (int)
     */
    public Vendor(int price, int stock)
    {
        this.price = price;
        this.stock = stock;
    }

    /**
     * Returns the number of items currently in stock.
     *
     * @return number of items currently in stock (int)
     */
    public int getStock()
    {
        return stock;
    }

    /**
     * Sets the quantity of items in stock.
     *
     * @param qty number of items to place in stock (int)
     */
    public void setStock(int qty)
    {
        stock = qty;
    }

    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock
     * and calculates and sets change and returns true;
     * otherwise refunds the whole deposit (moves it into
     * change) and returns false.
     *
     * @return true for a successful sale, false otherwise (boolean)
     */
    public boolean makeSale()
    {
        if (stock > 0 && deposit > price)
        {
            change = deposit - price;
            deposit = 0;
            stock--;
            return true;
        }
        change = deposit;
        deposit = 0;
        return false;
    }

    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     *
     * @param number of cents to add to the deposit (int)
     */
    public void addMoney(int number)
    {
        deposit += number;
    }

    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     *
     * @return number of cents in the current change (int)
     */
    public int getChange()
    {
        int tempchange = change;
        change = 0;
        return tempchange;
    }

    /**
     * Returns the currently deposited amount (in cents).
     *
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit()
    {
        return deposit;
    }
}
