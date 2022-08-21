package com.java.sample;

public class NaturalNumbers {

    public static void main(String[] args) {

        int [] natural={1,2,3,4,5,6,7,8,9,10};

        int [] missing={1,2,3,4,5,6,7,8,10};

        for(int i=0;i< natural.length;i++){
            if(i+1 != missing[i]){
                System.out.println( i+1);
                return;
            }

        }
    }
}
