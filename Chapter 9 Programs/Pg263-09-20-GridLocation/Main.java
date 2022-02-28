// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package com.company;

import info.gridworld.grid.Location;

import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The distance between the two points is: " + Distance(new Location(9, 2), new Location(2, 2)));
    }

    public static int Distance(Location loc1, Location loc2)
    {
        int location1Row = loc1.getRow();
        int location1Column = loc1.getCol();
        int location2Row = loc2.getRow();
        int location2Column = loc2.getCol();

        int differenceRow = Math.abs((location2Row - location1Row));
        int differenceColumn = Math.abs((location2Column - location1Column));

        double hypotenuse = Math.pow(differenceRow, 2) + Math.pow(differenceColumn, 2);
        hypotenuse = Math.sqrt(hypotenuse);
        return (int) hypotenuse;
    }
}