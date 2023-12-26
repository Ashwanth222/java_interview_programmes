package Java8_programs;

import java.util.*;
import java.util.stream.Collectors;
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

        //method 4
       long value = list1.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        System.out.println(value);

        long count = list1.stream().collect(Collectors.summarizingInt(Integer::intValue)).getCount();
        int max = list1.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();
        int min = list1.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMin();
        double average = list1.stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage();

        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
