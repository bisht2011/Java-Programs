package com.company;
class Pass {
    int a,b;
    Pass(int a,int b){
        this.a=a;
        this.b=b;
    }
    boolean equal(Pass k){
        return k.a == a && k.b == b;
    }
}
class Test{
    public static void main(String[] args) {
        Pass obj1 = new Pass(10,20);
        Pass obj2 = new Pass(10,20);
        Pass obj3 = new Pass(20,10);
        System.out.println(obj2.equal(obj3));
        System.out.println(obj1.equal(obj3));
    }
}
