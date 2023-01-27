// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter07.leapyear;

import java.util.Scanner;

/**
 * A class that provides a method that determines if a year is a leap year.
 */
public class LeapYearChecker {
    /**
     * Determines if the given year is a leap year in the Gregorian calendar.
     * <p>
     * Accurate only for positive integers as there is no 0 CE. Since the common era and before it starts at year
     * 1, negative numbers are not accurately computed as years BCE.
     *
     * @param year a positive integer year.
     * @return {@code true} if it is a leap year in the common era, undefined otherwise.
     */
    public static Boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);

        System.out.print("Please input your year: ");
        int years = theScanner.nextInt();
        theScanner.close();

        if (isLeapYear(years)) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is NOT a leap year");
        }
    }
}