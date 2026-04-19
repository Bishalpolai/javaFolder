package com.bishal.LeetCode.Arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
            int[] arr = {1,1,2};
        RemoveDuplicates removeD = new RemoveDuplicates();
        int output = removeD.removeDuplicate(arr);
        System.out.println("output "+output);


        System.out.println(" val "+removeD.removeDuplicateVariable(arr));
    }
    public int removeDuplicate(int[] arr ){
        if(arr.length == 0){
            return 0;
        }
        LinkedHashSet<Integer> hashSet =  new LinkedHashSet<Integer>();
        for(int i = 0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        return hashSet.size();
    }
    public int removeDuplicateVariable(int[] arr ){
        if(arr.length == 0){
            return 0;
        }
        int j = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
