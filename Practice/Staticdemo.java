package com.company;

public class Staticdemo{
    static int a=6;
    static int b;

    static{
        b=a*3;
    }

    public static void main(String[] args) {
        System.out.println(a +" "+ b);
        Staticdemo.b+=b;
        System.out.println(a +" "+ b);

    }
}
