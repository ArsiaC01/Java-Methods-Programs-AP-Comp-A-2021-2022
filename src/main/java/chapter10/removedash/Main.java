// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter10.removedash;

public class Main {

    public static void main(String[] args) {
        String stringSecurityNum = "987-65-4321";
        System.out.println(removeDashes(stringSecurityNum));
    }

    public static String removeDashes(String socialSecurityNum) {
        return socialSecurityNum.replace("-", "");
    }
}
//
