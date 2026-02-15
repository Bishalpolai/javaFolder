package com.bishal.LeetCode.Foundation;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();

        multiplication(num);
    }
    public static void multiplication(int n, Integer... val){
        int i = 1;
        //System.out.println("val.length vv "+val.length);
        if (val.length != 0)
            i = val[0];
        if(i == 11)
            return;

        System.out.println(n +" * "+ i +" = "+ n * i);
        i++;
        multiplication(n,i);
    }
}
