package com.pramod;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args){
        //  int n = 515;
          String m = "Gadag";             //String.valueOf(n);
          m=m.toLowerCase();
          String temp = "";

          for(int i=m.length()-1;i>=0;i--){
             temp = temp+ String.valueOf(m.charAt(i));
          }
          if(temp.equals(m)){
              System.out.println("Palindrome");
          }
          else{
              System.out.println("Not Palindrome");
          }
    }
}
