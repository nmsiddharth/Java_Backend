package com.arrays;

public class Reverse2DArray {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int[] temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // Reverse each row
        for (int i = 0; i < arr.length; i++) {
            int start1 = 0;
            int end1 = arr[0].length - 1;
            while (start1 < end1) {
                // Swap elements at start and end indices in the current row
                int temp = arr[i][start1];
                arr[i][start1] = arr[i][end1];
                arr[i][end1] = temp;
                start1++;
                end1--;
            }
        }

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
