package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPIExamples {

    public static void main(String[] args) {

        String[] streamArray={"Ranjith","Khushbu","Nishtha","Rishvi","Ranjith"};
        person p=new person();
        p.setAge(10);
        p.setName("Ranjith");
        person p2=new person();
        p2.setAge(11);
        p2.setName("Rishvi");
        person p3=new person();
        p3.setAge(13);
        p3.setName("Ranjith");


        List<person> streamList=new ArrayList<>();
        streamList.add(p);
        streamList.add(p2);
        streamList.add(p3);



    }
}

class person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;
}
