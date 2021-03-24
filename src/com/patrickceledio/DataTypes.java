package com.patrickceledio;

import java.util.*;
import java.util.stream.IntStream;

public class DataTypes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Primitive data types - byte, short, char, boolean, int, float, double, long

        // Min and max values of primitive
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE);
        System.out.println("Char Max: " + Character.MAX_VALUE+0); // 66,535
        System.out.println("Char Min: " + Character.MIN_VALUE+0);
        System.out.println("Int Max: " + Integer.MAX_VALUE);
        System.out.println("Int Min: " + Integer.MIN_VALUE);
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Min: " + Float.MIN_VALUE);
        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE);
        System.out.println("Long Max: " + Long.MAX_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE);

        // boolean holds only true or false
        boolean happy = true;
        // char can only store single characters; single quotations only
        char a = 'p';
        // \n -- new line
        // \t -- tabs
        // \b -- backspaces
        // \f -- form feeds
        // \r -- returns

        // End float variables with F
        float fNum  = 1.11111111111111111111F;
        float fNum2 = 1.11111111111111111111F;

        // 6 points of precision
        System.out.println("Float: " + (fNum + fNum2));

        // Double allows 15 points of precision
        double dblNum  = 1.11111111111111111111;
        double dblNum2 = 1.11111111111111111111;
        System.out.println("Double: " + (dblNum + dblNum2));

        // Sci notation works
        double thousand = 1e+3;
        System.out.println("Scientific notation works in Java! 1e+3 = " + thousand);

        // Long numbers -- We can use underscores to separate numbers for readability
        long bigNum = 123_456_789;
        System.out.println("bigNum: " + bigNum);




    }
}
