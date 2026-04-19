package com.bishal.DSA.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,31,42,5,61,17,18,29,10};
        System.out.println("Element"+searchElement(arr,8));
    }
    public static int searchElement(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            System.out.println("mid"+mid);
            if(target == arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start = mid+1;
                System.out.println("start");
            }else{
                end = mid - 1;
                System.out.println("end");
            }
        }
        return -1;
    }
}
