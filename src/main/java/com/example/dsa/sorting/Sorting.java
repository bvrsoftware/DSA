package com.example.dsa.sorting;

public class Sorting {
    public static void getPrintArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] getSelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int select = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[select]) {
                    select = j;
                }
                int temp = arr[select];
                arr[select] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    /*
    step 1: traverse from left and compare adjacent elements and the higher one is placed at right side.
    step 2:In this way, the largest element is moved to the rightmost end at first.
    step 3:This process is then continued to find the second largest and place it and so on until the data is sorted.
    */
    public static int[] getBubbleSort(int arr[]) {
        for (int i=0;i<arr.length-1;i++){
            boolean swapped =false;
            for (int j=0;j< arr.length-i-1;j++){

            }
        }
        return arr;
    }
}
