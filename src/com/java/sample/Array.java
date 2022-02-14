package com.java.sample;

public class Array {

    static int count=0;
    int[] newData;
    int length;
    Array(int size){
        length=size;
        newData=new int[size];
    }

    public void insert(int item){
        if(count<length){
            newData[count]=item;
            count++;
        }else{
            int [] extendedNewData=new int[length+1];
        }


    }

    public void removeAt(int index){

    }
}
