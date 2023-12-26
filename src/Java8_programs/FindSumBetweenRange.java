package Java8_programs;

import java.util.*;
import java.util.stream.IntStream;

public class FindSumBetweenRange {
    public static void main(String[] args){
       int sum =  IntStream.range(2,100).sum();   //method1
       System.out.println(sum);

       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum1 = list.stream()  //method2
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum1);
List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        int sum2 = list1.stream()      //method3
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum2);
    }
}
