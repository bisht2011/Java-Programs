package com.company;
import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        System.out.println("enter the number");
        int n= scan.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not prime");
                break;
            }
            else
                count++;

        }
        if(count>0)
            System.out.println("prime");

    }
}
