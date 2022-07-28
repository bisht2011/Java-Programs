package com.company;

import java.util.Scanner;

public class binarysearch {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] asc = {10,20,30,40,50};
         int[] dsc = {10,8,6,4,2};
            System.out.println("enter the target value you want to search");
            int target = scan.nextInt();
            int target1=scan.nextInt();

            System.out.println(ascending(target,asc));

        System.out.println(descending(target1,dsc));

    }
//
     static int descending(int target1,int[] dsc) {
         int start = 0;
         int end = dsc.length;
         while (start <=end) {
             int mid = start + (end - start) / 2;
             if (target1 < dsc[mid])
                 start = mid + 1;
             else if (target1 > dsc[mid])
                 end = mid - 1;
             else
                 return mid;

         }
         return -1;
    }

    static int ascending(int target,int[] asc) {
        int start = 0;
        int end = asc.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < asc[mid])
                end = mid - 1;
            else if (target > asc[mid])
                start = mid + 1;
            else
                return mid;

        }
        return -1;
    }

}
