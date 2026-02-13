package com.bishal.LeetCode.Foundation;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isEven = checkEvenOdd(num);
        if(isEven == true) {
            System.out.println("Number "+num+ " is Even");
        }else{
            System.out.println("Number "+num+ " is Odd");
        }


    }
    public static boolean checkEvenOdd(int n){
        boolean isEven;
        if(n%2==0){
            isEven = true;
        }else{
            isEven = false;
        }
        return isEven;
    }
}
