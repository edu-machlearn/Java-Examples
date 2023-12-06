package com.biswa.classObj;

class A1{
    int a=10;
}
interface I1{
    int b=20;
}
interface I2{
    int c=30;
}
interface Circle{
    float PI=3.14F;
    void calculate();
    default void defaultMethod(){

    }
    static void show(){

    }
}

class Area extends A1 implements  Circle,I1,I2{

    @Override
    public void calculate() {
        float r=3;
        System.out.println("Area is :"+PI*r*r);
    }
    void showAllData(){
        System.out.println(a+" "+b+" "+c+" "+PI);
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Area circle = new Area();
        circle.calculate();
        circle.showAllData();
    }
}
