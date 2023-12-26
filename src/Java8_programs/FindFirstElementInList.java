package Java8_programs;

import java.util.*;

public class FindFirstElementInList {
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer integer = myList.get(0);
        System.out.println(integer);  //method 1

        int firstElementIntType = myList.stream().findFirst().get().intValue();
        System.out.println(firstElementIntType);   //method 2

        boolean PresentOrNot = myList.stream().findFirst().isPresent();
        System.out.println(PresentOrNot);

        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);    //method3

    }
}
