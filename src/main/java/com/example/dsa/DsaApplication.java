package com.example.dsa;

import com.example.dsa.sorting.Sorting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {
	public static void main(String[] args) {
		int arr[] ={64,25,12,22,11};
		System.out.print("unsorted : \t");
		Sorting.getPrintArray(arr);
		Sorting.getSelectionSort(arr);
		System.out.print("sorted : \t");
		Sorting.getPrintArray(arr);
		SpringApplication.run(DsaApplication.class, args);
	}

}
