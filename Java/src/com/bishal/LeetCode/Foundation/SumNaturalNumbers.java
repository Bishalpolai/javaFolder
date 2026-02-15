package com.bishal.LeetCode.Foundation;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(getNumber(num));
       // System.out.println("sum "+getNaturalNumber(num));
    }
    public static int getNaturalNumber(int n){
        int sum = 0;
       for(int i=1;i<=n;i++){
           sum =sum+i;
       }
       return sum;
    }
    public static int getNumber(int n){
        if(n==1)
            return 1;
        System.out.println(n);
        return n + getNumber(n-1);
    }
}
