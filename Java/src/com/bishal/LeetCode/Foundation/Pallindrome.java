package com.bishal.LeetCode.Foundation;

public class Pallindrome {
    public static void main(String[] args) {
        int x = 0;
        boolean isPallindrome = isPalindrome(x);
        System.out.println("isPallindrome "+isPallindrome);
    }
    public static boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;
        if(x < 0 ){
            return false;
        }
        while(x>0){
            int rem = x%10; //121
            sum = (sum*10)+rem; // 10 //10+
            x=x/10;
        }

        return (temp == sum)?true:false;
    }
}
