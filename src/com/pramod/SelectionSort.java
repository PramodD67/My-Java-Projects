package com.pramod;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int smallno,index;
      for(int i=0;i<arr.length;i++){
          index=i;
          for(int j=i+1;j< arr.length;j++){
              if(arr[i]>arr[j]){
                  index=j; //searching lowest index.
              }
          }
          smallno=arr[index];
          arr[index]=arr[i];
          arr[i]=smallno;
      }


    }
    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}

