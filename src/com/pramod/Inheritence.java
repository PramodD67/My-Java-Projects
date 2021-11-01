package com.pramod;

public class Inheritence {
    public static void SayHello(String name) {
        System.out.println("Hello "+ name);
    }
    public static int Age(Integer age){
        System.out.println("Your Age is "+age);
        return age;
    }
}

class ChildClass extends Inheritence{

    public static void main(String[] args){
        ChildClass obj = new ChildClass();
        obj.SayHello("Pramod");
        obj.Age(21);

    }

}
