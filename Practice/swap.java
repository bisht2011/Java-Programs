package com.company;

public class swap {

    public static void main(String[] args) {
       int a=10;
     int b=20;
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println(a+ " " + b);
        swapping(a,b);
        System.out.println(a + " " + b);

    }

     static void swapping(int a, int b) {
        int temp=a;
       a=b;
       b=temp;


    }
}
