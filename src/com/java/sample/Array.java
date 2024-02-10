package com.java.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Array {



        public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "One");
            map.put(Integer.valueOf(1), "One");
            map.put(null, "Null");
            map.put(null, "Another Null");

            System.out.println(map.size());

        }

    public static int minimumCost(int[] nums) {


            int sum=nums[0];
            int min1=Integer.MAX_VALUE;
            int min2=Integer.MAX_VALUE;
            for(int i=1;i< nums.length;i++){

                if(nums[i]<min1){
                    min2=min1;
                    min1=nums[i];
                }else if(nums[i]<min2) {
                    min2=nums[i];
                }
            }
            return (sum+min1+min2);

    }

}
