package com.pramod;

public class BinaryToDecimalToBinary {
    public static void main(String[] args){
        //BINARY to DECIMAL
        String b = "1101";
        System.out.println(Integer.parseInt(b,2));

        //DECIMAL to BINARY
        int num= 13;
        System.out.println(Integer.toBinaryString(num));
    }
}
