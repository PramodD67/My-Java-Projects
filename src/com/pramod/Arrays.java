package com.pramod;

public class Arrays {

    public static void main(String[] args){
        String[] cars = {"BMW", "VOLVO", "TATA" };
        int[] mynum = {10,20,30,40,50};

        //Accessing elements of an array
        System.out.println(cars[2]);
        System.out.println(mynum[0]);

        //changing the array element
        cars[1]="TOYOTA";
        System.out.println(cars[1]);

        //Get the length of an array
        System.out.println(cars.length);
        System.out.println(mynum.length);


        //Printing All elements in an array

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }


        //when you know what values to be inserted in an array use array declaration as above.
        //But when u dont knw what values to be inserted in an array then use new keyword in declaration as shown below:

        int[] arrayname = new int[5];

        // Inserting values in an array

        arrayname[0] = 10;
        arrayname[1] = 20;
        arrayname[3] = 30;

        System.out.println(arrayname[1]); //20


         //Multi Dimensional Arrays

        int[][] numbers = {{1,2,3},{4,5,6}};

        //access element in multidimensional array

        System.out.println(numbers[1][2]);

        for(int i=0; i<numbers.length; i++){
            for(int k=0; k<numbers[i].length; k++){
                System.out.println(numbers[i][k]);
            }

        }

    }
}
