package com.pramod;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] agrs){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] a = {1,2,3,4,5,6};
        int l = a.length;
        int[] t=a;
      int temp=0;
        int[] x = new int[6];
        for(int i=0; i<a.length;i++) {
                 for(int j=a.length-1;j>=a.length-n;j--){
                   temp = a[a.length-n];
                   a[i]=a[j];
                   a[j]=temp;
                   if(n!=-1){
                       n--;
                   }
                    x[i] =a[i];
                  // System.out.println(a[i]);
                 }

            for (int y=0;y< a.length-n;y++){
                t[y+n] = a[y];
                System.out.println(t[y]);
            }
        }


    }
}