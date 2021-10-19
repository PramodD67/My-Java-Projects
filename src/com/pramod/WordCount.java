package com.pramod;

public class WordCount {


    public static void main (String[] args) {
        String str1 = "Hi Im    pramod d";

        String[] wordCount = str1.trim().split("\\s+");
        int count = wordCount.length;

        System.out.println("Word count is = " + count);

        for(int i=0;i<wordCount.length;i++){
           System.out.println(wordCount[i]);
        }
    }

}
