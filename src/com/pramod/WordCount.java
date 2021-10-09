package com.pramod;

public class WordCount {


    public static void main (String[] args) {
        String str1 = "Today is Holdiay         Day";

        String[] wordArray = str1.trim().split("\\s+");
        int wordCount = wordArray.length;

        System.out.println("Word count is = " + wordCount);
    }
    
}
