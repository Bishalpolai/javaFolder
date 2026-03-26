package com.bishal.LeetCode;

public class SecondLargest {
    public static void main(String[] args) {
       // String input1 = "dfa12321afd";
        String input2 ="sjhtz8344"; // this enters into else if block
        int num = secondHighest(input2);
       // int num = secondHighestUisngNewMethod(ss);
        System.out.println("final "+num);
    }
    public static int secondHighest(String s) {
        System.out.println("s --> "+s);
        int first = -1;
        int second = -1;
        for(int i = 0; i<s.length();i++){
            char currentChar = s.charAt(i);
            if(Character.isDigit(currentChar)){
                int num = currentChar - '0';
                if(num > first){ // if number are in asc order like input
                    second = first;
                    first = num;
                    System.out.println("first -> "+first + " second  "+second);
                } else if (num>second && num<first) { // for input2 sjhtz8344 we need the else if part
                    second = num;
                }
            }
        }
        return second;
    }
    //diffrent approach
    public static int secondHighestUisngNewMethod(String s) {
        int count = 2;
        for (char ch = '9'; ch >= '0'; ch--) {
            System.out.println("ch"+ch);
            boolean isNum = Character.isDigit(ch);
            System.out.println("isNum"+isNum + "ch "+ch);
            if (s.indexOf(ch) != -1) {
                System.out.println(s.indexOf(ch));
                count--;
                System.out.println("count "+count);
                if (count == 0) {
                    return ch - '0';
                }
            }
        }
        return -1;
    }
}
