package com.company;

class Outer {
    int x=3;
    int y=4;
    class Inner{
        int z=5;
        void outervariables(){
            System.out.println("x= "+x);
            System.out.println("y= "+y);
        }
    }
    Inner ino = new Inner();

    void Innervar(){
        System.out.println(ino.z);
    }
}
public class demoo{
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.outervariables();
        Outer ou = new Outer();
        ou.Innervar();

    }
}
