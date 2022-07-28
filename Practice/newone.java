package com.company;


import java.util.*;



// class Outer { int outer_x = 100;
//     void test() {
//         Inner inner = new Inner();
//         inner.display(); }
// class Inner {
//         int y = 10;
//         void display() {
//             System.out.println("display: outer_x = " + outer_x);
//         }
//     }
//     void showy() {
//        // System.out.println(y);
//     }
// }
 class newone {
    //     public static void main(String args[]) {
////         Outer outer = new Outer();
////         outer.test(); } }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter total numbers you want to enter");
        int a = scan.nextInt();
        int sum = sum(a);
        System.out.println(sum);
    }
//
////        int b = scan.nextInt();
////        int c = scan.nextInt();
////        int max=max(a,b,c);
////        System.out.println(max);
//
////        int i = 1;
////        int hcf=0;
////        for (; i <= a || i <= b; i++) {
////            if ((a % i == 0) && (b % i == 0)) {
////                 hcf=i;
////            }
////
////        }
////        System.out.println("hcf: " + hcf);
//    }
////    static int max(int a,int b,int c){
////        int lar=a;
////        if(b>lar){
////            lar=b;
////        }
////        if(c>lar){
////            lar=c;
////        }
////        return lar;
////
    static int sum(int n){
        Scanner scan=new Scanner(System.in);
        int total=0;
        for(int i=0;i<n;i++){
            total=total+scan.nextInt();
        }
        return total;
    }
}
//
//public class newone {
//
//    static int count=0;
//
//    static void p(){
//
//        count++;
//
//        if(count<5){
//
//            System.out.println("hello "+count);
//
//            p();
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        p();
//
//    }
//
//}

