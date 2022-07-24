package com.company.company;

import java.util.Arrays;
import java.util.Scanner;
//public class array {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] ar = {2, 4, 5, 3, 7};
//        int max = ar[0];
//        for (int row = 0; row < ar.length; row++) {
//            if (ar[row] > max)
//                max = ar[row];
//        }
//        System.out.println("max element is " + max);
//        reversear(ar);
//        System.out.println(Arrays.toString(ar));
//        swap(ar, 0, 2);
//        System.out.println(Arrays.toString(ar));
//
//        System.out.println("enter the length of array");
//        int num = scan.nextInt();
//        int[] arr = new int[num];//value of array
//        System.out.println("enter the element of array");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scan.nextInt();//taking input
//        }
//        System.out.print(Arrays.toString(arr));
//        System.out.println();//representing elements in array
//        for (int element : arr) {//for each loop //element represent every element of the array
//            System.out.print(element + " ");//
//        }
//    }
//
//    static void reversear(int[] ar) {
//        int start = 0;
//        int end = ar.length - 1;
//        for (; start < end; start++, end--)
//            swap(ar, start, end);
//    }
//
//    static void swap(int[] ar, int i, int i1) {
//        int temp = ar[i];
//        ar[i] = ar[i1];
//        ar[i1] = temp;
//    }
//}

    // Demonstrate static variables, methods, and blocks.

    class array {

        static int a = 3;

        static int b;

        static void meth(int x) {

            System.out.println("x = " + x);

            System.out.println("a = " + a);

            System.out.println("b = " + b); }


        static {

            System.out.println("Static block initialized.");

            b = a * 4; }

        public static void main(String args[]) {

            meth(42);
            meth(20);}
        static {

            System.out.println("Static block initialized2.");

            b = a * 4; }
}
