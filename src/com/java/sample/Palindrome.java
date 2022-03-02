package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        String palin="abasdaba";
        ArrayList<Integer> list=new ArrayList<>();
        list.stream().distinct().collect(Collectors.toList());
        char[] strArray=palin.toCharArray();

        for (int i=0;i<strArray.length-1;i++){
            if(strArray[i]==strArray[i+1]){
                String reverse=palin.substring(0,i+1);
                String normalString=palin.substring(i+1, strArray.length);
                StringBuffer stringBuffer=new StringBuffer(reverse);
                if(normalString.equals(stringBuffer.reverse().toString())){
                    System.out.println("It is Palindrome");
                    return;
                }

            }

        }
        System.out.println("It is Not  Palindrome");
    }


}
