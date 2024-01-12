package com.arrays;

public class IndexesOfSubarray {

    public static void check() {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 15;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("Starting index: " + i + ", Last index: " + k);
                    } else if (arr[i] + arr[j] == sum) {
                        System.out.println("Starting index: " + i + ", Last index: " + j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        check();
    }
}
