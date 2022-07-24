package com.company;
import java.util.*;
public class PrimeInRange {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
        System.out.println("enter the starting range number");
    int low = scn.nextInt();
        System.out.println("enter the last range number");
    int high = scn.nextInt();

        for(int i = low;i<=high;i++)
    {
        boolean ans = isPrime(i);
        if(ans == true)
        {
            System.out.println(i);
        }
    }
}

    public static boolean isPrime(int num)
    {
        for(int i = 2;i  < num;i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}




