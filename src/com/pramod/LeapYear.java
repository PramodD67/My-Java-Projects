package com.pramod;

public class LeapYear {
    public static void main(String[] args){

        String year= "1996";

    if( Integer.parseInt(year)%4==0 ) {
        System.out.println(year +" is a Leap year");
    }
    else{
        System.out.println(year + " is not a leap year");
    }

    }
}
