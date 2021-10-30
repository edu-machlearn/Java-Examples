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
        studentList.forEach(student-> System.out.println(student.getId()+" "+student.getName()+" "+ student.getAge()));
        System.out.println("-------");

        List<Student> finalStudentCollection = studentList.stream()
                .filter(ageGt20 -> ageGt20.getAge() > 20)
                //.map(studentToLower -> studentToLower.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(finalStudentCollection);
        finalStudentCollection.forEach(stu-> System.out.println(stu.getName().toUpperCase()+" "+stu.getId()+" "+stu.getAge()));

        long count = studentList.stream()
                .filter(ageCount -> ageCount.getAge() > 20)
                .count();
        System.out.println(count);
    }
}
