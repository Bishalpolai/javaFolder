package com.bishal.patterns;

import java.util.Scanner;

public class Pattern1 {
    //Square Hollow Pattern
    /*
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Row ");
        int rowNo =  sc.nextInt();

        for(int row = 0;row<rowNo;row++){
            for(int col = 0 ;col<rowNo;col++){
                if(row==0 || col ==0 ||row == rowNo-1|| col==rowNo-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
