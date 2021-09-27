package com.pramod;
import java .util.Arrays;
public class  RemoveElementFromArray{

    public static void main(String[] args) {
       int[] arr =new int[]{1,2,3,4,5,6,7,8,9};
       int[] newarr = new int[arr.length-1];
       int index=3;

       for(int i=0,k=0;i<arr.length;i++){
           if(index!=i){
               newarr[k]=arr[i];
               k++;
           }
       }
       System.out.println(Arrays.toString(newarr));

    }
}

