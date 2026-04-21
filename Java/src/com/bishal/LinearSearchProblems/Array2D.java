package com.bishal.LinearSearchProblems;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr= {
            {12, 9, 28},
            {3, 7, 4, 21},
            {17, 31, 5, 22}
        };
        int maxElement = getMaxElementIn2DArray(arr);
        int minElement = getMinElementIn2DArray(arr);
        int[] maxElementIndex = getMaxElementIndexIn2DArray(arr);
        int[] minElementIndex = getMinElementIndexIn2DArray(arr);
        System.out.println("max Element "+maxElement+ " at Index "+ Arrays.toString(maxElementIndex));
        System.out.println("min Element "+minElement+ " at Index "+Arrays.toString(minElementIndex));

    }
    //get maxElement
    public static int getMaxElementIn2DArray(int[][] arr){
        if(arr.length==0) return Integer.MIN_VALUE;
        int max = arr[0][0];
        for(int row = 0 ;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    //get Min Element
    public static int getMinElementIn2DArray(int[][] arr){
        if(arr.length==0)return Integer.MAX_VALUE;
        int min = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }

        return min;
    }
    //Index of max Element
    public static int[] getMaxElementIndexIn2DArray(int[][] arr){
        if(arr.length==0)return new int[]{-1,-1};
        int max = arr[0][0];
        int[] index_max = {0,0};
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                    index_max[0] = row;
                    index_max[1] = col;
                }
            }
        }
        System.out.println("index " +index_max[0]);
        return index_max;
    }
    //index of min element
    public static int[] getMinElementIndexIn2DArray(int[][] arr){
        if(arr.length == 0)return new int[]{-1,-1};
        int min = arr[0][0];
        int index_min[] = {0,0};
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col]<min){
                    min = arr[row][col];
                    index_min[0] = row;
                    index_min[1] = col;
                }
            }
        }
        return index_min;
    }
}
