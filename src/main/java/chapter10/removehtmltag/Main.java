// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter10.removehtmltag;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        String testStatement = "<a>ThisIstheSequenceofCharacters</a>";
        System.out.println(removeTag(testStatement));
    }

    public static String removeTag(String statementToCheck)
    {
        //Converts the string to an array of characters
        char[] statementArray = statementToCheck.toCharArray();
        //Arrays start at 0, and final is length - 1

        for(int counter = 0; counter < statementArray.length; counter++)
        {
            if(statementArray[counter] == '>' || statementArray[counter] == '<')
            {
                statementArray[counter] = ' ';
            }
        }
        return Arrays.toString(statementArray);
    }

}
