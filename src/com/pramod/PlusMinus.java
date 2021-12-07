package com.pramod;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {


    /*
    arr=[1,1,0,-1,-1]
  There are n=5 elements, two positive, two negative and one zero. Their ratios are ,
    2/5=0.4000,2/5=0.40000 and 1/5=0.2000 . Results are printed as:

result:
0.400000 //Positive
0.400000 //negative
0.200000 //neutral
     */

    public static void main(String[] args){
        ArrayList<Integer> ai = new ArrayList<>();
        plusMinus(ai);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        //-4 3 -9 0 4 1
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        int pos=0;
        int neg=0;
        int neutral=0;
        int count=arr.size();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                pos++;
            }
            if(arr.get(i)<0){
                neg++;
            }
            if(arr.get(i)==0){
                neutral++;
            }
        }
        float posres=(float)pos/count;
        float negres=(float)neg/count;
        float zerores=(float)neutral/count;

        System.out.println(posres);
        System.out.println(negres);
        System.out.println(zerores);
    }}