package Java8_programs.IntStream;

import java.util.stream.IntStream;

public class FindPrimeNumbersBetweenRange {
    public static void main(String[] args){
        IntStream.range(2,200)
                .filter(i -> IntStream.rangeClosed(2,(int)Math.sqrt(i)).allMatch(j -> i%j != 0))
                .forEach(System.out::println);
    }
}
