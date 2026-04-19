package com.bishal.LinearSearchProblems;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println("Element in Range "+getElementInRange(arr,target,1,4));
        System.out.println("testt "+isPallindrome("abca"));
    }
    //Search for 3 in the range from 1 to 4
    public static int getElementInRange(int arr[],int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        if(start>end){
            return -1;
        }
        for(int index = start; index<=end;index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }


    // extra not part of it
    public static boolean isPallindrome(String name){
        if(name.length()==0){
            return false;
        }
        int left = 0;
        int right = name.length()-1;

        while(left<right){ // abca
            if(name.charAt(left) != name.charAt(right)){
                System.out.println("outside test");
                return isPallindromeCheck(name,left+1,right) || isPallindromeCheck(name,left,right-1);
            }
            System.out.println("outside");
            left++;
            right--;
        }
        System.out.println("insider Outer");
        return true;
    }
    private static boolean isPallindromeCheck(String name,int left,int right){
        System.out.println("name "+name);
        System.out.println("left  "+left);
        System.out.println("right  "+right);

        while(left<right){
            if(name.charAt(left)!=name.charAt(right)){
                System.out.println("inside Inner");
                return false;
            }
            left++;
            right--;
        }
        System.out.println("insider Inner Outer");
        return true;
    }
}
