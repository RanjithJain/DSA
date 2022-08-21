package com.java.sample;

import java.util.Arrays;

public class MergeExample {
    public static void main(String[] args) {

             int[] nums1={1,2,3,0,0,0};
             int []nums2={2,5,6};
             int m=3;
             int n=3;

            int mcount=0,ncount=0,result=0;
            int []resultArray=new int[m+n];
            while(mcount<m && ncount<n){
                if(nums1[mcount]<=nums2[ncount]){
                    resultArray[result]=nums1[mcount];
                    mcount++;
                    result++;
                }else{
                    resultArray[result]=nums2[ncount];
                    ncount++;
                    result++;
                }
            }
            while(ncount<n){
                resultArray[result]=nums2[ncount];
                ncount++;
                result++;
            }
            while(mcount<m){
            resultArray[result]=nums1[mcount];
            mcount++;
            result++;
            }

            for(int j=0;j<result;j++){
                nums1[j]=resultArray[j];
            }
            System.out.println(Arrays.toString(resultArray));
        }

}
