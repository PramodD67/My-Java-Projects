package com.pramod;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringMethods {
    public static String myname= "Pramod";

    final String var = "An Apple"; //Igonre this variable, bcz it is created to access in another class.



    public static void main(String[] args){

        System.out.println(myname.toLowerCase());
        System.out.println(myname.toLowerCase());
        System.out.println(myname.concat(" D"));
        System.out.println(myname.contains("Pra"));
        System.out.println(myname.equals("Pramod"));
        System.out.println(myname.compareTo("Pra"));
        System.out.println(myname.contentEquals("Pram"));
        System.out.println(myname.startsWith("p"));
        System.out.println(myname.endsWith("d"));
        System.out.println(myname.getBytes());
        System.out.println(myname.indexOf("m"));
        System.out.println(myname.isEmpty());
        System.out.println(myname.replace("P","G"));
        System.out.println(myname.replaceAll("Pra","Ram"));
        System.out.println(myname.split("Pra"));
        System.out.println(myname.substring(0,2));
        System.out.println(myname.trim());
        System.out.println(myname.valueOf("d"));
    }
}
