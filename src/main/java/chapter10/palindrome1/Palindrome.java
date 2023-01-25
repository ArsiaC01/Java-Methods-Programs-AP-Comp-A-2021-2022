// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter10.palindrome1;

import java.lang.*;

import static java.lang.Character.isLetterOrDigit;

/**
 * A class containing utility functions for determining palindromes.
 */
public class Palindrome {
    /**
     * Determines if the given string is a palindrome. This method considers only
     * letter or digit characters, so whitespace is ignored.
     * <p>
     * This method implements palindrome-checking by {@link #isPalindrome(String) isPalindrome()},
     * so it uses the {@link String#substring(int, int) substring()} method, which is discouraged.
     * @see #isPalindrome(String) isPalindrome()
     * @param input Any string.
     * @return {@code true} if all letter or digit characters are palindromic, {@code false} otherwise.
     */
    public static boolean isPalindromeIgnoreWhitespace(String input) {
        StringBuilder sb = new StringBuilder();
        int length = input.length();

        for (int counter = 0; counter < length; counter++) {
            char character = sb.charAt(counter); // Gets char at the index of current counter value
            if (!isLetterOrDigit(character)) {
                sb.deleteCharAt(counter);
            }
        }
        return isPalindrome(sb.toString());
    }

    /**
     * Determines if the given string is a palindrome using {@link String#substring(int, int) substring()}
     * method. This method considers characters that are not letters or digits, so whitespace is
     * significant.
     * <p>
     * This method is much less readable than {@link #isPalindromeCharAt(String) isPalindromeCharAt()}
     * with negligible improvements in performance. This implementation is discouraged.
     * @param input Any string.
     * @return {@code true} if all characters are palindromic, {@code false} otherwise.
     */
    public static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder();
        int length = input.length();

        for (int backCounter = length - 1; backCounter >= 0; backCounter--) {
            sb.append(input.substring(backCounter, backCounter + 1));
        }
        return sb.toString().compareTo(input) == 0;
    }

    /**
     * Determines if the given string is a palindrome using the {@link String#charAt(int) charAt()}
     * method. This method considers characters that are not letters or digits, so whitespace
     * is significant.
     * @param input Any string.
     * @return {@code true} if all characters are palindromic, {@code false} otherwise.
     */
    public static boolean isPalindromeCharAt(String input) {
        int length = input.length();

        for (int counter = 0; counter < (length / 2); counter++) {
            if (input.charAt(counter) != input.charAt(length - counter - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeIgnoreWhitespace("madd am"));
    }
}
