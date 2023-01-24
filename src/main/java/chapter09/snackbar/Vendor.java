// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter09.snackbar;

/**
 * This class implements a vendor that sells one kind of items. A vendor carries out sales transactions.
 */
public class Vendor {
    private final int price;
    private int stock;
    private int deposit;
    private int change;

    /**
     * Constructs a Vendor.
     * @param price the price of a single item in cents (int)
     * @param stock number of items to place in stock (int)
     */
    public Vendor(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    /**
     * @return The number of items currently in stock.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets the quantity of items in stock.
     * @param qty The number of items to place in stock.
     */
    public void setStock(int qty) {
        stock = qty;
    }

    /**
     * Makes a sale depending on the current contents of the stock and deposit field. If the deposited
     * amount is greater than the price, the change is moved into the change field.
     * @return {@code true} if the sale was successful and {@code false} otherwise.
     */
    public boolean makeSale() {
        boolean saleIsSuccess = stock > 0 && deposit > price;

        if (saleIsSuccess) {
            change = deposit - price;
            stock--;
        } else {
            change = deposit;
        }
        deposit = 0;
        return saleIsSuccess;
    }

    /**
     * @param cents The number of cents to be added to the deposit.
     */
    public void addMoney(int cents) {
        deposit += cents;
    }

    /**
     * Takes and clears the money in the change box.
     * @return The number of cents taken from the change box.
     */
    public int getChange() {
        int tempChange = change;
        change = 0;
        return tempChange;
    }

    /**
     * @return The number of cents in the deposit.
     */
    public int getDeposit() {
        return deposit;
    }
}
