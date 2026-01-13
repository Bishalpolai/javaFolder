package com.bishal.patterns;

public class Pattern2 {
    public static void main(String[] args) {
       // pattern1(5);
        pattern2(5);
    }
    public static void pattern1(int n){
        /*
            *****
            *****
            *****
            *****
            *****
         */
        for(int row = 0 ;row<n;row++){
            for(int col = 0; col<n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
         */
        for(int row = 0; row<n;row++){
            for(int col = 0; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
