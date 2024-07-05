package com.design;

public class DBSingletonDemo {
    public static void main(String[] args) {
        DBSingleton obj = DBSingleton.getInstance();
        System.out.println(obj);
        DBSingleton obj1 = DBSingleton.getInstance();
        System.out.println(obj1);
    }
}
