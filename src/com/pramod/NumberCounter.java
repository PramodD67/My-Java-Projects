package com.pramod;

public class NumberCounter {

    public static void main(String[] args){
        int result = counter(1);
        System.out.println(result);

    }
    //Using Recursive Function
    public static int counter(int i){
        if(i<10)
        {
             System.out.println(counter(i +1));
            return i;
        }
        else {
            return 0;
        }

    }}