package com.company.company;
import java.util.*;

public class arraylistexample {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     ArrayList<Integer> list = new ArrayList<>();
     list.add(6);
        System.out.println(list);
        for(int i=0;i<5;i++){
            list.add(scan.nextInt());
        }
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(2);
        System.out.println(list);
    }

}
