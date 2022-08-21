package com.java.sample;

public class Swap{

    public static void main(String [] args) {

        int[] swapA = {10, 20};
        swapA = swap(swapA);
        System.out.println(swapA[0] + " After Swap " + swapA[1]);
    }
    public static int[]  swap(int [] a){
        int temp=0;

        temp=a[0];
        a[0]=a[1];
        a[1]=temp;

        return a;
        }

        }

