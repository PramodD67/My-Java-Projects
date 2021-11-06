package com.pramod;

public class HexaToDecimalToHexa {
    public static void main(String[] args){

        //Decimal To HexaDecimal
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toHexString(15));

        //HexaDecimal to Decimal
        String s="A";
        System.out.println(Integer.parseInt(s,16));
        String t="B";
        System.out.println(Integer.parseInt(t,16));
    }
}
