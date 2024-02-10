package com.java.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");
        int count = 0;
        for (String str : names) {
            if (str.length() < 6)
                count++;
        }
        System.out.println("There are "+count+" strings with length less than 6");

        main2();
    }

    public static void main2() {
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");


        //Using Stream and Lambda expression
        long count = names.stream().filter(str->str.length()<6).count();
        System.out.println("There are "+count+" strings with length less than 6");


        HashSet<String> set=new HashSet<>();
        set.add("Paul");
        set.add("Ram");
        set.add("Aaron");
        set.add("Ram");
        set.add("Becky");

        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
