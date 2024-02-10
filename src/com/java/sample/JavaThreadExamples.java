package com.java.sample;

import java.util.Calendar;
import java.util.Date;

public class JavaThreadExamples {
    public static void main(String[] args) {
        JavaThreadExamples javaThreadExamples=new JavaThreadExamples();
        JavaThreadExamples javaThreadExamples1=new JavaThreadExamples();
        synchronized (javaThreadExamples){
            synchronized (javaThreadExamples1){
                synchronized (javaThreadExamples){
                    System.out.println("hello world");
                }

            }


        }

    }
}


