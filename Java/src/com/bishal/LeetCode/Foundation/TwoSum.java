package com.bishal.LeetCode.Foundation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Questions:https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {
    public static void main(String args []){
        int arr[] = {1,2,7,11,15};
        int target = 9;
        //int sol[] = twoSumSol1(arr,target);
        int sol[] = twoSumSol2(arr,target);
        System.out.println("sol -->"+ Arrays.toString(sol));
    }
    public static int[] twoSumSol1(int arr[], int target){
        int num[] = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    num[0] = i;
                    num[1] = j;
                    System.out.println("sol val -->"+ Arrays.toString(num));
                    return num;
                }
            }
        }
        return arr;
    }
    //Using Hash Map
    public static int[] twoSumSol2(int arr[], int target){
        Map<Integer,Integer> numMap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int number1 = arr[i];
            int rem = target - number1;
            if(numMap.containsKey(rem)){
                System.out.println("here"+i);
                return new int[]{numMap.get(rem),i};
            }else {
                numMap.put(number1,i);
            }

        }
        return arr;
    }
}



