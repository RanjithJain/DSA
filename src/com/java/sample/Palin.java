package com.java.sample;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Palin {

    public static void main(String[] args) {
        System.out.println("Palindrome "+isPalindrome(12344321));
    }
        public static boolean isPalindrome(int x) {
            int [] a={1,1,1,2,2,2};
            System.out.println(removeDuplicates(a));
            int inputNumber=x;
            int result=0;
            int sum=0;

            if(inputNumber<0){
                return false;
            }
            while(inputNumber > 0){
                result = (inputNumber % 10);
                sum=(sum*10)+result;
                inputNumber /= 10;

            }
            //resultList.forEach(r-> System.out.println(r));
            boolean palindrom=false;
            if(sum==x)
                return true;
            else
                return false;


        }


        public  static  int removeDuplicates(int[] nums) {

            int start = 1;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[i-1]){
                    nums[start++] = nums[i];
                }
            }
            System.out.println();
            return start;
        }



}
