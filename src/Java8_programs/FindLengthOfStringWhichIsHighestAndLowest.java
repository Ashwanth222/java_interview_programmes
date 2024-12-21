package Java8_programs;

import java.util.*;

//15) Given a list of strings, find the length of the string which is highest?
public class FindLengthOfStringWhichIsHighestAndLowest {
    public static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        Integer highestLength = listOfStrings.stream().map(i -> i.split("").length).sorted(Comparator.reverseOrder()).findFirst().get();
        int highestLength1 = listOfStrings.stream().map(i -> i.split("").length).mapToInt(e -> (int) e).max().getAsInt();

        int lowestLength1 = listOfStrings.stream().map(i -> i.split("").length).mapToInt(e -> (int) e).min().getAsInt();

        System.out.println(highestLength);
        System.out.println(highestLength1);
        System.out.println(lowestLength1);

        Integer lowestLength = listOfStrings.stream().map(i -> i.split("").length).sorted(Comparator.naturalOrder()).findFirst().get();
        System.out.println(lowestLength);

        String s = listOfStrings.stream().sorted((e1,e2) -> e2.length() - e1.length()).findFirst().get();
        System.out.println(s);
        Integer length = listOfStrings.stream().sorted((e1,e2) -> e2.length() - e1.length()).findFirst().get().length();

        System.out.println(length);

        //alternate
        String lowest1 = listOfStrings.stream().sorted(Comparator.comparing(String::length)).findFirst().get();
        System.out.println(lowest1);

        String highest1 = listOfStrings.stream().sorted(Comparator.comparing(String::length)).skip(listOfStrings.size()-1).findFirst().get();
        System.out.println(highest1);
    }
}
