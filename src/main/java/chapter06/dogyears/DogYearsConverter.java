// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter06.dogyears;

import java.lang.Math;

/**
 * A class that provides a method to convert dog years to human years.
 */
public class DogYearsConverter {
    private static final double DOG_TO_HUMAN_YEAR_RATE = 5.3333333333;

    /**
     * Converts the given age in dog years to the equivalent age in human years.
     * @param dogYears an age in dog years.
     * @return the age in human years. If zero or a negative integer was passed, this returns zero.
     */
    public static int convertToHumanAge(int dogYears) {
        double dogAge = 0;

        if (dogYears > 0) {
            dogAge += 13;
            dogAge += DOG_TO_HUMAN_YEAR_RATE * (dogYears - 1);
        }
        return (int) Math.round(dogAge);
    }

    public static void main(String[] args) {
        System.out.println("The dog's age is: " + convertToHumanAge(3));
    }
}