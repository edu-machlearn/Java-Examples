package com.aditri;
interface Square<T,R>{
    R calculate(int n);
}
public class CalculatorTest {
    public static void main(String[] args) {
        Square<Integer,Double> s= (n)->{
            return (double) (n*n);
        };

        System.out.println(s.calculate(5));
    }
}
