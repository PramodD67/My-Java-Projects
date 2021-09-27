package com.pramod;

//Method Overloading means multiple methods can have same name with diff parameters.

public class MethodOverloading {

    // WITHOUT OverLoading

    static int plusmethodINT(int x, int y){
        return x+y;

    }


    static double plusmethodDOUBLE(double x, double y){
        return x +y;
    }

    //WITH Overloading

    static int plusmethod(int x, int y){
        return x+y;
    }

    static double plusmethod(double x, double y){
        return x+y;
    }


    public static void main(String[] args){

        //Without Overloading
        double mydouble = plusmethodDOUBLE(5,10);
       int myint = plusmethodINT(10,25);
        System.out.println("WITHOUT Overloading: INT = "+myint);
        System.out.println("WITHOUT Overloading: DOUBLE  = " + mydouble );

        //With Overloading
        int num1 = plusmethod(10, 20);
        double num2 = plusmethod(20.5,30.4);

        System.out.println("WITH Overloading: INT = "+num1);
        System.out.println("WITH Overloading: DOUBLE = "+num2);

    }


}
