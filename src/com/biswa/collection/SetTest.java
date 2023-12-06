package com.biswa.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(100);
        set.add(300);
        set.add(300);
        set.add(200);
        System.out.println(set);

        int sum=0;
        Iterator<Integer> itr= set.iterator();
        while(itr.hasNext()){
            Integer n=itr.next();
            System.out.println(n);
            sum=sum+n;
        }
        System.out.println("Sum = "+sum);

    }
}
