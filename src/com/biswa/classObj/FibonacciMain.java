package com.biswa.classObj;

class Fibonacci{
    static  int fibo(int n){
        if(n<=1)
            return n;
        else
            return fibo(n-1)+fibo(n-2);
    }
}

public class FibonacciMain {
    public static void main(String[] args) {
        System.out.println(Fibonacci.fibo(10));
    }
}
