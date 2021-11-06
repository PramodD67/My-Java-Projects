package com.pramod;
import java.util.*;
public class FizzBuzz {
    /*
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i if non of the above conditions are true.
     */
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<String>();
        for(int j=0;j<=n;j++){
            al.add(String.valueOf(j+1)); //to start numbers from 1 instead of 0 so we used j+1 here.
        }

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){

                al.set(i-1,"FizzBuzz");
            }
            else if(i%3==0){
                al.set(i-1,"Fizz");
            }
            else if(i%5==0){
                al.set(i-1,"Buzz");
            }

        }

        System.out.println(al);
        return al;
    }
    public static void main(String[] args){

     fizzBuzz(15);

    }
}
