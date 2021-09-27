package com.pramod;

public class Methods {
    //creating a method
    static void nameprinting_method() {
        System.out.println("I'm Pramod");
    }

    //passing a parameter into method
    static void  parameter_method(String name, int age){

        System.out.println("Hi "+name + " Your age is "+age);
    }

    //Return Values
    static int addition(int x , int y){
        return  x + y;

    }

    //Method with If...Else

   public static int ife_method(int age){

        if(age<18){
            System.out.println("Access Denied");

        }
        else if(age>=18){
            System.out.println("Acess Granted");
        }


       return age;
   }

    public static void main(String[] args){
        nameprinting_method(); //calling a method
        nameprinting_method(); //u can call methods multiple times

        parameter_method("Pramod",21); //calling parameter method

        System.out.println(addition(10, 5));
        System.out.println(ife_method(20));



    }
}
