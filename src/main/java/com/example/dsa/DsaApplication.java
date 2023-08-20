package com.example.dsa;

import com.example.dsa.arrays.OneDimension;
import com.example.dsa.arrays.TwoDimension;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        int arr1[] = new int[]{5, 10, 25, 30, 35, 40};
        int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//		OneDimension.getPrintArrayElements(arr1);
//		OneDimension.getLinearSearchArrayElement(arr1,205);
//        OneDimension.getBinarySearchArrayElement(arr1, 25);
        OneDimension.getPrintArrayElements(OneDimension.getReverseArrayElement(arr1,2,arr1.length-1));
//		TwoDimension.getPrintArrayElements(arr2);
//		TwoDimension.getLinearSearchArrayElement(arr2,9);
        SpringApplication.run(DsaApplication.class, args);
    }

}
