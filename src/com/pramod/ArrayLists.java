package com.pramod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
//This Problem is asked in TCS NQT
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the Elements");
        for (int i=0;i<size;i++){
            Scanner sc = new Scanner(System.in);
            arr.add(sc.nextInt());
        }
        System.out.println(arr);

        System.out.println("Largest Element is "+ Collections.max(arr));

        //Sorting the array
        Collections.sort(arr);
        System.out.println("Sorted Array :");

        for (int i:arr){
            System.out.println(i);
        }

        arr.remove(Collections.max(arr));

        for(int i=0;i<arr.size()-1;i++) {
            arr.remove(arr.indexOf(Collections.max(arr)) + 1);
        }
        System.out.println(arr);


        //End of TCS problem

        //To Get the element
        arr.get(0); //getting first element from array
        arr.set(0,3); //setting first element to 3.


        System.out.println(arr);

        arr.contains("5");
    }
}
