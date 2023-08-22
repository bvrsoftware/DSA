package com.example.dsa.search;

import java.util.Arrays;

public class Programs {
    public static int getFirstOccurOfDuplicateElement(int arr[]) {
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1;j<arr.length;j++){
            if (arr[i] == arr[j]) {
//            if (arr[i] == arr[i + 1]) {
                System.out.println("Found : " + arr[i] + " On Index : " + i);
                return arr[i];
                }
            }
        }
        System.out.println("Not Found ! : -1");
        return -1;
    }
}
