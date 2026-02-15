package com.bishal.LeetCode.Foundation;

import java.util.Scanner;

public class SumSquareNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        System.out.println("num  "+num+ " is "+getSquare(num));
        System.out.println("num by maths "+num+ " is "+getSquareMaths(num));
    }
    public static int getSquare(int num){
        int sum = 0;
        for(int i =1;i<=num;i++){
            sum += i * i;
        }
        return sum;
    }
    /// By Mathematical
    public static int getSquareMaths(int num){
        return num * (num + 1)/2 * (2 * num + 1)/3;
    }
}
