package com.biswa;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            if (n % 2 == 0)
                System.out.println(n + " is Even");
            else
                System.out.println(n + " is ODD");
        }
    }
}
