package com.pramod;

import java.util.Scanner;

public class Fizzb {
    public static void main(String[] args){
        String[] arr = new String[20];

        Scanner s = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=s.next();
        }

        for(int i=0;i< arr.length;i++){
            if(Integer.parseInt(arr[i])%3==0){
                arr[i]="Fizz";
            }
            else if(Integer.parseInt(arr[i])%5==0){
                arr[i]="Buzz";
            }
            else if(Integer.parseInt(arr[i])%5==0 && Integer.parseInt(arr[i])%3==0){
                arr[i]="FizzBuzz";
            }


        }

        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j] +" ");
        }

    }

}
