package com.bishal.Recusrion;

public class BinarySearchUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        int[] arr2 = {14,12,10,9,5,14,3,1};
        int target = 12;
        int ans = getIndex(arr2,target);
        System.out.println("ans "+ans);
    }
    public static int getIndex(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        if(start>end){
            return -1;
        }
        boolean isSort = arr[start]<arr[end];//to check array is sorted in asc or desc



        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isSort){ // for asc
                if(target>arr[mid]){
                    System.out.println("24" + end+"end"+"start"+start);
                    start = mid+1;
                }
                else if(target<arr[mid]){
                    System.out.println("27" + end+"end"+"start"+start);
                    end = mid-1;
                }
            }else{
                if(target>arr[mid]){ // for desc
                    System.out.println("24" + end+"end"+"start"+start);
                    end = mid-1;
                }
                else if(target<arr[mid]){
                    System.out.println("27" + end+"end"+"start"+start);
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
