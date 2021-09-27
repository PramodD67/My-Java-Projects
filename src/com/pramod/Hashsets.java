package com.pramod;

import java.util.HashSet;

public class Hashsets {

    public static void main(String[] args){

        //Every item in a HasSet is UNIQUE. Duplicating the items results in replacing the same.
        HashSet<String> s = new HashSet<>();

        s.add("Apple");
        s.add("Apple"); //Only one item is added bcz Hashset is unique.
        s.add("Samsung");
        s.add("Mi");
        s.add("Vivo");

        System.out.println(s);

        for(String i:s){
            System.out.println(i);
        }
        System.out.println("Size of Set is : "+ s.size());

        System.out.println(s.contains("Apple"));

        s.remove("Vivo");
        System.out.println(s);


    }
}
