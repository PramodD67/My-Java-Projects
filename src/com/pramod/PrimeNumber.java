package com.pramod;

public class PrimeNumber {
    public static void main(String[] args){
        int n=10;

        for(int i=2;i<=0;i++){
            if(n%2==0){
                System.out.println("Prime ");
            } else{
                System.out.println("Not Prime ");
            }
        }


        int[] arr = {1,2,3,4,5,6,7};

        for(int j=2;j<arr.length;j++){
            if(arr[j]%2==0){
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
            }
        }






    }
}
