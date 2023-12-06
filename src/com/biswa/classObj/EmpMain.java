package com.biswa.classObj;

import java.util.Scanner;

class Emp{
    int empId;
    String empName;
    float basicSalary;
    float ta;
    float da;
    float hra;
    float totalSalary;

    void getEmpData(){
        Scanner sc= new Scanner(System.in);
        empId=sc.nextInt();
        sc.nextLine();
        empName=sc.nextLine();
        basicSalary=sc.nextFloat();
    }

    void calculateSalary(){
        ta=(basicSalary*10)/100;
        da=(basicSalary*20)/100;
        hra=(basicSalary*16)/100;
        totalSalary=basicSalary+ta+da+hra;
    }
    void displayEmp(){
        calculateSalary();
        System.out.println("Employee Information\n------------------------------");
        System.out.println("Employee Id  \t:"+empId);
        System.out.println("Employee Name  \t:"+empName);
        System.out.println("Basic Salary  \t:"+basicSalary);
        System.out.println();
        System.out.println("TA \t:"+ta);
        System.out.println("DA \t:"+da);
        System.out.println("HRA \t:"+hra);
        System.out.println("----------------------------");
        System.out.println("Total Salary \t:"+totalSalary);

    }
}

public class EmpMain {
    public static void main(String[] args) {
        Emp emp= new Emp();
        emp.getEmpData();
        emp.displayEmp();
    }
}
