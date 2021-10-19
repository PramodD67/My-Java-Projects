package com.pramod;
import java.util.Arrays;
public class DuplicateElementInArray {

    public static void main(String[] args){
        int[] a = {1,2,4,1,2,4,45,5};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j< a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[j]);
                }
            }
        }

        }



    }

