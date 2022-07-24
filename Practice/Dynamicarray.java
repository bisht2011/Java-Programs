package com.company.company;

import java.util.Arrays;

public class Dynamicarray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2},
                {4,5,6,7},
                {8,9},
        };
        for(int row=0;row<arr.length;row++){
                System.out.println(Arrays.toString(arr[row]));
            }
        }
    }

