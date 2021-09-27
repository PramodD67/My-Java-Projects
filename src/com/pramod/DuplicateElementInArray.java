package com.pramod;
import java.util.Arrays;
public class DuplicateElementInArray {

    public static void main(String[] args){
        int[] b = {1,2,4,1,2,4,45,5};
        int[] a ={1,2,3,4,5,4};

        int i =0;
            for(int j=1;j<a.length;j++){
                if (a[i] == a[j]) {
                    System.out.println("true");
                    break;
                }
                else if(a[i]!=a[j]) {
                    System.out.println("false");

                }

                        i++;
            }
        }



    }

