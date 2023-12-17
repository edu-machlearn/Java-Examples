package com.biswa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfList {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4};
        List<Integer> list= Arrays.asList(arr);
        System.out.println(list);
        list.stream().map(x -> x * x).collect(Collectors.toList());
        //System.out.println(squareList);
    }
}
