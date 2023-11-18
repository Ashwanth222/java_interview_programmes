package Java8_programs;

import java.util.Arrays;
import java.util.List;

public class FindStringWhoseLengthIsHighestAndLowestInList {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        String highest = listOfStrings.stream().sorted((s1,s2) -> s2.length() -s1.length()).findFirst().get();
        System.out.println(highest);

        String lowest = listOfStrings.stream().sorted((s1,s2) -> s2.length() -s1.length()).skip(listOfStrings.size()-1).findFirst().get();
        System.out.println(lowest);
    }
}
