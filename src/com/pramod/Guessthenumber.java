package com.pramod;
import  java.util.*;
public class Guessthenumber {
    public static int count=0;
    public static void Guess(int rannum, int guessnum){
        Scanner s = new Scanner(System.in);
            if (guessnum > rannum) {
                System.out.println("The number is High\t");
                count++;
                System.out.println("Enter a number");
                guessnum =s.nextInt();
                Guess(rannum,guessnum);
            } else if (guessnum < rannum) {
                System.out.println("The number is low\t");
                count++;
                System.out.println("Enter a number");
                guessnum =s.nextInt();
                Guess(rannum,guessnum);

            } else if (guessnum == rannum) {
                System.out.println("Congrats!! You guessed the number");
                System.out.println("The number of steps taken is :" +count);
            }

    }
    public static void main(String[] args) {
        int num;
        System.out.println("*** Welcome to Number guessing game ***");
        System.out.println("Enter your guess");
        num = (int) (Math.random() * 101);
        Scanner e = new Scanner(System.in);
        int g=e.nextInt();
        Guess(num,g);



    }
}
