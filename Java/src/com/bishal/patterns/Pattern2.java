package com.bishal.patterns;

public class Pattern2 {
    public static void main(String[] args) {
       // pattern1(5);
       // pattern2(5);
        int arr[] = {2,7,11,15};
        int target = 9;
        int nums[] = twoSum(arr,target);
    }
    public static void pattern1(int n){
        /*
            *****
            *****
            *****
            *****
            *****
         */
        for(int row = 0 ;row<n;row++){
            for(int col = 0; col<n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
         */
        for(int row = 0; row<n;row++){
            for(int col = 0; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int numVal[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    numVal[0] = i;
                    numVal[1] = j;
                    System.out.println("nums"+i + j);
                    return numVal;
                }
            }
        }
        return nums;
    }

}
