package com.pramod;
import java.util.Scanner;

public class DigitalSignal {

    public static void main(String[] args){
        Scanner s =new Scanner(System.in);

        int[] a= new int[5];
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        int count=0;
        for (int k=1;k< a.length-2;k++){
            if(a[k]==a[k+1]){
                   count++;
                }

        }

        System.out.println(count+1);
    }
}
