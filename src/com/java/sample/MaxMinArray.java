package com.java.sample;

import java.util.Arrays;

public class MaxMinArray {

    public static void main(String[] args) {
        int [] genearray=new int[6];
        genearray[0]=22323;
        genearray[1]=4;
        genearray[2]=3000;
        genearray[3]=8;
        genearray[4]=6;
        genearray[5]=4;
        int max=-1,min=-1;
        if(genearray[0]>genearray[1]){
            max=genearray[0];
            min=genearray[1];
        }else{
            max=genearray[1];
            min=genearray[0];
        }
     for(int i=2;i< genearray.length;i++){
         if(max<genearray[i]){
             max=genearray[i];
         }
         if(min>genearray[i]){
             min=genearray[i];
         }
     }
        System.out.println("Max = " + max+" Min "+ min);


    }
}
