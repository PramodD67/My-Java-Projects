package com.pramod;

public class DifferenceOfSumofEvenOddPosition {

    public static void main(String[] args){

        String num= "4567";
        int even = 0;
        int odd=0;

      for (int i=0;i<num.length();i++){
        if(i%2==0){
           even= num.charAt(i)+even;
        }
        else{
           odd=num.charAt(i)+odd;
        }

      }

      int res= odd-even;

      System.out.println(res);
    }
}
