package com.biswa.collection;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Biswa");
        al.add("aditri");
        al.add("Saumaya");
        al.add("100");
        al.add("Biswa");
        al.add("Saumaya");
        al.add("10");
        al.add("Aditri");

        al.forEach(System.out::println);
        System.out.println("--------");
        Collections.sort(al);
        al.forEach(System.out::println);

    }
}
