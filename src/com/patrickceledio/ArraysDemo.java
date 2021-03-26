package com.patrickceledio;
import java.util.*;
import java.util.stream.IntStream;
public class ArraysDemo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Array syntax
        int[] a1 = new int[10];

        // Store value into first element
        a1[0] = 1;

        // Use Arrays package to push a value in a1
        Arrays.fill(a1, 2);

        // Print out value of element of array
        System.out.println(a1[0]);

        // Print out size of array
        System.out.println(a1.length);

        // Create arrays with values set in one line syntax
        String[] a2 = {"uno", "dos"};

        // Integer to array
        int[] oneTo10 = IntStream.rangeClosed(1,10).toArray();
        // Print contents of oneTo10
        for (int x:oneTo10) System.out.println(x);

        // Find values-- find 6 in oneTo10 array-- returns the index of the value 6
        System.out.println(Arrays.binarySearch(oneTo10, 6));

        // Multi-dimensional array --row by collumn
        int a3[][] = new int[2][2];
        String[][] a4 = {{"00", "10"},{"01","11"}};
        System.out.println(a4[1][1]);

        // Three dimensional array :O
        // Rows, columns, "pages"
        String a5[][][] = {
                {{"100"},{"200"},{"300"}},
                {{"400"},{"500"},{"600"}},
                {{"700"},{"800"},{"900"}},
        };
        System.out.println(a5[2][1][0]);

        // Copy one array to another array
        int a6[] = {1, 2, 3};
        int a7[] = Arrays.copyOf(a6, 3);

        // Check for equivalency
        System.out.println(Arrays.equals(a6, a7));

        // Sort arrays
        int a8[] = {9, 6, 7};
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8));
    }
}
