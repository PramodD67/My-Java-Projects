package com.pramod;

public class FibonaaciSeries {
    public static void main(String[] args){
        int[] a={0,1,1,2,3,5,8,13,21};

        for (int i=0;i<a.length-2;i++){
              if(a[i]+a[i+1]==a[i+2]){
                  System.out.println("The number is fibonaaci");
                  break;
              }
              else {
                  System.out.println("The number is not fibonaaci");
                  break;
              }

        }

    }
}
