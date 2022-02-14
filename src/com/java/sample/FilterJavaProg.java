package com.java.sample;

import java.util.*;
import java.util.stream.Collectors;

public class FilterJavaProg {

    public static void main(String[] args) {

        List<String> cities=new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Kolkata");


        Property p2=new Property();
        p2.city=null;
        p2.micromarket="Koprmamangala";

        Property p3=new Property();

        p3.micromarket="Andheri";
        Property p1=new Property();
        p1.city="Delhi";
        p1.micromarket="Electronics";

        Property p4=new Property();
        p4.city="Kolkata";
        p4.micromarket="Hawra";

        List<Property> propertyList=new ArrayList<>();

        propertyList.add(p3);
        propertyList.add(p1);
        propertyList.add(p2);
        propertyList.add(p4);


        propertyList=propertyList.stream().filter(plan->{
                return cities.contains(plan.city);
            }).collect(Collectors.toList());

        propertyList.forEach(p -> System.out.println(p.city));

        propertyList = propertyList.stream()
                .sorted(Comparator.comparing(Property::getCity).reversed())
                .collect(Collectors.toList());

        propertyList.forEach(p -> System.out.println(p.city));
    }
}

class Property{

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMicromarket() {
        return micromarket;
    }

    public void setMicromarket(String micromarket) {
        this.micromarket = micromarket;
    }

    String city;
    String micromarket;
}

