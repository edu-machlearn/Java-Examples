package com.biswa.stream;

import java.util.List;

public class OddNumberStreamTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list.stream().filter(n->n%2!=0).forEach(System.out::println);

    }
}
