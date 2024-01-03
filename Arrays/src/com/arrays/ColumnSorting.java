package com.arrays;

import java.util.Arrays;

public class ColumnSorting {

    public static void main(String[] args) {

        int[][] arr = {{21, 23, 20}, {19, 27, 10}, {27, 9, 31}};

        int j = 0;
        while (j < arr.length) {
            int a1[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                a1[i] = arr[i][j];
            }
            Arrays.sort(a1);
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = a1[i];
            }
            j++;
        }

        System.out.println("Matrix :");

        for (int i = 0; i < arr.length; i++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr[i][col] + " ");
            }
            System.out.println();
        }
    }
}
