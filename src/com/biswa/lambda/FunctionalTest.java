package com.biswa.lambda;

import com.biswa.collection.Student;

import java.util.function.*;

@FunctionalInterface
interface CalculateInterface<T,U>{
    T calculate(T a, U b);
}

public class FunctionalTest {
    public static void main(String[] args) {

        CalculateInterface<Integer,Integer> calculateInterface=(a,b)->{
            return a+b;
        };

        System.out.println(calculateInterface.calculate(6,20));
        Supplier<String> supplier=()->{
            return Student.getStudent(1,"Biswa");
        };
        System.out.println(supplier.get());

    }
}
