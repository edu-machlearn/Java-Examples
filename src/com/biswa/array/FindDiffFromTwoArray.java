package com.biswa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDiffFromTwoArray {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={1,2,4,};
        MyLogic.findDiff(arr1,arr2);
    }
}

class MyLogic{
    static void findDiff(int[] arr1, int[] arr2){
        List<Integer> list= new ArrayList<>();
        for (int k : arr1) {
            for (int i : arr2) {
                if (k != i) {
                    list.add(k);
                }
            }
        }

        Integer[] integers = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
    }
}
