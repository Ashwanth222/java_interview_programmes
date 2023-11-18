package Java8_programs;


import java.util.*;
import java.util.stream.Collectors;

//find duplicate elements in a given integers list in java using Stream functions?
public class RemoveDublicateElementsInList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList.stream().distinct().forEach(System.out::println);  //method 1

       Set<Integer> integers = myList.stream().collect(Collectors.toSet());  //method 2
        System.out.println(integers);

    }
}
