package com.pramod;

import java.util.regex.*;

public class KeywordMatcher {

    static void Mymethod(String keyword){
       String[] arr = {"while","if","else","int","double","char"};

       int flag=0;

        for(int i=0;i<arr.length-1;i++){
            if(Pattern.matches(arr[i],keyword)){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println(keyword + " is a Keyword");
        }else{
            System.out.println(keyword + " is not a Keyword");

        }

    }

    public static void main(String[] args){
        Mymethod("while");


    }
}
