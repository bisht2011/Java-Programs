package com.company;
class Box{
    int l;
    int b;
    int w;

    int vol(){

        return l*b*w;
    }
    int vol(int l,int b, int w)
    {
        return l*b*w;
    }
}
public class Main {

    public static void main(String[] args) {
	Box box = new Box();
    box.l=5;
    box.b=5;
    box.w=5;
        System.out.println(box.vol(1,2,3));
        System.out.println(box.vol());
    }
}
