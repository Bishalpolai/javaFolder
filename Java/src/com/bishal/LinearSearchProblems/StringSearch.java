package com.bishal.LinearSearchProblems;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Mango";
        System.out.println("element "+isCharacterExist(name,'g'));
        System.out.println("Elemet "+checkElementExist(name,'o'));
    }
    public static boolean isCharacterExist(String name,char c){
        int chars = name.length();
        if(chars==0){
            return false;
        }
        for(int n = 0 ; n<chars;n++){
            if(name.charAt(n)==c){
                return true;
            }
        }
        return false;
    }

    //for each loop
    public static boolean checkElementExist(String name, char c){
        if(name.length()==0){
            return false;
        }
        System.out.println("val"+ Arrays.toString(name.toCharArray()));// to print into char array
        for(char ch : name.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
    }
}
