package com.biswa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLargetNumberArray {
    public static void main(String[] args) {
        Integer arr[]={10,20,40,23,300,200,98,400,877,33,44,22332,3434343,63,2377};
        Arrays.sort(arr);
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Second Largest Number is "+(arr[arr.length-1]));
        List<Integer> intList= (List<Integer>) Arrays.asList(arr);
        List<Integer> nulList = intList.stream()
                .filter(numberGt100 -> numberGt100 >= 100)
                .collect(Collectors.toList());
        //.count();

        System.out.println("Count -"+nulList.stream().count());
        nulList.forEach(printNumber-> System.out.println(printNumber));

        Map<String,String> map= new HashMap<String,String>();
    }
}
