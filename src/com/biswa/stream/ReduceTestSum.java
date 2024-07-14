package com.biswa.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceTestSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        System.out.println(list.stream().anyMatch(x->x>=5));
    }
}
