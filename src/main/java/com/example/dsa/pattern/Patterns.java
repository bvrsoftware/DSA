package com.example.dsa.pattern;

public class Patterns {
    public static void  getRightHalf(int row,int col){
       for (int i=1;i<=row;i++){
           for (int j=1;j<=i;j++){
               System.out.print(" *");
           }
           for (int k=i;k<=col;k++){
               System.out.print(" ");
           }
           System.out.println();
       }
    }
    public static void  getLeftHalf(int row,int col){
      for (int i=1;i<=row;i++){
          for (int j=col-1;j>=i;j--){
              System.out.print("  ");
          }
          for (int k=1;k<=i;k++){
              System.out.print(" *");
          }
          System.out.println();
      }
    }
}
