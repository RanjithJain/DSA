package com.java.sample;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] sortArray=new int[10];
        sortArray[0]=23;
        sortArray[1]=10;
        sortArray[2]=45;
        sortArray[3]=98;
        sortArray[4]=15;
        sortArray[5]=66;
        sortArray[6]=33;
        sortArray[7]=77;
        sortArray[8]=88;
        sortArray[9]=3;

        for(int i=0;i<sortArray.length;i++){
            for(int j=1;j<sortArray.length;j++){
                if(sortArray[j-1]>sortArray[j]){
                    int temp=sortArray[j-1];
                    sortArray[j-1]=sortArray[j];
                    sortArray[j]=temp;
                }

            }
        }

        System.out.println("Sorted Array"+ Arrays.toString(sortArray));

    }
}
