package com.biswa.pattern;

public class Triangle {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                if(i==10 || j==1)
                    System.out.println("*");
                else
                    System.out.println(" ");
            }
            System.out.println();
        }
    }
}
