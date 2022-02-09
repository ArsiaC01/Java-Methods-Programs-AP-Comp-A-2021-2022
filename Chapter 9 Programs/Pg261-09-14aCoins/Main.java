package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please input the amount of coins: ");
        int coins = scanner1.nextInt();
        Coins coin1 = new Coins(coins);

        System.out.println(coins + " coins can be represented as " +
                coin1.getQuarters() + " quarters, " +
                coin1.getDimes() + " dimes, " +
                coin1.getNickles() + " nickles, " +
                coin1.getPennies() + " pennies."
        );

        scanner1.close();
    }
}
