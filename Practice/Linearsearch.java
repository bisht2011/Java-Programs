package com.company;

import java.util.Arrays;

public class Linearsearch {
        static int[] arr = {12, 34, 23, 67, 121, 89};
        static String name = "aayush";
    public static void main(String[] args) {

        char c = 'u';
        int target = 67;
        System.out.println(linear(target));
        System.out.println(name(c));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(minimum());
        String reversedStr = "";

        //Iterate through the string from last and add each character to variable reversedStr
        for(int i = name.length()-1; i >= 0; i--){
            reversedStr = reversedStr + name.charAt(i);
        }
        System.out.println("Reverse of given string: " + reversedStr);

    }

    static int minimum() {
        int min=arr[0];
        for(int i:arr){
            if(i<min)
                min=i;
        }
        return min;
    }

    static int linear(int a) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == a)
                return index;
        }
return 0;
    }

    static boolean name(char c) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == c)
                return true;
        }
        return false;

    }
}