package com.pramod;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        int num1 ;
        int num2;
        int result;

        Scanner input1 = new Scanner(System.in);
        Scanner Operation = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter the Number 1:\n ");
        num1 = input1.nextInt();
        System.out.println("Enter the Operation:\n 1. ADDITION\n  2. SUBTRACTION\n 3. MULTIPLICATION\n 4. DIVISION\n  ");
        int operator= Operation.nextInt();
        System.out.println("Enter the Number 2:\n ");
        num2 = input2.nextInt();

       try{
        switch(operator){
            case 1: result=num1+num2;
                System.out.println("Result is: " +result);
            break;

            case 2: result=num1-num2;
                System.out.println("Result is: " +result);
            break;

            case 3: result=num1*num2;
                System.out.println("Result is: " +result);
            break;

            case 4: result=num1/num2;
                System.out.println("Result is: " +result);
            break;

        }

    } catch (Exception e){
           System.out.println("Something Went Wrong");
       }

    }

}