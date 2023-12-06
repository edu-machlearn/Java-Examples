package com.biswa.classObj;

class Addition{
    Addition(){}
    int add(int a, int b){//1
        return a+b;
    }
    int add(int a, int b, int c){//2
        return a+b+c;
    }

    float add(float a, int b){//3
        return a+b;
    }
}

public class AdditionTest {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(10,20));//1
        System.out.println(addition.add(10,20,30));//2
        System.out.println(addition.add(10.4F,20));//3

    }
}
