package com.pramod;

import java.util.Scanner;

class Solution {
    public static void reverseString(char[] s) {

        int i=0,j=s.length-1;
        char temp='a';
        while(i<j)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){

}



   /* public static void main(String[] args){
      int[] arr= {1,3,5,2,5,2,3,1,8,9,0,7};
      int[] newarr= new int[arr.length];
      int count=0;
      for(int i=0;i< arr.length;i++) {
          for (int j = i+1; j < arr.length ; j++) {
              if (arr[i] == arr[j]) {
                  System.out.println(arr[j]);
                  newarr[i]=arr[j];
                  count++;

              }

          }
      } System.out.println("Duplicate number count : "+count);
        int l=0;
      for(int k=0;k<arr.length;k++){
          if(arr[k]==newarr[k]){

          }
      }

    }  */

}
