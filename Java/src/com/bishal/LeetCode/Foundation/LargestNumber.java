package com.bishal.LeetCode.Foundation;
//Largest Number in Array
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3,1,2};
        int[] arr2 = new int[]{2,-5,4,3,-4};
        int[] arr3 = new int[]{3,0,2};
        int[] arr4 = new int[]{};
        LargestNumber lar = new LargestNumber();
        System.out.println("Largest Number arr1 --> "+lar.largestNumber(arr1));
        System.out.println("Largest Number arr2 --> "+lar.largestNumber(arr2));
        System.out.println("Largest Number arr3 --> "+lar.largestNumber(arr3));
        System.out.println("Largest Number arr4 --> "+lar.largestNumber(arr4));
    }
    //Non Static method
    public Object largestNumber(int[] arr){
        if(arr.length ==0){
            return null;
        }
        int largestnum = arr[0];
        for (int j : arr)
            if (j > largestnum) {
                largestnum = j;
            }
        return largestnum;
    }
}
