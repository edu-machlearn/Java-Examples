package com.biswa.classObj;

class Factorial{
    int findFact(int n){
        int fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        return fact;
    }
}

public class FactorialTest {
    public static void main(String[] args) {
        Factorial fact=new Factorial();
        int result=fact.findFact(5);
        System.out.println(result);
        System.out.println(fact.findFact(5));
    }
}
