// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter07.datetest;

import java.util.Scanner;

public class DateComparator {
    /**
     * Compares two dates. No input verification.
     * @return {@code true} if the first date is strictly later in the year and {@code false} otherwise.
     */
    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
        if (year1 == year2) {
            if (month1 == month2) {
                return day1 > day2;
            } else {
                return month1 > month2;
            }
		} else {
            return year1 > year2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (month day year): ");
        int month1 = scanner.nextInt();
        int day1 = scanner.nextInt();
        int year1 = scanner.nextInt();

        System.out.print("Enter the second date (month day year): ");
        int month2 = scanner.nextInt();
        int day2 = scanner.nextInt();
        int year2 = scanner.nextInt();

        System.out.println();  // newline

        String message = month1 + "/" + day1 + "/" + year1 + " ";
        if (isLater(month1, day1, year1, month2, day2, year2)) {
			message += "IS";
		} else {
			message += "is NOT";
		}
        message += " later than " + month2 + "/" + day2 + "/" + year2 + ".";
        System.out.println(message);
    }
}