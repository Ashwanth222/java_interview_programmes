package Java8_programs;

import java.util.*;

public class FindNumbersStartingWithOne {
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().filter(i-> i.toString().startsWith("1")).forEach(System.out::println);  //method1

        myList.stream()
                .map(s -> s + "") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);                              //method2
    }
}
