package Java8_programs;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class SortTheList {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().sorted().forEach(System.out::println);  //method 1

        integerList.stream().sorted((s1, s2) -> s2-s1).forEach(System.out::println);  //method 2 descending
        integerList.stream().sorted((s1, s2) -> s2-s1).forEach(System.out::println);  //method 2 ascending

        integerList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println); //method 3 descending
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //method 3 ascending

    }
}
