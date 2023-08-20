package com.example.dsa;

import com.example.dsa.pattern.Patterns;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        int row = 10;
//		Patterns.getRightHalfPyramid(5);
//		Patterns.getLeftHalfPyramid(5);
//      Patterns.getFullPyramid(row);
//      Patterns.getInvertRightHalfPyramid(row);
//      Patterns.getInvertLeftHalfPyramid(row);
//      Patterns.getInvertFullPyramid(row);
//      Patterns.getRhombusPattern(row);
//      Patterns.getDiamondPattern(row);
//      Patterns.getHourGlassPattern(row);
//      Patterns.getHollowSquarePattern(row);
//      Patterns.getHollowFullPyramid(row);
//      Patterns.getInvertHollowFullPyramid(row);
//      Patterns.getHollowDiamondPattern(row);
//      Patterns.getHollowHourGlassPattern(row);
//      Patterns.getFloydTriangle(row);
        Patterns.getPascalTriangle(row);
        SpringApplication.run(DsaApplication.class, args);
    }

}
