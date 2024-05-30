package Java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenAndOddInGivenList {
    public static void main(String[] args){
        List<Integer> integers = Arrays.asList(8,9,5,7,3,4,6,2);
        integers.stream().filter(i->i%2==0).forEach(System.out::println);// method 1 even
        integers.stream().filter(i->i%2!=0).forEach(System.out::println);// method 1 odd!

        integers.stream().collect(Collectors.groupingBy(i->i%2 ==0))  //method 2 even
                .entrySet().stream().filter(e->e.getKey()==true).forEach(System.out::println);

        integers.stream().collect(Collectors.groupingBy(i->i%2 ==0))  //method 2 odd
                .entrySet().stream().filter(e->e.getKey()==false).forEach(System.out::println);

        integers.stream().collect(Collectors.partitioningBy(i->i%2 ==0))  //method 2 even
                .entrySet().stream().filter(e->e.getKey()==true).forEach(System.out::println);

        integers.stream().collect(Collectors.partitioningBy(i->i%2 ==0))  //method 2 odd
                .entrySet().stream().filter(e->e.getKey()==false).forEach(System.out::println);
    }
}
