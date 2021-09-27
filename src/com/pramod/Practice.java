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
public class Practice {
    public static void main(String args[]){
    /*int[] ar = {3,45,1,7,4,6,4,5};
     int temp=0;
         for(int i=0;i<ar.length;i++) {
             for (int j = 0; j < ar.length - 1; j++) {
                 if (ar[j] > ar[j + 1]) {

                     temp = ar[j];
                     ar[j] = ar[j + 1];
                     ar[j + 1] = temp;

                 }
             }

         }
         for(int i=0;i<ar.length;i++){
    System.out.println(ar[i]);
} */
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        Scanner a = new Scanner(System.in);
        int[] arr= new int[siz];
        int[] ne= new int[siz];
        int i=0;
        for(i=0;i<siz;i++){
            arr[i]=a.nextInt();
        }

        for(int j=0; j<siz-2;j++){
            arr[j+2]=arr[j]+arr[j+1];
            ne[j]=arr[j+2];
        }
        int total= ne[0]+ne[1]+ne[2]+ne[3]+ne[4];
        System.out.println(total);

}
}