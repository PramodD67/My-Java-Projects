package com.pramod;

import java.util.LinkedList;

public class LinkedList_DeleteNode {
    public static void main(String[] args){

        LinkedList<Integer> ls = new LinkedList<Integer>();

       ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);

       System.out.println(ls.remove(3));
    }
}
