package com.company;
import java.util.*;
public class newo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {10 ,22 ,44 , 36, 27,17};
        String i="yes";
while(i.equals("yes")){
        System.out.println("search for the number you want");
        int target=scan.nextInt();
        System.out.println(searchh(arr,target));
        System.out.println("wanna continue yes or no");
        i=scan.next();
}

    }

     static int searchh(int[] arr, int target) {
        for(int i =0;i<arr.length;i++){
            if(target==arr[i])
                return i;
        }
        return -1;
    }
}
