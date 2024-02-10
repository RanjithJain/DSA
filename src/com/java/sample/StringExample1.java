package com.java.sample;

import java.util.*;

public class StringExample1 {
    public static void main(String[] args) {
        String testString="ranjaaaaaa";

        char [] distinctchars=testString.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:distinctchars){
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }
        }
        System.out.println("count "+ hm.size());
        hm.forEach((k,v) -> System.out.println(k)) ;

        reverseString("Ranjith Jain");
        removeOcc("Ranjith");
        alternatingCharacters("ABAAAABAB");
        substrCount(7,"abcbaba");
        countWords("I am Ranjith");
        nonRepeated("abcaabcddxy");


    }
    public static void reverseString(String test){

        StringBuffer str=new StringBuffer(test);
        System.out.println(str.reverse());

        char[] c=test.toCharArray();
        int i=c.length;
        while(i>0)
            System.out.print(c[--i]);

        System.out.println();
    }

    public static void removeOcc(String testOcc){

        char[] ch=testOcc.toCharArray();
        StringBuffer strBuf=new StringBuffer();
        for(char c:ch){
            if(c!='a'){
                strBuf.append(c);
            }
        }
        String result = testOcc.replaceAll(String.valueOf("a"), "");
        System.out.println(result);
        System.out.println(strBuf.toString());
    }

    public static void  alternatingCharacters(String s) {
        // Write your code here

        char[] c= s.toCharArray();
        int deletecounter=0;
        for(int i=1;i<c.length;i++){
            if(c[i]==c[i-1]){
                deletecounter++;

            }
        }
        System.out.println(deletecounter);


    }

    // Complete the substrCount function below.
    public static void substrCount(int n, String s) {

        int counter = 0;

        for(int i = 0; i < n - 1; i++){
            boolean hasOtherChar = false;
            int otherCharIndex = -1;

            for(int j = i+1; j < n; j++){
                if(s.charAt(i) == s.charAt(j)) {
                    if(!hasOtherChar) {
                        counter++;
                    } else if(otherCharIndex == i + ((j-i)/2)) {
                        counter++;
                        break;
                    }
                } else if(hasOtherChar){
                    break;
                } else {
                    hasOtherChar = true;
                    otherCharIndex = j;
                }
            }
        }

        System.out.println(n + counter);


        //------------------------------------------------
        int specialcount=n;
        int count=1;
        while(count<n){
            for(int i=0;i<n-count;i++){
                String target=s.substring(i,i+count);
                for(char c : target.toCharArray()){
                    if(c==target.toCharArray()[0]){
                       //
                    }
                    specialcount++;
                }

                //All of the characters are the same, e.g. aaa.
                //All characters except the middle one are the same, e.g. aadaa.
            }


        }

        System.out.println();
    }

    public static void countWords(String abc){
        int count=1;
        for(char c: abc.toCharArray()){
            if(c==' ')
                count++;
        }
        System.out.println(count);
    }

    public static void nonRepeated(String nonrepeated){

        LinkedHashMap<Character,Integer> hm=new LinkedHashMap();

        for(char c : nonrepeated.toCharArray()){

            if(hm.containsKey(c)){
                int value=hm.get(c);
                value=value+1;
                hm.put(c,value);
            }else{
                hm.put(c,1);
            }
        }
        for(char c : nonrepeated.toCharArray()){
            if(hm.get(c)==1){
                System.out.println("First nonrepeatable character =  "+ c);
                break;
            }
        }
    }


}
