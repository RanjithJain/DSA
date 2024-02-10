package com.java.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class DatewiseUnique {

    public static void main(String[] args) throws ParseException {

        DatePojo dp=new DatePojo();
        int count=0;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String date_string = "-09-2022";
        Set<Date> set=new TreeSet<Date>();
        while(count<30){
            count++;
            if(count==20){
                System.out.println("purposefully missing 20th date");
            }else {
                Date date = formatter.parse(count + date_string);
                set.add(date);
                set.add(date);
            }
        }
        set.stream().forEach(s-> System.out.println(s.toString()));
    }
}
