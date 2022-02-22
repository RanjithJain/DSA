package com.java.sample;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] sortArray = new int[10];
        sortArray[0] = 23;
        sortArray[1] = 10;
        sortArray[2] = 45;
        sortArray[3] = 98;
        sortArray[4] = 15;
        sortArray[5] = 66;
        sortArray[6] = 33;
        sortArray[7] = 77;
        sortArray[8] = 88;
        sortArray[9] = 3;

        MergeSort ms=new MergeSort();
        int[] mergedSortArray = Arrays.copyOf(sortArray, sortArray.length);
        ms.mergesort(sortArray,mergedSortArray,0, sortArray.length-1);
        System.out.println("Sorted Array"+Arrays.toString(sortArray));
    }

    public void mergesort(int[] sortArray,int []mergedSortArray, int low, int high){

        if(low<high){
            int mid=(low+high)/2;
            mergesort(sortArray,mergedSortArray,low,mid);
            mergesort(sortArray,mergedSortArray,mid+1,high);
            merge(sortArray,mergedSortArray,low,mid,high);
        }
    }
    public void merge(int[] sortArray,int[] mergedSortArray, int low, int mid,int high){

        int k=low;
        int i=low;
        int j=mid+1;
            while(i<=mid && j<=high){
                if(sortArray[i]<sortArray[j]){
                    mergedSortArray[k]=sortArray[i];
                    i++;
                }else{
                    mergedSortArray[k]=sortArray[j];
                    j++;
                }
                k++;
            }
            if(i>mid){
                while(j<=high){
                    mergedSortArray[k]=sortArray[j];
                    k++;
                    j++;
                }
            }else{
                while(i<=mid){
                mergedSortArray[k]=sortArray[i];
                k++;
                i++;
            }
        }
            for(int l=low;l<=high;l++){
                sortArray[l]=mergedSortArray[l];
            }
    }
}
