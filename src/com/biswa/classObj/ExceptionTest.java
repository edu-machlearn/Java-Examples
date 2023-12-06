package com.biswa.classObj;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 No- ");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        }
        catch(ArithmeticException e){
            System.out.println("Zero Can not be allowed");
        }
        catch (InputMismatchException e){
            System.out.println("Charater Not allowed");
        }
        finally{
            System.out.println("finally..");
        }
    }
}
