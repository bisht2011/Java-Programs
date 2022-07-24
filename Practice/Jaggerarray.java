package com.company.company;
import java.util.*;
public class Jaggerarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the rows of array");
        int num = scan.nextInt();
        int[][] arr = new int[num][];
        int k = 1;
        for (int row = 0; row < arr.length; row++) {
            arr[row] = new int[row + k++];//assign the value of column=row+1 columns
        }

        for (int row = 0; row < arr.length; row++) {
            int count = 1;
            for (int j = 0; j < arr[row].length; j++)//elements of the array
                arr[row][j] = count++;
        }

        for (int[] row : arr) {
            System.out.print(Arrays.toString(row));
            System.out.println();
        }
//            System.out.println();
//
//        int even[][]= {{1,9,4},{0,2},{0,1,2,3,4}};
//        for(int row=0;row<even.length;row++) {
//            System.out.print("row"+ row + ":");
//            for(int col=0;col<even[row].length;col++)
//                System.out.print(even[row][col] +" ");
//            System.out.println();
//        }
//        }

    }
}