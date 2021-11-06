package com.pramod;

public class FirstUniqChar {

    public static void main(String[] args){

        String s = "leetcode";//Prrapmodd";

        char[] c = new char[s.length()];
        for(int k=0;k<s.length()-1;k++){
            c[k]=s.charAt(k);
        }
        int m=0;
        for(int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if(c[m]==(s.charAt(j))){
                   m++;
                   System.out.println(c[m]);

                }
            }
        }

    }
}
