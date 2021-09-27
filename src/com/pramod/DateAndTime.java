package com.pramod;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;


public class DateAndTime {

    public static void main(String[] args){

        LocalDate ld = LocalDate.now();
        System.out.println(ld);


        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt =  LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyy hh:mm:ss");
        String formatteddate = ldt.format(dtf);
        System.out.println(formatteddate);


    }


}
