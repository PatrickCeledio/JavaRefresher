package com.patrickceledio;

import java.util.*;
import java.util.stream.IntStream;

public class TypeCasting {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        // Type casting -- Small to long (easy)
        int smInt = 10;
        long smLong = smInt;

        // Type casting -- double to int
        double cDbl = 1.234;
        int cInt = (int) cDbl;
        System.out.println(cInt); // cInt loses cDbl's decimal places

        // long to int -- weird results
        long bigLong = 2341232145L;
        int bInt = (int) bigLong;
        System.out.println("long to int: " + bInt);

        // String to int
        String favNum = Double.toString(420.69);
        System.out.println("Double to String: " + favNum);
        // Convert String to int
        int strInt = Integer.parseInt("10"); // Other data types follow along this format-- Byte.parseByte()
        System.out.println("String to int: " + strInt);
    }
}
