package com.pramod;

public class ReverseString {

    public static void main(String[] args){

       String st="Pramod";

        StringBuilder sb=new StringBuilder(st);
        // OR
        // StringBuffer sb=new StringBuffer(st);
        sb.reverse();
        System.out.println(sb);

        // OR USE THIS METHOD INSTEAD
        /*
        for(int i=st.length()-1;i>=0;i--){

            System.out.print( st.charAt(i));
        } */


    }

}
