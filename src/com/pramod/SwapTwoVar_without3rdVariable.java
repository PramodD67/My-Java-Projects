package com.pramod;

public class SwapTwoVar_without3rdVariable {
    public static void main(String[] args){

        //Swaping Two Numbers without 3rd Variable.
        int num1=5;
        int num2=10;

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("num1="+num1+ "  "+"num2="+num2);


        String s1="ABC";
        String s2="XYZ";

        s1=s1+s2;
        s2= s1.substring(0,s2.length());
        s1=s1.substring(s2.length());

        System.out.println("s1="+s1+ "  "+"s2="+s2);


    }
}
