package com.pramod;


abstract class ABS {

    public static int Add(int a, int b){

        return a+b;
    }
}

class  Abstraction extends  ABS {
    public static void main(String[] args){
        System.out.println(Add(10,20));
    }


}