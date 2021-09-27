package com.pramod;

public class OddEvenArray {

    public static void main(String[] args){
        int[] a = {10 ,98, 3, 33 ,12 ,22 ,21, 11};
int temp=0;
        int[] x = new int[8];
        int[] y = new int[8];
        int[] z = new int[8];
       
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] % 2 == 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;

                    //System.out.println(x[j]);

                } else {
                    y[i] = a[i];
                    // System.out.println(y[i]);
                }
            }
        }
        for(int j=0;j< x.length;j++){
           System.out.println(a[j]);
            //System.out.println(z[j]);
        }


    }
}
