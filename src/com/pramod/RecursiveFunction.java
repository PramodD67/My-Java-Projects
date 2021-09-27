package com.pramod;

public class RecursiveFunction {

    public static int sum(int k){
        if(k > 0) //Halting Condition
        {
            return k + sum(k -1);
        }
        else {
            return 0;
        }
    }

   public static int multiplication_of_itself(int i){


        if(i>-1){ //Halting Condition
         int r = i * multiplication_of_itself(i-1);

         System.out.println("Multiplication of " + i +" * " +i +" is : "+r );
            i++;
        }
    return i;
    }

    public  static  int add_range_of_numbers(int start, int end){
        if(end>start){ //Halting Condition
            return end + add_range_of_numbers(start,end-1);

        }else{
            return end;
        }
    }


    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        multiplication_of_itself(10);
        System.out.println("Sum is" +add_range_of_numbers(5,10));


    }


}
