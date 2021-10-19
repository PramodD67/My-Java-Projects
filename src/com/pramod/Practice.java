package com.pramod;

/*public class Practice {


    public static  void main(String args[]) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();
        int[] three = new int[a];
        int[] five = new int[a];



        for(int k = 0; k<a; k++) {
            three[k] = 3 * (k + 1);
            five[k] = 5 * (k + 1);

        }

        for(int i=0;i<a;i++){


            if(Arrays.stream(three).findAny().equals(i)){
                System.out.println("FizzBuzz");
            }

            if(three[i]==3*(i+1) && five[i]!=5*(i+1)){
                System.out.println("Fizz");
            }
            if(three[i]!=3*(i+1) && five[i]==5*(i+1)){
                System.out.println("Buzz");
            }
            if(three[i]!=3*(i+1) || five[i]!=5*(i+1)){
                System.out.println(i);
            }
        }}

    }*/
/*public class Practice{
    static String name;
    public Practice(){
        name="Sara";
    }
    public static void main(String args[])
    {
        System.out.println(name);
    }
}*/

/*public class Practice {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 15) {
            System.out.println(count % 2 == 1 ? "***" : "+++++");
            ++count;
        }
    }
}*/

/*class Practice{
    public static void main(String[] args) {
        Double test = 1.0/0.0;
        System.out.println(test);
    }
}*/

import java.util.Scanner;

/*public class Main {
    {
        System.out.println("Instance Block");
    }
    public void meth()
    {
        System.out.println("Method");
    }
    public void Main()
    {
        System.out.println("Constructor");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] arg) {
        Main ob = new Main();
        ob.Main();
        ob.meth();
    }
} */
/*
class Solution {
    public static int main(String agrs){
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }
    }

} */

import java.util.Scanner;
import java.util.Arrays;
public class Practice {
        public static void main(String[] agrs){


            Scanner s = new Scanner(System.in);
            int[] nums= new int[5];
            for(int i=0;i<nums.length;i++){
                nums[i]=s.nextInt();

            }
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        System.out.println("true");
                    }
                    else{
                        System.out.println("false");
                    }
                }
            }





        }
    }