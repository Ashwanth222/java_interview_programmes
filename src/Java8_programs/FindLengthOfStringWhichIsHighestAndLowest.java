package Java8_programs;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
  //15) Given a list of strings, find the length of the string which is highest?
public class FindLengthOfStringWhichIsHighestAndLowest {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        Integer highestLength = listOfStrings.stream().map(i -> i.split("").length).sorted(Comparator.reverseOrder()).findFirst().get();

        System.out.println(highestLength);

        Integer lowestLength = listOfStrings.stream().map(i -> i.split("").length).sorted(Comparator.naturalOrder()).findFirst().get();
        System.out.println(lowestLength);

    }
}
