package com.pramod;

import java.util.Scanner;

public class BubbleSort {

    public static void BubbSort(int[] arr){


        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

    }

    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
         int[] a =new int[n];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();

        }

        for(int i=0;i<n;i++){
            System.out.println("BS "+a[i]);

        }
        BubbSort(a);
        for(int i=0;i<n;i++){
            System.out.println("AS "+a[i]);

        }
    }
}
