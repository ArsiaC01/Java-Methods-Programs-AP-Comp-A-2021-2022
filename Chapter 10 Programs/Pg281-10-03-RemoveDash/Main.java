package com.company;

public class Main {

    public static void main(String[] args) {
        String stringSecurityNum = "987-65-4321";
        System.out.println(removeDashes(stringSecurityNum));
    }

    public static String removeDashes(String socialSecurityNum) {
        return socialSecurityNum.replace("-", "");
    }
}
