package com.java.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateCompare {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse("2021-09-28");
        Date d2=new Date();
        System.out.println("args = " + new Date());
        System.out.println("The date 1 is: " + sdformat.format(d1));
        System.out.println("The date 2 is: " + sdformat.format(d2));

        long difference_In_Time = d2.getTime() - d1.getTime();
        long diff = TimeUnit.DAYS.convert(difference_In_Time, TimeUnit.MILLISECONDS);
        System.out.println("Days = " + diff);
        if(d1.compareTo(d2) > 0) {
            System.out.println("Date 1 occurs after Date 2");
        } else if(d1.compareTo(d2) < 0) {
            System.out.println("Date 1 occurs before Date 2");
        } else if(d1.compareTo(d2) == 0) {
            System.out.println("Both dates are equal");
        }
    }
}
