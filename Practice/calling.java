package com.company.company;
class stud{

        String sname;
        int age;
        String course;


        void setvalue(String name,int age, String course){
         sname=name;
           this.age=age;
            this.course=course;
        }
        void readvalue(){

            System.out.println(sname + " " + age + " " + course);
        }
    }


public class calling {
    public static void main(String[] args) {
        stud st1 = new stud();
        stud st2 = new stud();
        st1.setvalue("aayus",22,"mca");
        st1.readvalue();
st2.setvalue("bisht",22,"mca");
st2.readvalue();
    }
}
