package com.java.sample;

import java.util.Arrays;

public class FirstAndLastIndex {

    public static void main(String[] args) {

        int [] arr= new int[10];
        arr[0]=2;
        arr[1]=3;
        arr[2]=10;
        arr[3]=10;
        arr[4]=10;
        arr[5]=10;
        arr[6]=10;
        arr[7]=80;
        arr[8]=90;
        arr[9]=100;
        int num=10;
        int firstIndex=-1;
        int lastIndex=-1;
        int noOfoccurences=0;
        for(int i=0;i< arr.length;i++){
            if(num==arr[i] && noOfoccurences==0){
                firstIndex=i;
                lastIndex=i;
                noOfoccurences=noOfoccurences+1;
            }else if(num==arr[i]){
                lastIndex=i;
                noOfoccurences=noOfoccurences+1;
            }
        }
        System.out.println("args = " + firstIndex +" last "+lastIndex);
    }
}
