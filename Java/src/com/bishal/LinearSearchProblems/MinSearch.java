package com.bishal.LinearSearchProblems;

public class MinSearch {
    public static void main(String[] args) {
        int arr[] = {18,12,-7,3,14,28};
        System.out.println("min is "+getMin(arr));
    }
    //Search minimum in an array
    public static int getMin(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int index = 1 ; index<arr.length;index++){

            if(min>arr[index]){
                min = arr[index];
            }
        }
        return min;
    }
}
