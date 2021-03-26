package com.patrickceledio;
import java.util.*;
import java.util.stream.IntStream;
public class ArrayListDemo {
    public static void main(String[] args) {
        // Syntax
        ArrayList<String> arrayList1 = new ArrayList<String>(20);
        arrayList1.add("Patrick");

        // Another way to initialize
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(100,200,300,400,500));
        for (Integer x: arrayList2) System.out.println(x);

        // Return a specific value
        System.out.println(arrayList2.get(3));

        // Set a value at a specific index
        arrayList2.set(4, 600);

        // Remove a value
        arrayList2.remove(4);
    }
}
