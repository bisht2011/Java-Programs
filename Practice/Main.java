package com.company.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String c;
        System.out.println("enter two numbers");
        int a= scan.nextInt();
        int b=scan.nextInt();

        do{
            int sum= a+ b;
            System.out.println(sum);
           System.out.println("do you wanna continue");
              c=scan.next();

        }while(c.equals("yes"));

    }
}
