package com.company;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res,sum=0;
        System.out.println("enter the number");
        int n= scan.nextInt();

       while(n>0){
            res=n%10;
            sum=sum*10+res;
            n=n/10;
        }
        System.out.println("reverse of the numbers: " + sum);
    }
}
