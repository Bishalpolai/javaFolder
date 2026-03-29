package com.bishal.LeetCode.Foundation;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {-1,0,3,5,9,12};
        int[] arr3 = {-1,0,3,5,9,12};
        int target = 2;
        BinarySearch bs = new BinarySearch();
        int num = bs.search(arr2,target);
        System.out.println("num "+num);
    }
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int start = 0;
        int end = nums.length-1;// to avoid index out of bounds exception


        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                System.out.println("here");
                return mid;
            }
            // 2,4,6,8,10,40,60 // 6 elements mid = 3 -> 8 target 40 -> 40 > 8
            // //start = 4 -> 10 end = 6 -> 60 , mid = 40
            if (target > nums[mid]) {
                System.out.println("here 1");
                start = mid+1;
            }else if(target < nums[mid]){
                System.out.println("here 2");
                end = mid -1;
            }
        }
        return -1;
    }
}
