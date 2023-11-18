package Java8_programs;

import java.time.LocalDateTime;

public class PrintCurrentDateAndTime {
    public static void main(String[] args){
        LocalDateTime lDT = LocalDateTime.now();
        System.out.println(lDT);

        System.out.println("Current Date: " + java.time.LocalDate.now());
        System.out.println("Current Time: " + java.time.LocalTime.now());
        System.out.println("Current Date and Time: " + java.time.LocalDateTime.now());

    }
}
