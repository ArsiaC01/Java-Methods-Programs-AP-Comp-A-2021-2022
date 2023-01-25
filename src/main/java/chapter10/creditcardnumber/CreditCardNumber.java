// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter10.creditcardnumber;

public class CreditCardNumber {
    public static void main(String[] args) {
        String creditCardNum = "4111 1111 1111 1111";
        String last4 = creditCardNum.substring(creditCardNum.length() - 4);
        String last5 = creditCardNum.substring(creditCardNum.length() - 6);
        System.out.println("Last 4 digits are: " + last4);
        System.out.println("Last 5 digits are: " + last5.replace(" ", ""));
    }
}