package com.pramod;

import java.util.Arrays;
public class PlusOneArray {
   /* Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4]. */

    public static void main(String[] args){
        int[] arr = {1,2,3};

        String[] strarr = new String[arr.length];

        strarr[0]="";
        for (int i=0;i< strarr.length;i++){
            strarr[0]= strarr[0]+String.valueOf(arr[i]);
        }
        String n = String.valueOf(strarr[0]);
        int res= Integer.parseInt(n);
        res++;

        System.out.println(res);

    }
}

