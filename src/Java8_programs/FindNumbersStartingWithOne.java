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

        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,32);
        myList1.stream().filter(i-> '1' == i.toString().charAt(0))
                .forEach(System.out::println);  //method3

        List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,32);
        myList2.stream().filter(i-> "1".equals(String.valueOf(i.toString().charAt(0))))
                .forEach(System.out::println);  //method3

    }
}
