package com.example.dsa;

import com.example.dsa.sorting.Sorting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {
    public static void main(String[] args) {
        SpringApplication.run(DsaApplication.class, args);
        int arr[] = {64, 25, 12, 22, 11, 5};
        long start = System.currentTimeMillis();
        System.out.print("unsorted : \t");
        Sorting.getPrintArray(arr);
//		Sorting.getSelectionSort(arr);
//		Sorting.getBubbleSort(arr);
//		Sorting.getInsertionSort(arr);
//		Sorting.bucketSort(arr);
//		Sorting.mergeSort(arr,0,arr.length-1);
//      Sorting.quickSort(arr, 0, arr.length - 1);
//		Sorting.heapSort(arr);
        System.out.print("sorted : \t");
        Sorting.getPrintArray(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
