package com.pramod;


abstract class ABS {

    abstract void Mymethod(int a, int b);
}

class  Addition extends ABS {

    @Override
    void Mymethod(int a, int b) {
        System.out.println(a+b);
    }

}

class Subtraction extends ABS{


    @Override
    void Mymethod(int a, int b) {
        System.out.println(a-b);
    }
}

class Abstraction{
    public static void main(String[] args){
        ABS obj1 = new Addition();
        obj1.Mymethod(10,20);
        ABS obj2 = new Subtraction();
        obj2.Mymethod(10,5);
    }
}