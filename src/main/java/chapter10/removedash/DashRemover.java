// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter10.removedash;

public class DashRemover {
    public static String removeDashes(String socialSecurityNum) {
        return socialSecurityNum.replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println(removeDashes("987-65-4321"));
    }
}