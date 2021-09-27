package com.pramod;

import java.util.Scanner;
import java.util.Collections;
public class WiproPrep {
    public static void main(String[] args){
/*
        System.out.println("Enter no of apples");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.print("Enter no of apples in shop A"+"  ");
        Scanner sa = new Scanner(System.in);
        int n1 = sa.nextInt();

        System.out.print("Enter cost in shop A"+"  ");
        Scanner sb = new Scanner(System.in);
        int c1 = sb.nextInt();

        System.out.println("Enter no of apples in shop B"+"  ");
        Scanner sa2 = new Scanner(System.in);
        int n2 = sa2.nextInt();

        System.out.print("Enter cost in shop B"+"  ");
        Scanner sb2 = new Scanner(System.in);
        int c2 = sb2.nextInt();

        int cal1 = (c1/n1) * num;
        int cal2 = (c2/n2) * num;

        if(cal1<cal2){
            System.out.println("cal1 "+cal1);
        }
        else if(cal2<cal1){
            System.out.println("cal2 "+cal2);
        }
        System.out.println("calforce1 "+cal1);
        System.out.println("calforce2 "+cal2);
*/

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Scanner e = new Scanner(System.in);

        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]=e.nextInt();

        }

       for(int k=0;k<arr.length;k++){
           for(int j=k;j<arr.length;j++){

               arr[k]= k;
               k=arr[j];
               arr[j]=k;

               System.out.println(arr[k]);
           }
       }


        }

    }

