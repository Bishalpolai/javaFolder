package com.bishal.LeetCode.Foundation;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Num 1 "+num1 + " Num 2 "+num2);
        swapUisngTemp(num1,num2);
        System.out.println("without Num 1 "+num1 + " Num 2 "+num2);
        withoutTemp(num1,num2);
    }
    public static void swapUisngTemp(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Num 1 "+num1 + " Num 2 "+num2);
    }

    public static void withoutTemp(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("without Num 1 "+num1 + " Num 2 "+num2);
    }
}
