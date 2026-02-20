package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String ar[]) {
//Current Date   
        LocalDate today = LocalDate.now();
        System.out.println("Current Date="+today);

        //Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);

        //Current Date
        LocalDateTime today1 = LocalDateTime.now();
        System.out.println("Current DateTime="+today1);

    }
}
