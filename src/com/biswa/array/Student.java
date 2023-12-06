package com.biswa.array;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getDetails(){
        System.out.println(id+" "+name);
    }
}
