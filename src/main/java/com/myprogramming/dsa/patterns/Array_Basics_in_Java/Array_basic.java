package com.myprogramming.dsa.patterns.Array_Basics_in_Java;

public class Array_basic{
    public static void main(String[] args){
        int [] arr = new int[5];  // All values will be 0
        int [] nums = {10,20,30,40,50,};  // 5 values, length = 5
        System.out.println(nums.length);

        System.out.println(nums[3]); // prints 40

        System.out.print("Values of Array arr :");
        for (int i = 0; i < arr.length;i++){
           System.out.println(i + ",");
        }

    }

}
