package com.biswa.classObj.marker;

class Student{
    void print(){
        System.out.println("print Student");
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        if(s1 instanceof Permission) {
            s1.print();
        }
        else System.out.println("Bye");
    }
}
