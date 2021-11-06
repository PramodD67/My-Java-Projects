package com.pramod;

public class CountPrimes {

    public static int countPrimes(int n) {
        int[] arr=new int[n];
        int[] c=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
          arr[i]=i;
        }
        for(int j=2;j<=arr[j]/2;j++){
            if(arr[j]%n!=0){
                c[k]=j;
                k++;
            }
        }

        int s=arr.length;
        System.out.println(arr.length);
        return s;
    }

    public static void main(String[] args){
        countPrimes(10);

    }
}
