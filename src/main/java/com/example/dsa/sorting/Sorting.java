package com.example.dsa.sorting;

import java.util.ArrayList;
import java.util.Collections;

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
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    /*
    To sort an array of size N in ascending order iterate over the array and compare the current element (key) to its predecessor,
     if the key element is smaller than its predecessor, compare it to the elements before.
     Move the greater elements one position up to make space for the swapped element.
     */
    public static int[] getInsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > key) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
        return arr;
    }

    public static int[] bucketSort(int arr[]) {
        int numOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        ArrayList<Integer> buckets[] = new ArrayList[numOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int value : arr) {
            int bucketNum = (int) Math.ceil((float) value * numOfBuckets / (float) maxValue);
            buckets[bucketNum - 1].add(value);
        }
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index] = value;
                index++;
            }
        }
        return arr;
    }

    public static void merge(int arr[], int left, int middle, int right) {
        int[] leftTmpArray = new int[middle - left + 2];
        int[] rightTmpArray = new int[right - middle + 1];
        for (int i = 0; i <= middle - left; i++) {
            leftTmpArray[i] = arr[left + i];
        }
        for (int i = 0; i < right - middle; i++) {
            rightTmpArray[i] = arr[middle + 1 + i];
        }
        leftTmpArray[middle - left + 1] = Integer.MAX_VALUE;
        rightTmpArray[right - middle] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTmpArray[i] < rightTmpArray[j]) {
                arr[k] = leftTmpArray[i];
                i++;
            } else {
                arr[k] = rightTmpArray[j];
                j++;
            }
        }
    }

    public static int[] mergeSort(int[] arr, int left, int right) {
        if (right > left) {
            int m = (left + right) / 2;
            mergeSort(arr, left, m);
            mergeSort(arr, m + 1, right);
            merge(arr, left, m, right);
        }
        return arr;
    }

    public static int partitionHelp(int arr[], int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    public static int[] quickSort(int[] arr,int start,int end) {
      if (start<end){
          int pivot=partitionHelp(arr,start,end);
          quickSort(arr,start,pivot-1);
          quickSort(arr,pivot+1,end);
      }
        return arr;
    }

    public static int[] heapSort(int arr[]) {
        BinaryHeap bh = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            bh.insertInHeap(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = bh.extractHeadOfHeap();
        }
        return arr;
    }

}
