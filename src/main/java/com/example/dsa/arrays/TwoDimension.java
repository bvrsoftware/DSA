package com.example.dsa.arrays;

public class TwoDimension {
    public static void getPrintArrayElements(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static String getLinearSearchArrayElement(int arr[][], int search) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == search) {
                    System.out.println("location : "+i+","+j);
                    return i + "," + j;
                }
            }
        }
        System.out.println("location : -1");
        return "-1";
    }
}
