package com.biswa.classObj;

class Student {
    int sRoll;
    String sName;
    double sMark;
    Student(int sRoll,String sName){
        this.sRoll=sRoll;
        this.sName=sName;
    }

    Student(int sRoll,String sName, double sMark){
        this(sRoll,sName);
        this.sMark=sMark;
    }

    void display(){
        System.out.println(sRoll+" "+sName+" "+sMark);
        this.show();
    }
    void show(){
        System.out.println("I am in show..");
    }
}
