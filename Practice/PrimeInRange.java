package com.company;

public class PrimeInRange {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int i) {
        if(i<=1)
            return  false;
        int c=2;
        while(c*c<=i){
            if(i%c==0){
                return false;
            }
            else
                c++;
        }
        return true;
    }
}
