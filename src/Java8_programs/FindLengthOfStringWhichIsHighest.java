package Java8_programs;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
  //15) Given a list of strings, find the length of the string which is highest?
public class FindLengthOfStringWhichIsHighest {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        Integer listOfStrings1 = listOfStrings.stream().map(i -> i.split("").length).sorted(Comparator.reverseOrder()).findFirst().get();

        System.out.println(listOfStrings1);
    }
}
