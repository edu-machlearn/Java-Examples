package com.biswa.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> hm= new HashMap<>();
        hm.put("1","Biswa");
        hm.put("2","Biswa");
        hm.put("1","saumya");
        hm.put("1","Aditri");
        hm.put(null,"Deepika");
        hm.put(null,"ee");
        System.out.println(hm);
    }
}
