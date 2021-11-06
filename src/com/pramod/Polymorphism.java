package com.pramod;



public class Polymorphism {

    public static int Mymethod(int[] arr, int one,int two){
     int sum=   arr[one]+arr[two];
     int diff= arr[one]-arr[two];
        System.out.println(sum);

     return sum;

    }

    public static int Mymethod(int first,int second){
        int d= first*second;
        System.out.println(d);
        return d;

    }

    public static String Mymethod(String name){
        System.out.println("This program is written by " +name);

        return name;
    }

    public static void main(String[] args){
        int[] num={1,2,3,4,5};
        Mymethod(num,2,3);
        Mymethod(3,5);
        Mymethod("Pramod");
    }

}
