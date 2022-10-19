package com.biswa.classObj;

class Addition{
    int add(int a, int b){
        System.out.println("add is calling "+a+" "+b);
        int add=a+b;
        return add;
    }
}

public class AdditionTest {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(10, 30));
        int result=addition.add(10,30);
        System.out.println(result);
    }
}
