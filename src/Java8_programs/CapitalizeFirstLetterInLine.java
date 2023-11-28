package Java8_programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetterInLine {
    public static void main(String[] args){
        String title = "this is the first line.";

        String C1 =   title.lines().map(st -> st.substring(0,1)
                .toUpperCase()+st.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println(C1);
    }
}
