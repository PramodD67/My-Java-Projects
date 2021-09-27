package com.pramod;

public class Typecasting {

    public static void main(String[] args){
        System.out.println("Type casting");
        //widening casting : Converting of smaller type to larger (automatic)
        int a = 3;
        float f = a;
        System.out.println(a);
        System.out.println(f);


        //Narrow casting : larger to smaller data types

        double d = 3.112;
        int i = (int) d;
        System.out.println(d);
        System.out.println(i);
    }
}
