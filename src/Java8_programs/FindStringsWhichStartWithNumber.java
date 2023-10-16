package Java8_programs;
//Given a list of strings, find out those strings which start with a number?

import java.util.Arrays;
import java.util.List;
public class FindStringsWhichStartWithNumber {
    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
