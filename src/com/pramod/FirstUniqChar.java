package com.pramod;

public class FirstUniqChar {

    public static void main(String[] args){

        String s = "leetcode";  //Prrapmodd";
int k=0;
        for (int i=0;i<s.length();i++){
            for(int j=i+k;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println(s.charAt(j));
                    k++;
                }

            }

        }
    }
}
