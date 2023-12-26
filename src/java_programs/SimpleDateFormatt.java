package java_programs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
public class SimpleDateFormatt {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);
        System.out.println(strDate);

        //localDateTimeApi
        System.out.println(LocalDateTime.now().plusDays(1));
        System.out.println(LocalDate.now().getDayOfYear());
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDateTime.now().getDayOfMonth());
        System.out.println(LocalDateTime.now().getMonth());
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().getHour());
        System.out.println(LocalDateTime.now().getMinute());
        System.out.println(LocalDateTime.now().minusWeeks(6));
        System.out.println(LocalDateTime.now().plusMonths(3));
        System.out.println(LocalDateTime.now().plusYears(3));
    }
}
