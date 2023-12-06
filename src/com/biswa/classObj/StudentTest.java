package com.biswa.classObj;

class StudentTest{//2 Creating object of that class and call the property
    public static void main(String[] args) {
        Student s1 = new Student(1,"Biswa");
        s1.display();

        Student s2 = new Student(2,"Aditri",90);
        s2.display();
    }
}
