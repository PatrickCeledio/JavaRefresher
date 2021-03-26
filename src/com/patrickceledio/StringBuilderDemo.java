package com.patrickceledio;

import java.util.*;
import java.util.stream.IntStream;

public class StringBuilderDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Syntax
        StringBuilder sb = new
                StringBuilder("I am a string builder!");

        // Return number of characters of sb
        System.out.println(sb.length());

        // Return size of sb
        System.out.println(sb.capacity());

        // Append a string or primitive to sb
        System.out.println(sb.append(" booyah!"));

        // Insert a string at a certain index
        System.out.println(sb.insert(6, " huge"));

        // Replace a sting at a certain index
        System.out.println(sb.replace(6, 19, " lego "));

        // Return substring of string
        System.out.println(sb.substring(6, 10));

        // Delete a string
        System.out.println(sb.delete(6, 10));

        // Return index of a char
        System.out.println(sb.charAt(6));

        // Return index of a substring within the string
        System.out.println(sb.indexOf("builder!"));

    }
}
