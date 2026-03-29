package com.bishal.LeetCode.Foundation;

import java.util.stream.IntStream;

//Count Negative Numbers in an Array
public class CountNegative {
    public static void main(String[] args) {
        int[] arr = {-1,0,1};
        int[] arr2 = {-5,-6,-7};
        int[] arr3 = new int[]{2, 4, 7, 0};
        int[] arr4 = new int[]{};
        System.out.println("count "+countNegative(arr4));
        getNumbers();
    }
    public static int countNegative(int[] arr){
        //System.out.println(arr.length);
        if(arr.length==0){
            System.out.println("here");
            return 0;
        }
        int count = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        System.out.println("here 2");
        return count;
    }
    // Using Steams
    public static void getNumbers() {
        int[] array = {3, 4, 7, -3, -2, 0, -5};

        long negativeCount = IntStream.of(array)
                .filter(i -> i < 0)
                .count();

        System.out.println("The number of negative numbers is: " + negativeCount);
    }
}
