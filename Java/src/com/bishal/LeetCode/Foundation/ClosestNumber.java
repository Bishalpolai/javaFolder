package com.bishal.LeetCode.Foundation;

public class ClosestNumber {
    public static void main(String[] args) {
        //number = 13
        //disvisble by m = 4
       int closestNumber = getClosestNumber(15,4);
    }
    public static int getClosestNumber(int num,int div){
        int closestNumber = 0;
        int minDifference = Integer.MAX_VALUE;
        System.out.println("minDifference "+minDifference);
        for(int i = num - Math.abs(div); i<= num + Math.abs(div); ++i){
            System.out.println("i "+i);
            closestNumber = i;
        }
        System.out.println("i closestNumber"+closestNumber);
        return closestNumber;
    }
}
