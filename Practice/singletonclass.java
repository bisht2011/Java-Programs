package com.company;

public class singletonclass {
private singletonclass(){

}
private static singletonclass a;

public static singletonclass geta(){
    if(a==null){
        a = new singletonclass();
    }
    return a;
}

}
class maintest{
    public static void main(String[] args) {
singletonclass obj1 = singletonclass.geta();

    }
}
