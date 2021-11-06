package com.pramod;
import java.util.regex.*;
import java.util.Arrays;
public class AnagramString {
    static boolean CheckString(String s1,String s2){
        String[] c1=new String[s1.length()];
        String[] c2=new String[s2.length()];
        for (int i=0;i<s1.length();i++){
            c1[i]= String.valueOf(s1.charAt(i));
            c2[i]=String.valueOf(s2.charAt(i));

        }

        Arrays.sort(c1);
        Arrays.sort(c2);
            System.out.println(String.valueOf(c1));
        System.out.println(c2);

        
        if(String.valueOf(c1).equals(String.valueOf(c2))){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
       System.out.println( CheckString("anagram","nagaram"));
    }
}
