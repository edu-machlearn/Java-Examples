package com.biswa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student(1,"Biswaranjan",36));
        studentList.add(new Student(2,"Saumyaranjan",32));
        studentList.add(new Student(3,"Deepika",32));
        studentList.add(new Student(4,"Aditri",6));
        studentList.add(new Student(5,"Subham",10));
        System.out.println(studentList);
        long count = studentList.stream()
                .map(Student::getAge)
                .filter(age -> age > 20)
                .count();
        System.out.println(count);
        List<Integer> age = studentList.stream()
                .map(Student::getId)
                .filter(age1->age1>=20)
                .collect(Collectors.toList());
        System.out.println(age);
        String name123 = studentList.stream().map(Student::getName)
                .filter(name -> name.equalsIgnoreCase("Saumyaranjan"))
                .findFirst().orElse(null);
        System.out.println(name123);
    }
}
