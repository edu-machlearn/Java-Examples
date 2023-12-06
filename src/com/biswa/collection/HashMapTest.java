package com.biswa.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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


        Set set=hm.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        for(Map.Entry entry:hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        hm.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
