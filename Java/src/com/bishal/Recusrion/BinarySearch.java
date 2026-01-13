package com.bishal.Recusrion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        int target = 6;
        int start = 0;
        int end = arr.length-1;
        int ans = getTargetElement(arr,target,start,end);

         System.out.println(ans);
       //System.out.println("num"+searchBinaryNumber(arr,target,start,end));
       /* if(num == -1){
            System.out.println("not found "+num);
        }else{
            System.out.println("Target "+arr[num]);
        }*/


    }
    public static int searchBinaryNumber(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        System.out.println("start "+start);
        System.out.println("end "+end);
        System.out.println("mid "+mid);
        if(target == arr[mid]){
            return mid;
        }
        if(target> arr[mid]){
            System.out.println("mid inside if"+mid);
            return searchBinaryNumber(arr,target,mid+1,end);
        }else{
            System.out.println("mid outside if"+mid);
            return searchBinaryNumber(arr, target, start, mid-1);
        }
    }
    //Check if element is equal to target or greater than target
    public static int getTargetElement(int[] arr, int target,int start,int end){
       if(start>end){
           return -1;
       }
       if(target>arr[end]){
           return -1;
       }
       int mid=-1;
       while(start<=end){
            mid = start + (end-start)/2;
           if(target==arr[mid]){
               return arr[mid];
           }
           if(target<arr[mid]){
               end = mid-1;
           }
           else if(target>arr[mid]){
               start = mid+1;
           }
       }
       /*if(target<arr[mid]){
           return arr[mid];
       }else{
           return -1;
       }*/
       return arr[end];
    }
}
