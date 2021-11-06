package com.pramod;

import java.util.Scanner;
import java.util.Arrays;

class Solution {

public static void main(String[] args) {
    int[] nums= {1,2,1,34,5,2,2,31,1,2,3,4,3,32,23,4};

   Arrays.sort(nums);


    for(int m=0;m<nums.length;m++){
        System.out.println(nums[m]);
    }
    int k=0;
    for(int j=0;j<nums.length-1;j++){
        if(nums[j]!=nums[j+1]){
           nums[k++]=nums[j];

        }
    }
    nums[k++]=nums[nums.length-1];
for (int i=0;i<nums.length;i++){
    System.out.println(nums[i]);
}


}

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


