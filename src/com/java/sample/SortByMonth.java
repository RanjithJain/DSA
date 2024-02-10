package com.java.sample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.;

public class SortByMonth {
    static SlotByMonthResponseDto slotByMonthResponseDto=new SlotByMonthResponseDto();
    static SlotByMonthResponseDto slotByMonthResponseDto2=new SlotByMonthResponseDto();
    static SlotByMonthResponseDto slotByMonthResponseDto3=new SlotByMonthResponseDto();

    static List<SlotByMonthResponseDto> monthResponseDtoList=new ArrayList<SlotByMonthResponseDto>();

    public static void main(String[] args) {

        slotByMonthResponseDto.setMonth("January");
        slotByMonthResponseDto.setYear(2021);
        slotByMonthResponseDto.setTotalElements(22222222L);
        slotByMonthResponseDto.setCreatedAt("12312323123");
        slotByMonthResponseDto.setCreatedBy("Ranjith");

        slotByMonthResponseDto2.setMonth("February");
        slotByMonthResponseDto2.setYear(2021);
        slotByMonthResponseDto2.setTotalElements(22222222L);
        slotByMonthResponseDto2.setCreatedAt("12312323123");
        slotByMonthResponseDto2.setCreatedBy("Ranjith");

        slotByMonthResponseDto3.setMonth("March");
        slotByMonthResponseDto3.setYear(2021);
        slotByMonthResponseDto3.setTotalElements(22222222L);
        slotByMonthResponseDto3.setCreatedAt("12312323123");
        slotByMonthResponseDto3.setCreatedBy("Ranjith");

        monthResponseDtoList.add(slotByMonthResponseDto);
        monthResponseDtoList.add(slotByMonthResponseDto3);
        monthResponseDtoList.add(slotByMonthResponseDto2);

        Collections.sort(monthResponseDtoList,  new Comparator<SlotByMonthResponseDto>() {
            public int compare(SlotByMonthResponseDto o1, SlotByMonthResponseDto o2) {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("MMM-yyyy");
                    return sdf.parse(o1.getMonth().substring(0,3)+"-"+o1.getYear()).compareTo(sdf.parse(o2.getMonth().substring(0,3)+"-"+o2.getYear()));  //sdf.parse returns date - So, Compare Date with date
                } catch (Exception ex) {
                    System.out.println("Error "+ex.toString());
                    return o1.getMonth().substring(0,3).compareTo(o2.getMonth().substring(0,3));
                }
            }
        });
        monthResponseDtoList.stream().forEach(s-> System.out.println("Sorted ->  "+s.getMonth()));
    }
}
