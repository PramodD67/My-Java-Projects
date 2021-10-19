package com.pramod;
import java.util.Scanner;
public class Userinput {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String name = inp.next();

        System.out.println("Your Name is : "+name);

    }
}
