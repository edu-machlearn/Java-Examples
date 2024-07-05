package com.biswa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberInList {
    public static void main(String[] args) {
        Integer number[]=new Integer[]{65, 98, 16,15,17};
        Arrays.stream(number).forEach(System.out::println);

        List<Integer> listNumber= Arrays.asList(number);
        List<Integer> evenList = listNumber.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        System.out.println("Odd Numbers: ");
        listNumber.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
