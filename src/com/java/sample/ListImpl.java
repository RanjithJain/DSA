package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class ListImpl {

    static int size=10;
    static int counter=0;
    static int index=0;
    int arrayStore[];

    public ListImpl() {
        arrayStore=new int[size];
    }

    public void add(int element){
        counter++;
        if(index<size){
            arrayStore[index++]=element;
        }else{
            increaseSize();
            arrayStore[index++]=element;
        }
    }

    public int get(int indexLocal){

        if(indexLocal<size){
            return arrayStore[indexLocal];
        }else{
            throw new NoSuchElementException();
        }
    }

    private void increaseSize(){
        if (counter>=9){
            size=size+10;
            arrayStore= Arrays.copyOf(arrayStore,size);
            counter=0;

        }
    }

}
