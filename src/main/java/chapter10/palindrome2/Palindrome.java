// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter10.palindrome2;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toUpperCase;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("mad' dam"));
    }

    public static boolean isPalindrome(String word)
    {
        //Gets length of word
        int length = word.length();
        //Initialize new char array
        char[] wordChar;
        //Converts String word to char array
        wordChar = word.toCharArray();

        //Gets length of char array without the special characters included
        int lengthLetterAndWord = numOfLetterDigit(wordChar);

        //Initializes wordChar2 array, which is as long as the num of letters and numbers
        char[] wordChar2 = new char[lengthLetterAndWord];

        int counter2 = 0;
        //Removes all the special characters from the char array
        for (int counter = 0; counter < length; counter++)
        {
            //If specific character is not a letter or digit
            if (isLetterOrDigit(wordChar[counter]))
            {
                wordChar2[counter2] = toUpperCase(wordChar[counter]);
                counter2++;
            }
        }

        //Creates new char array the same length as wordChar2
        char[] wordChar2Reversed = new char[lengthLetterAndWord];

        int forwardCounter = 0;
        //Reverses the char array
        for (int backCounter = lengthLetterAndWord - 1; backCounter >= 0; backCounter--)
        {
            wordChar2Reversed[forwardCounter] = wordChar2[backCounter];
            forwardCounter++;
        }

        //Checks if the arrays are equal. If they
        for(int counter3 = 0; counter3 < lengthLetterAndWord - 1; counter3++)
        {
            //If wordChar2 is not equal to the reversed wordChar2, then return false.
            if(wordChar2[counter3] != wordChar2Reversed[counter3])
                return false;
        }
        return true;
    }

    //Returns the number of letters and numbers in the char array
    private static int numOfLetterDigit(char[] charArray)
    {
        int count = 0;
        for(int counter3 = 0; counter3 < charArray.length; counter3++)
        {
            if(isLetterOrDigit(charArray[counter3]))
            {
                count++;
            }
        }
        return count;
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

    public static boolean isPalindromeU(String word)
    {
        StringBuilder theWord = new StringBuilder();

        int length = word.length();
        for (int counter = 0; counter < length; counter++)
        {
            //Gets char for the specific position in the string from the counter
            char character = theWord.charAt(counter);
            //If the character is a letter/digit
            if (!isLetterOrDigit(character))
            {
                theWord.deleteCharAt(counter);
            }
            word = String.valueOf(theWord);
        }

        length = word.length(); //Length = 6
        StringBuilder backLetter = new StringBuilder();

        for (int backCounter = length - 1; backCounter >= 0; backCounter--)
        {
            //Gets first character and last character
            backLetter.append(word.charAt(backCounter));
        }
        System.out.println(word);
        return backLetter.toString().compareTo(word) == 0;
    }
}
