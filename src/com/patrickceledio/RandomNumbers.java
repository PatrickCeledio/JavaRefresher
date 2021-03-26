package com.patrickceledio;

import java.util.*;
import java.util.stream.IntStream;
public class RandomNumbers {

    public static void main(String[] args) {
        int minNum = 5;
        int maxNum = 20;
        int randNum = minNum + (int)(Math.random() * (maxNum-minNum) + 1 );
        System.out.println("Random number : " + randNum);
    }
}
