package com.bishal.LinearSearchProblems;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 42, 3, 9},
                {78, 99, 34, 56},
                {98, 12}

        };
        int[] nums = {12,345,2,6,7896};
        count(nums);
       // System.out.println("Max is "+maxIn2DArray(arr));
           // //int[] ans =  getIndexOfMax2DArray(arr);
       // System.out.println("index of max Element in 2d Array"+ Arrays.toString(getIndexOfMax2DArray(arr)));
    }
//example of leet code 1295 https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public static void count(int[] nums){
        int digit = 0;
        for(int index = 0;index<nums.length;index++){
            int count=0;
            int temp = nums[index];
            System.out.println("temp"+nums[index]);
            while(temp>0){
                System.out.println("cc"+index);
                int temp1 = temp%10;
                temp = temp/10;
                count++;
            }
            if(count%2==0){
                digit++;
            }
            System.out.println("count digit"+digit);
        }

    }
    //Max in 2d array
    public static int maxIn2DArray(int[][] arr){
        int max = arr[0][0];
        //int mac = Integer.MIN_VALUE;
        for(int row = 0 ;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(max < arr[row][col]){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    // get index of max element in 2d array

    public static int[] getIndexOfMax2DArray(int[][] arr){
        //int max = arr[0][0];
        //int max = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] maxIndex = {-1,-1};
        for(int row =0 ;row<arr.length;row++){
            for(int col =0 ; col<arr[row].length; col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                    maxIndex[0] = row;
                    maxIndex[1] = col;

                }
            }
        }
        //return new int[]{-1,-1};
        return maxIndex; //99 [2,1] ans
    }
}
// Notes
/*
Here is how those two constants would change your code’s behavior:1.
Using Integer.MIN_VALUE (The "Safe" Choice)Using
Integer.MIN_VALUE (which is $-2,147,483,648$) is a standard practice and will work perfectly.
How it works: Since every possible integer in your array is either equal to or greater than this value,
the very first number the loop encounters will replace it as the new max.The Benefit: Unlike arr[0][0],
you don't have to worry if the array is empty before you "peek" at the first element.
It’s a very robust way to start.

2. Using Integer.MAX_VALUE (The "Logic Killer")
Using Integer.MAX_VALUE (which is $2,147,483,647$) will break your logic entirely.
How it works: Your code asks: if (arr[row][col] > max).
Since Integer.MAX_VALUE is the largest possible number a 32-bit integer can hold,
nothing in your array can ever be "greater" than it.
The Result: The if condition will always be false.
Your code will finish the loops without ever updating the maximum,
and it will return your default maxIndex (likely {-1, -1}).When to use it:
You only use MAX_VALUE as a starting point when you are looking for the minimum value in a set.
Comparison TableInitial ValueUse CaseResult in your Code
arr[0][0]Most commonWorks,
but requires a check to ensure the array isn't empty.

Integer.MIN_VALUEBest practiceWorks perfectly;
"guarantees" the first element checked becomes the first max.

Integer.MAX_VALUEFind MinimumsFails;
no number in your array will be larger than this.

 */