package com.design;

public class DBSingleton {

    private static  DBSingleton instance = null;

    private DBSingleton(){}
    public static DBSingleton getInstance(){
        if(instance==null) {
            instance = new DBSingleton();
        }
        return instance;
    }
}
