package com.company;

public class GCD_LCm {
    public static void main(String[] args) {
        int a=10,b=45;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));

    }

    private static int gcd(int a, int b) {
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    private static int lcm(int a, int b) {

        return a * b /gcd(a,b);
    }



}
