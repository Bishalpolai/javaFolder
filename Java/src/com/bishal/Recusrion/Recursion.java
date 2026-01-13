package com.bishal.Recusrion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
     //   System.out.print("Enter the Number for Fibonacci : ");
      //  int n = sc.nextInt();
       // int ans = fibo(n);
      //  System.out.println("Fibonacci for "+n+" is : "+ans);
        createMthod();
        Recursion t = new Recursion();
        t.TestNew();
    }
    public static int fibo(int n){
        if(n<2){
            System.out.println(" n inside if is "+n);
            return n;
        }
        System.out.println(" n before add "+n);
         return fibo(n-1) + fibo(n-2);
       // System.out.println(" now n is "+n +"  num is "+num);
        //return num;
    }
    public static void createMthod(){
        System.out.println("test");
    }
    public void TestNew(){
        System.out.println("New Changes");
    }
}
