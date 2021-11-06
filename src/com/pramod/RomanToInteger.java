package com.pramod;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args){
       HashMap<String,Integer> hm= new HashMap<String,Integer>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);

        String Q="LVIII";
        int result=0;
        for(int i=0;i<Q.length();i++){
           // System.out.print(hm.get(String.valueOf(Q.charAt(i))));
            result=hm.get(String.valueOf(Q.charAt(i)))+result;

        }

        System.out.println(result);
    }

}
