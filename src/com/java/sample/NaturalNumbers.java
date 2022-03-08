package com.java.sample;

public class NaturalNumbers {

   /* public static void main(String[] args) {

        int [] natural={1,2,3,4,5,6,7,8,9,10};

        int [] missing={1,2,3,4,5,6,7,8,10};

        for(int i=0;i< natural.length;i++){
            if(i+1 != missing[i]){
                System.out.println( i+1);
                return;
            }

        }
    }*/

    public static int
    findDisappearedNumbers(int[] nums)
    {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
            sum-=nums[i];
        return sum;
    }
    public static void main(String[] args)
    {
        int[] a = { 1,2,3,5,6 };
        System.out.println(findDisappearedNumbers(a));
    }
}
