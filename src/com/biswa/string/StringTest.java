package com.biswa.string;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String name="Biswaranjan";
        String name1="biswaranjan";
        //OR
        String myName= new String("Biswaranjan Mohapatra");
        //Find out the length of String
        int length=myName.length();
        System.out.println(length);

        //charAt()
        System.out.println(name.charAt(5));
        //compareTo and comparToIgnoreCase
        System.out.println(name.compareTo(name1));
        System.out.println(name.compareToIgnoreCase(name1));

        //equals and equalsIgnoreCase
        System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));

        //replace
        System.out.println(name.replace('B','V'));
        System.out.println(name.replace("jan","vxz"));

        //Lower case and Upper Case
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());

        //concat
        System.out.println(myName.concat(", Hello Welcome."));
        //isEmpty
        System.out.println(myName.isEmpty());

        //substring
        System.out.println("Biswaranjan".substring(2));
        System.out.println("Biswaranjan".substring(2,12));
        System.out.println("Biswaranjan".length());
        System.out.println(name.length());

    }
}
