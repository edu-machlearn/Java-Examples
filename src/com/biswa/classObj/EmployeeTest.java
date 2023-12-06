package com.biswa.classObj;

class Employee{
    int id;
    String name;
    Employee(){//Non Parameterized // Default
        System.out.println("This is the Default Constructor..");
    }

    Employee(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println(id+"  "+name);
    }

    void showStudent(){
        System.out.println(id+"  "+name);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        Employee emp2= new Employee(1111,"Biswaranjan");
        emp2.showStudent();
    }
}
