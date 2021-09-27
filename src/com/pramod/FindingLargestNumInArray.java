package com.pramod;

import java.util.Scanner;
import java.util.Arrays;


public class FindingLargestNumInArray {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Elements :");
        for (int i = 0;i<size;i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements are:");
        for (int i = 0;i<size;i++){

            System.out.print(arr[i]+" ,");
        }

        int temp;
        for(int i=0;i<size;i++){
            for(int k=i;k<size;k++){

                if(arr[i]>arr[k]){
                  temp =arr[i];
                  arr[i]=arr[k];
                  arr[k]=temp;

                }
            }
        }
        System.out.println("\nLargest Element is: "+ arr[size-1]);
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);

        }

        System.out.println("Array elements : "+Arrays.toString(arr));




    }


}

