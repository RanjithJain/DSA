package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Suffix {

    public static void main(String[] args) {
        ArrayList<String> A=new ArrayList<>();
        A.add("aa");
        A.add("aab");
        A.add("ab");
        A.add("b");


        String B="b";
        List<Integer> result=solve(A,B);
        System.out.println(Arrays.toString(result.toArray()));
    }
    public static ArrayList<Integer> solve(ArrayList<String> A, String B) {
        int firstIndex=-1,lastindex=-1;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if(A.get(i).startsWith(B)){
                if(firstIndex==-1)
                    firstIndex=i;
                else{
                    lastindex=i;
                }
            }
            if(firstIndex != -1 && lastindex==-1)
                lastindex=firstIndex;
        }
        result.add(firstIndex);
        result.add(lastindex);
        return result;
    }
}
