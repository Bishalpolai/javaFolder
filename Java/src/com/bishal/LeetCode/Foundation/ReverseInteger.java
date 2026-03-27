package com.bishal.LeetCode.Foundation;

public class ReverseInteger {
    public static void main(String[] args) {
        int num2 = -123;
        int num = 1534236469;
       // System.out.println("Original Num--> "+num+"  reverseNumber -->  "+reverse(num));
        System.out.println("Original Num--> "+num+"  reverseNumber -->  "+reverseNumber(num));
    }
    public static int reverseNumber(int num){
        int reverseNumber = 0;
        //int orgnum = num;
        boolean isNegative = false;
       // int numb = Long.valueOf(num);
        if(num<0){
            isNegative = true;
            num = num*-1;
        }
        while(num>0){
            //int num = 1534236469; exceeds int size limit
            if (reverseNumber > Integer.MAX_VALUE / 10 || reverseNumber < Integer.MIN_VALUE / 10) {
                System.out.println(reverseNumber+" reverseNumber");
                System.out.println("Integer.MAX_VALUE / 10 "+Integer.MAX_VALUE / 10);
                System.out.println("Integer.MIN_VALUE / 10 "+Integer.MIN_VALUE / 10);

                return 0;
            }
            int rem = num%10;
            reverseNumber = reverseNumber * 10 + rem;
            num = num/10;
        }
        System.out.println("reverseNumber"+reverseNumber);
        System.out.println("isNegative"+isNegative);
        return (isNegative)?reverseNumber*-1:reverseNumber;
    }
    public static int reverse(int x) {
        int reversedNumber = 0;

        // Process each digit from right to left
        while (x != 0) {
            // Check for potential overflow before multiplying by 10
            // Integer.MAX_VALUE = 2147483647, Integer.MIN_VALUE = -2147483648
            if (reversedNumber > Integer.MAX_VALUE / 10 || reversedNumber < Integer.MIN_VALUE / 10) {
                return 0;
            }

            // Extract the last digit and add it to the reversed number
            int lastDigit = x % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;

            // Remove the last digit from x
            x = x / 10;
        }

        return reversedNumber;
    }
}
