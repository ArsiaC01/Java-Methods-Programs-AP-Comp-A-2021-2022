package com.company;

public class Main
{
    public static void main(String[] args)
    {
        String creditCardNum = "4111 1111 1111 1111";
        String last4 = creditCardNum.substring(creditCardNum.length() - 4);
        String last5 = creditCardNum.substring(creditCardNum.length() - 6);
        System.out.println("Last 4 digits are: " + last4);
        System.out.println("Last 5 digits are: " + last5.replace(" ", ""));
    }
}