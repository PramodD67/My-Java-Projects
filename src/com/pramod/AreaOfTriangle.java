package com.pramod;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args){

    int base;
    int height;
    int area;

    Scanner basein = new Scanner(System.in);
    Scanner heightin = new Scanner(System.in);

        System.out.println("AREA OF TRIANGLE\n");

        System.out.println("Enter the Base of the triangle\n");
    base = basein.nextInt();

        System.out.println("Enter the Height of the triangle\n");
    height = heightin.nextInt();

    area= (int) (0.5*base*height);

        System.out.println("The area of triangle is : " + area);
}
}
