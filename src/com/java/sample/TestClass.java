package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        String str=" H e l l o W o r l d ";
        String [] fibnacc={"zero" ,"one", "one" ,"two" ,"three" ,"four" ,"five" ,"six" ,"seven" ,"eight", "nine", "ten"};
        System.out.println(str);
        StringBuffer strbuff=new StringBuffer(str);
        System.out.println("strbuff.reverse() = " + strbuff.reverse());
        List arr=Arrays.stream(fibnacc).distinct().collect(Collectors.toList());
        System.out.println("Fib = " + fib(20));
        System.out.println("series = " + arr);



    }
    static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public void maxOccurence(String sample){

       /* char []aa=null;
        aa[0]=sample.charAt(0);
        int count=0;
        for(int i=1;i< sample.length();i++){
           char temp= sample.charAt(i);
           for(int j=0;j<aa.length;j++){
               if(temp.equals(aa[j])){
                    aa[++count]=temp;
               }
           }
        }*/
    }


}
