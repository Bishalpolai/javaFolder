package com.bishal.LinearSearch;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = {1,3,1,5,7,1,2,8,0,4,3,2};
        int target = 5;
        int check = linearArray(arr,target);
        System.out.println("check "+check);
        int value = linearSearchElement(arr,target);
        System.out.println("value is "+value);
        int value2 = linearSearchElementForEach(arr,target);
        System.out.println("For each  is "+value2);
        int value3 = linearSearchElementForEachArray(arr,target);
        System.out.println("For each using Array is "+value3);
        boolean isAvail = linearSearchElementAvailable(arr,target);
        System.out.println("For Boolean check on Array is "+isAvail);


    }
    public static int linearArray(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
    //Search the Target and return the element
    public static int linearSearchElement(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;//it s a constant
        //return -1;
    }
    //Search the Target and return the element
    public static int linearSearchElementForEach(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index : arr){
            if(index == target){
                return index;
            }
        }
        return -1;
    }
    public static int linearSearchElementForEachArray(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        return Arrays.stream(arr).filter(index -> index == target).findFirst().orElse(-1);
    }
    //Using Boolean

    public static boolean linearSearchElementAvailable(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        return Arrays.stream(arr).anyMatch(index -> index == target);
    }
    //
}
