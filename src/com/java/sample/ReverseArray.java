package com.java.sample;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String [] reverse=new String[4];
        reverse[0]="Ranjith";
        reverse[1]="Khushbu";
        reverse[2]="Nishtha";
        reverse[3]="Rishvi";


      for(int i= reverse.length-1;i>=0;i--){
          System.out.println("args = " + reverse[i]);
      }

    }
}
