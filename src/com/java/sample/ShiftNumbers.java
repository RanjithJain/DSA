package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftNumbers {

    public static void main(String[] args) {

        int d=4;
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int count=a.size();
       int[] resultList=new int[count];
        for(int i=0;i<count;i++){
            int temp=a.get(i);
            int finalDestination=(i+count-d) % count ;
            resultList[finalDestination]=temp;
        }
        for(int s=0;s<count;s++){
            System.out.println(resultList[s]);
        }


    }
}
