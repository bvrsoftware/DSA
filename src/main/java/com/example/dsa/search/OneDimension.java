package com.example.dsa.search;

public class OneDimension {
    public static void getPrintArrayElements(int arr[]) {
        for (int e : arr) {
            System.out.println(e);
        }
    }

    public static int getLinearSearchArrayElement(int arr[], int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("location : " + i);
                return i;
            }
        }
        System.out.println("location : -1");
        return -1;
    }

    /*
    condition array is sorted !
    */
    public static int getBinarySearchArrayElement(int arr[], int search) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("location : " + mid);
                return mid;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("location : -1");
        return -1;
    }

    public static int getInterpolationSearchArrayElement(int arr[], int search) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (((search - arr[low]) * (high - low)) / (arr[high] - arr[low]));
            if (arr[mid] == search) {
                System.out.println("location : " + mid);
                return mid;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("location : -1");
        return -1;
    }

    /*
     reverse specific elements in arrays
    */
    public static int[] getReverseArrayElement(int arr[], int starting, int ending) {
        while (starting < ending) {
            swap(arr, starting, ending);
            starting++;
            ending--;
        }
        return arr;
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
