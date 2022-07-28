package com.company;

class human {
    int age;
    int salary;
    static int population;

    public human(int age,int salary){
        this.age=age;
        this.salary=salary;
        human.population+=1;

    }
}

class in{
    public static void main(String[] args) {
        human aayush = new human(22,30000);
        human aayush1 = new human(22,30000);

        System.out.println(human.population);


    }
}
