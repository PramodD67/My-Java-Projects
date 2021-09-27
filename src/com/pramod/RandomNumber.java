package com.pramod;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args){
        int min= 0;
        int max = 999;

        double random1 = Math.random()*(max-min+1)+min;
        double random2 = (int)(Math.random()*(max-min+1)+min);
        System.out.println(random1);
        System.out.println(random2);

        Random random = new Random();

        // Generates random integers 0 to 49
        int x = random.nextInt(50);
        // Generates random integers 0 to 999
        int y = random.nextInt(100);
        System.out.println(x);
        System.out.println(y);



    }

}
