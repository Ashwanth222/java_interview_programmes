package Java8_programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeTitle {
    public static void main(String[] args){
        String title = "this is the title";
        String C1 = Arrays.stream(title.split("\\s+")).map(st -> st.substring(0,1).toUpperCase()+st.substring(1)).collect(Collectors.joining(" "));

        System.out.println(C1);

    }
}
