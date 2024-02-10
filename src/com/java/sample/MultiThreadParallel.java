package com.java.sample;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class MultiThreadParallel {
    public static void main(String[] args) {

        int[] nums1 = {4,0,0,0,0,0};
        int [] nums2 = {1,2,3,5,6,7,6,6,6,6};
        int [] nums3 = {3,2,1,3};
        char[] s={'h','e','l','l','o'};
        System.out.println(maxLengthBetweenEqualCharacters("abcdef"));
        merge(nums1,1,nums2,5);
        System.out.println(Arrays.toString(nums1));
        removeDuplicates(nums2);
        twoSum(nums3,6);
        reverseString(s);
    }

    public static int maxLengthBetweenEqualCharacters(String s) {

       return 0;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

    }

    public static void removeDuplicates(int[] nums) {
        if(nums.length==0){
            System.out.println(0);
        }
        int count=1;
        for(int i=1;i<nums.length;i++){
             if (nums[i] != nums[i-1] ) {
                 nums[count] = nums[i];
                    count++;

                }

        }
        System.out.println(Arrays.toString(nums)+"  returned value "+count);

    }
    public static void twoSum(int[] nums, int target) {

        //logic to find the sum in a array withusing o{n2}



    }

    //Input: s = ["h","e","l","l","o"]
    //Output: ["o","l","l","e","h"]
    public static void reverseString(char[] s) {
        int length=s.length;
        for(int i=0;i<s.length/2;i++){
            length--;
            char temp=s[i];
            s[i]=s[length];
            s[length]=temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void  reverse(int x) {


            String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                    : new StringBuilder(String.valueOf(x)).reverse().toString();
            try {
                System.out.println( Integer.parseInt(ans));
            } catch (Exception e) {

            }

    }
}
