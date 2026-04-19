package com.bishal.LeetCode.Arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr  = {12,-345,2,6,7896}; //Test case 1
        int[] arr2 = {555,901,482,1771};
        EvenDigits evn = new EvenDigits();
        int countTestCase1 = evn.findNumbes(arr);
        System.out.println("countTestCase1 -> "+countTestCase1);

    }
    public int findNumbes(int[] nums){
        int count=0;
        for(int num : nums){
            if(evenCoreLogic(num)){
                count++;
            }
        }
        return count;
    }
    //Using Math.log10 logic
    // Formula Math.log10(12) = will give 1.07 so adding 1
    //          Math.log10(123) = 2.08 so adding 1
    // mMath.log10(-12) = 0
    private boolean evenCore(int num){
        if(num<0) num = -1*num; // to handle Negative numbers
        if(num==0) return false;
        int count = (int)(Math.log10(num)+1);
        System.out.println("count "+count);
        System.out.println("count with - "+Math.log10(num));
        return count%2==0;
    }
    //Uisng Math.abs Method
    private boolean evenCoreLogic(int num){
        if(num == 0)return false;
        if(num<0) num = num * -1;
        int count = String.valueOf(Math.abs(num)).length();
        System.out.println("count"+count);
        return count% 2 == 0;
    }
    //function to check whether a number contains even digit or not
    //if string n = num+ " ";
    // num = 12 => n=12+" " ==> 3 (consider space as character)
    // even -12 => 3 since - is also a character
    // logic only works for positive
    private boolean even(int num) {
        String n = num + ""; // and extra space " " will also add to count
        int count  = n.length();
        System.out.println("c "+count);
        return count%2==0;

    }
    // even -12 => 3 since - is also a character
    // logic only works for positive
    public boolean even2(int num){
        String n = String.valueOf(num);
        return n.length()%2==0;
    }
}
