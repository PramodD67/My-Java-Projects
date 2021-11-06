package com.pramod;

public class NumberOf_OneBits_count {
    public static int hammingWeight(int n) {
        String num=  Integer.toBinaryString(n);
        int res=0;
        for(int i=0;i<num.length();i++){
            if(String.valueOf(num.charAt(i)).equals("1")){
                res++;
            }

        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args){
        hammingWeight(00000000000000000000000000001011);
    }
}
