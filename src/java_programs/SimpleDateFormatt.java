package java_programs;

import java.util.Date;
import java.text.SimpleDateFormat;
public class SimpleDateFormatt {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);
        System.out.println(strDate);
    }
}
