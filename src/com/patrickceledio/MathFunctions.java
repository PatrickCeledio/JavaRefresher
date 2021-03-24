package com.patrickceledio;
import java.util.*;
import java.util.stream.IntStream;

public class MathFunctions {
    public static void main(String[] args){
        // Add, sub, mul, div, modulo
        System.out.println("5 + 4 = "+(5 + 4));
        System.out.println("5 - 4 = "+(5 - 4));
        System.out.println("5 * 4 = "+(5 * 4));
        System.out.println("5 / 4 = "+(5.0/4.0));
        System.out.println("5 % 4 = "+(5.0%4.0)); // Returns remainder

        // Increments
        int incMe = 0;
        // Outputs and then adds
        System.out.println("incMe : " + (incMe++));
        // Adds and then outputs
        System.out.println("incMe : " + (++incMe));

        // Shortcuts
        incMe += 10;

        // Math functions
        System.out.println("******* BASIC MATH FUNCTIONS *******");
        System.out.println("abs(-1) = " + Math.abs(-1));
        System.out.println("ceiling(4.25) = " + Math.ceil(4.25));
        System.out.println("floor(4.25) = " + Math.floor(4.25));
        System.out.println("round(4.25) = " + Math.round(4.25));
        System.out.println("max(4,5) = " + Math.max(4,5));
        System.out.println("min(4,5) = " + Math.min(4,5));
        System.out.println("exp(1) = " + Math.exp(1));
        System.out.println("log(1) = " + Math.log(1));
        System.out.println("log10(1) = " + Math.log10(1));
        System.out.println("pow(2,2) = " + Math.pow(2,2));
        System.out.println("sqrt(4) = " + Math.sqrt(4));
        System.out.println("cbrt(4) = " + Math.cbrt(4));
        System.out.println("hypotnuse(5,5) =" + Math.hypot(5.0,5.0));
        System.out.println("Pi =" + Math.PI);

        // Trig Functions Radians
        System.out.println("******* TRIG FUNCTIONS *******");
        System.out.println("sin(420.69) = " + Math.sin(420.69));
        System.out.println("cos(420.69) = " + Math.cos(420.69));
        System.out.println("tan(420.69) = " + Math.tan(420.69));
        System.out.println("asin(420.69) = " + Math.asin(420.69));
        System.out.println("acos(420.69) = " + Math.acos(420.69));
        System.out.println("atan(420.69) = " + Math.atan(420.69));
        System.out.println("sinh(420.69) = " + Math.sinh(420.69));
        System.out.println("cosh(420.69) = " + Math.cosh(420.69));
        System.out.println("tanh(420.69) = " + Math.tanh(420.69));
        System.out.println("toDegrees(420.69) = " + Math.toDegrees(420.69));
        System.out.println("toRadians(420.69) = " + Math.toRadians(420.69));
    }
}
