package com.pramod;

public class PowerOfaNumber {
    public static void main(String[] args){
        //Without using Math.pow() method.
        int base=3;
        int exponent=4;
int result=1;

        while (exponent!=0){
            result=result*base;
            exponent--;
        }
        System.out.println(result);

        //OR
        System.out.println(Math.pow(3,4));
    }
}
