package com.java.sample;

import java.util.Arrays;

public class QuickSort {
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
        sortArray[9] = 60;
        QuickSort qs = new QuickSort();
        qs.quickSort(sortArray, 0, sortArray.length - 1);
        System.out.println("Sorted Array " + Arrays.toString(sortArray));
    }

    public int partition(int[] sortArray, int low, int high) {
        int j = high;
        int i = low;
        int pivot = sortArray[low];
        while (i < j) {
            while (pivot >= sortArray[i] && i<high) {
                i++;
            }
            while (pivot < sortArray[j]) {
                j--;
            }
            if (i < j) {
                swap(sortArray, i, j);
            }
        }
        swap(sortArray, j, low);
        return j;
    }

    public void swap(int[] sortArray, int i, int j) {
        int temp = sortArray[i];
        sortArray[i] = sortArray[j];
        sortArray[j] = temp;
    }

    public void quickSort(int[] sortArray, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(sortArray, low, high);
            quickSort(sortArray, low, pivotIndex - 1);
            quickSort(sortArray, pivotIndex + 1, high);
        }

    }
}
