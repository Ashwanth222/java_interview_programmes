package Java8_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CapitalizeFirstLetterInLine {
    public static void main(String[] args){
        String title = "this is the first line \n this is the second line \n" +
                " this is the third line \n this is the fourth line";
        String s = title.lines().findFirst().get();
        System.out.println(s);
        String C1 =   title.lines().map(st -> st.substring(0,1)
                .toUpperCase()+st.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println(C1);

        String str
                = " Geeks \n For \n Geeks \r Technical \r\n content \r writer \n Internship";

        // Generating stream of lines from string
        // using lines() method
        Stream<String> lines = str.lines();

        // Creating an ArrayList object of String type
        ArrayList<String> arrayList = new ArrayList<>();

        // Now, adding elements to arrayList using forEach
        lines.forEach(arrayList::add);

        // Print and display the ArrayList
        System.out.println(arrayList);
    }
}
