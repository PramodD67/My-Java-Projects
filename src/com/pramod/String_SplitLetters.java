package com.pramod;
public class String_SplitLetters {

    public static void main(String[] args){

        String s = "Pramod";
        String[] arr= s.split("a");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
