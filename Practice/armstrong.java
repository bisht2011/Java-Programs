package com.company;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to check if the number is armstrong");
        int num= scan.nextInt();
        System.out.println(arm(num));
    }

  static boolean arm(int num) {
        int temp=num;
        int rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
      return temp == sum;
    }
}
