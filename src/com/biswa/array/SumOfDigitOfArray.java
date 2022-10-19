package com.biswa.array;

import java.util.Scanner;

public class SumOfDigitOfArray {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc= new Scanner(System.in);
        int SIZE=sc.nextInt();
        long arr[]= new long[SIZE];
        for(int i=0;i<SIZE;i++){
            arr[i]=sc.nextInt();
        }
        long sum=0;
        for(int i=0;i<SIZE;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}
