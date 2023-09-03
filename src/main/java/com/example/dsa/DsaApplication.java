package com.example.dsa;

import com.example.dsa.programs.Program1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		int []arr=new int[]{70,10,80,30,90,40,60,20,50};
		System.out.println(Program1.pivotIndex(arr));
		SpringApplication.run(DsaApplication.class, args);
	}

}
