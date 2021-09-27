package com.pramod;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class LinkedLists {

    public static void main(String[] args){
        LinkedList<String> Players = new LinkedList<String>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Player Names");

        for (int i=0;i<5;i++){
            Players.add(scan.next());
        }
        System.out.println("List : "+Players);

        Collections.sort(Players);
        System.out.println("Sorted List : "+Players);

        //Adding Manually
        Players.add("Rahul");
        System.out.println("Added one item to List : "+Players);

        Players.remove(3);
        System.out.println("Removed 4th Element from List : "+Players);

        Players.removeFirst();
        Players.removeLast();
        System.out.println("Removed first & last Element from List : "+Players);

       Players.contains("Virat");
    }

}
