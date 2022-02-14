package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {
        List<String> areaRoomEntities=new ArrayList<>();
        areaRoomEntities.add("Ranjith");
        areaRoomEntities.add("1234");
        areaRoomEntities.add("Ranjith2");
        areaRoomEntities.add("Ranjith3");
        areaRoomEntities.add("1234");
        areaRoomEntities.add("Ranjith4");

        List<String> newList=new ArrayList<>();

        newList=areaRoomEntities.stream().filter(area-> !area.equalsIgnoreCase("1234")).collect(Collectors.toList());
        areaRoomEntities=newList;
        areaRoomEntities.forEach(a-> System.out.println(a));
    }
}
