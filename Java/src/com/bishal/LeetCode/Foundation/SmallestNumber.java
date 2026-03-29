package com.bishal.LeetCode.Foundation;
//smallestNumber in Array
public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3,1,2};
        int[] arr2 = new int[]{2,-5,4,3,-4};
        int[] arr3 = new int[]{3,0,2};
        int[] arr4 = new int[]{};
        System.out.println("Smallest Number "+smallestNumber(arr1));
    }
    public static Object smallestNumber(int[] arr){
        if(arr.length == 0){
            return null;
        }
        int smallestNumber = arr[0];
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i]<smallestNumber){
                smallestNumber = arr[i];
            }
        }
        return smallestNumber;
    }
}
