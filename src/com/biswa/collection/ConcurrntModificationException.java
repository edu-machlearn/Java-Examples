package com.biswa.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrntModificationException {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Iterating and modifying a CopyOnWriteArrayList using an Iterator
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer num = itr.next();
            System.out.println(num);
            if (num == 2) {
                // This modification is allowed in CopyOnWriteArrayList
                list.add(4); // No ConcurrentModificationException!
            }
        }

        System.out.println(list);
    }
}
