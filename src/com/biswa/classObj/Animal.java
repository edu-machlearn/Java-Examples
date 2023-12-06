package com.biswa.classObj;
abstract class Dog{//final
    void showDog() {//Complete method
        System.out.println("I am dog...");
    }
}

class DesiDog extends Dog{
    void showDog() {//Complete method
        System.out.println("I am Desi dog...");
        super.showDog();
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog desi= new DesiDog();
        desi.showDog();
    }
}
