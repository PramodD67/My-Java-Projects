package com.pramod;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr ={10,20,30,40,50,60};
        int n=10;
        int high,mid,low;

        high= arr.length-1;
        low=0;


        while(low<=high){
            mid= (low+high)/2;
            if(n==arr[mid]){
                System.out.println( "Element searched for: "+arr[mid]+" "+ ", Position ="+mid);
                break;
            }

            if(n<arr[mid]){
                high=mid-1;

            }
            else if(n>arr[mid]){
                low=mid+1;

            }

        }



    }
}
