package com.pramod;
import java.util.HashMap;
import java.util.Collections;

public class Hashmaps {

    public static void main(String[] args){
        HashMap<String,String> hm = new HashMap<>();

        hm.put("India","Delhi");
        hm.put("England","London");
        hm.put("Australia","Canberra");
        hm.put("USA","Washington");

        for(String i: hm.keySet()){
            System.out.println("Key: "+i+" Value: "+hm.get(i));
        }

        for(String i:hm.values()){
            System.out.println("Only Values: "+i);
        }

        for(String i:hm.keySet()){
            System.out.println("Only Keys: "+i);
        }

        System.out.println("Size of HashMap is : "+hm.size());
        System.out.println("To get one item : "+hm.get("USA"));
        System.out.println("To remove one item :"+hm.remove("England"));
     //   hm.clear();
        System.out.println("After Removing all items "+hm.size());

        HashMap<String,Integer> hm2 = new HashMap<>();

        hm2.put("Dhoni",07);
        hm2.put("Virat",18);
        hm2.put("Sachin",10);

        for(String i:hm2.keySet()){
            System.out.println("Key: "+i+", Value: "+hm2.get(i));
        }
        for(int i:hm2.values()){
            System.out.println("Only Values: "+i);
        }

        HashMap<Integer,Integer> hm3 = new HashMap<>();

        hm3.put(10,10);
        hm3.put(20,20);
        hm3.put(30,30);

        for(int i:hm3.keySet()){
            System.out.println(i);
        }

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsValue("USA"));


    }
}
