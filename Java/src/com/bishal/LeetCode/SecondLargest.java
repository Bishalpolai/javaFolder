package com.bishal.LeetCode;

public class SecondLargest {
    public static void main(String[] args) {
        String s = "dfa12321afd";
        int num = secondHighest(s);
    }
    public static int secondHighest(String s) {
        System.out.println("s"+s);
        char[] charsVal = new char[s.length()];
        for(int i =0; i<s.length();i++){
            charsVal[i] = s.charAt(i);
        }
        //for()
        System.out.println(charsVal);
        return 0;
    }
}
