package com.biswa.array;

public class TestMain {
    public static void main(String[] args) {
        Student[] stu= new Student[3];
        stu[0]= new Student("111","Biswa");
        stu[1]= new Student("112","Saumya");
        stu[2]= new Student("112","Saumya");

        for(Student s:stu){
            s.getDetails();
        }

    }
}
