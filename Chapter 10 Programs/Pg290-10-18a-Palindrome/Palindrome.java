// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package com.company;

import java.lang.*;

import static java.lang.Character.isLetterOrDigit;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println(isPalindromeU("madd am"));
    }

    public static boolean isPalindromeU(String word)
    {
        StringBuilder theWord = new StringBuilder();

        int length = word.length();
        for(int counter = 0; counter < length; counter++)
        {
            //Gets char for the specific position in the string from the counter
            char character = theWord.charAt(counter);
            //If the character is a letter/digit
            if(!isLetterOrDigit(character))
            {
                theWord.deleteCharAt(counter);
            }
            word = String.valueOf(theWord);
        }

        length = word.length(); //Length = 6
        String backLetter = "";

        for (int backCounter = length - 1; backCounter >= 0; backCounter--)
        {
            //Gets first character and last character
            backLetter += word.substring(backCounter, backCounter + 1);
        }
        System.out.println(word);
        return backLetter.compareTo(word) == 0;
    }

    public static boolean isPalindrome(String word)
    {
        int length = word.length(); //Length = 6
        String backLetter = "";

        for (int backCounter = length - 1; backCounter >= 0; backCounter--)
        {
            //Gets first character and last character
            backLetter += word.substring(backCounter, backCounter + 1);
        }
        return backLetter.compareTo(word) == 0;
    }

    //Alternative method of finding palindromes using charAt()
    public static boolean isPalindrome2(String word)
    {
        int length = word.length();
        for (int counter = 0; counter < (length / 2); ++counter)
        {
            if (word.charAt(counter) != word.charAt(length - counter - 1))
            {
                return false;
            }
        }
        return true;
    }
}
