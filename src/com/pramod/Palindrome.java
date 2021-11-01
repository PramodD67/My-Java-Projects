package com.pramod;

public class Palindrome {
    public static void main(String[] args){
          int n = 505;
          String m = String.valueOf(n);


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
