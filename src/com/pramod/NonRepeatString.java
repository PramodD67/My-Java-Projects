package com.pramod;
import java.util.*;
public class NonRepeatString {

    public static void main(String[] args){
        String s= "ABBABAABC";

        char[] arr = new char[s.length()];

        for(int i=0;i< arr.length;i++){
         arr[i]=   s.charAt(i);
        }

        HashSet<String> h = new HashSet<>();








        for(int j=0;j< arr.length;j++){
            h.add(String.valueOf(arr[j]));
        }
        System.out.println(h);
        System.out.println(h.size());

    }
}
