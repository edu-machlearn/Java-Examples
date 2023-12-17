package com.biswa.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","Biswaranjan");
        map.put("mail","biswa@gmail.com");
        map.put("mobile","9099887656");
        System.out.println(map);

    map.forEach((k,v)->{
        System.out.println(k);
    });
    }
}
