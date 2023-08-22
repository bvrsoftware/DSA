package com.example.dsa;

import com.example.dsa.search.OneDimension;
import com.example.dsa.search.Programs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		int arr[]=new int[]{5,25,20,25,35,40,50,65,70,99,100,25};
//		OneDimension.getInterpolationSearchArrayElement(arr,40);
		Programs.getFirstOccurOfDuplicateElement(arr);
		SpringApplication.run(DsaApplication.class, args);
	}

}
