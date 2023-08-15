package com.example.dsa;

import com.example.dsa.pattern.Patterns;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
//		Patterns.getRightHalf(5,5);
		Patterns.getLeftHalf(5,5);
		SpringApplication.run(DsaApplication.class, args);
	}

}
