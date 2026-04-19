package com.bishal.LinearSearchProblems;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        System.out.println(search(arr,target));
        int[] ans = searchIndex(arr,target);
        System.out.println("Index"+ Arrays.toString(searchIndex(arr,target)));
    }
    public static int search(int[][] arr, int target){
        if(arr.length==0){
            //int[][] ints = {{-1, -1}};
            return -1;
        }
        for(int row =0 ;row<arr.length;row++){
            for(int col = 0 ;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return arr[row][col];
                }
            }
        }

        return -1;
    }

    // return the index
    public static int[] searchIndex(int[][] arr,int target){
        for(int row =0 ;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
