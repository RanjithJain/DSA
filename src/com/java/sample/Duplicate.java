package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {

        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(5);
        listWithDuplicates.add(6);
        listWithDuplicates.add(7);
        listWithDuplicates.add(6);
        listWithDuplicates.add(5);


        List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        listWithoutDuplicates.forEach(s->System.out.println(String.valueOf(s)));

    }
}
