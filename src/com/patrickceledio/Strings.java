package com.patrickceledio;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        // Strings -- Objects, reference types
        String name = "Patrick";
        System.out.println(name);
        String wholeName = name + " Celedio is my name ahhhhh!";
        System.out.println(wholeName);
        String nameNumber = "Might No." + 9;
        System.out.println(nameNumber);

        // Get the exact char of a string
        System.out.println("First letter of my name : " + name.charAt(0));

        // Check if string contains seq of characters
        System.out.println("Does my name contain 'trick'? " + name.contains("trick"));
        System.out.println("At what index is it located? " + name.indexOf("trick"));
        System.out.println("How many letters does my name contain " + name.length());

        // String equivalence
        System.out.println("Does my name equal Padrick? " + name.equalsIgnoreCase("Padrick"));
        System.out.println("");

        // 0 -- String is the same
        // < 0 if the string is lexicographically less than the other string
        // > 0 if the string is lexicographically greater than the other string (more characters)
        System.out.println(wholeName.compareTo("Patrick Celedio"));

        // Replace string to another string
        System.out.println(wholeName.replace("Patrick", "Sebastian"));

        // Returns a new string which is the substring of the given string
        System.out.println(wholeName.substring(0,7));

        // Run through string, finds empty space, takes string inbetween space, and stores them into an array
        for(String x: wholeName.split(" ")) System.out.println(x);

        // Delete whitespace
        System.out.println(wholeName.trim());

        // Lowercase
        System.out.println(wholeName.toLowerCase());

    }

}
