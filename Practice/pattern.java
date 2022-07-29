package com.company.company;

public class pattern {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(10);
        pattern3(5);
        pattern4(5);
        pattern5(10);
    }

     static void pattern5(int n) {
        for(int row=0;row<=n;row++){
            int colsinrow=row<n/2?row:n-row;
            for(int space=0;space<=n-colsinrow;space++){
                System.out.print(" ");
            }
            for(int col=colsinrow;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=colsinrow;col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    static void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int row=1;row<=n;row++){
            for(int space=0;space<n-row+1;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
         for(int row=0;row<=n;row++) {
             int colsinrow=row<n/2?row:n-row;
             for(int sp=0;sp<n-colsinrow;sp++) {
                 System.out.print(" ");
             }
             for(int col=0;col<=colsinrow;col++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
         System.out.println();
    }

    static void pattern1(int i) {
        for(int row=1;row<i;row++){
            for(int col=1;col<i-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
