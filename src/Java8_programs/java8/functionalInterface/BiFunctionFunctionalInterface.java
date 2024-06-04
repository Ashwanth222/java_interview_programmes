package Java8_programs.java8.functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionFunctionalInterface {
    public static void main(String[] args){
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(6, 5));

        BiFunction<Integer, Integer, Integer> multi = (a, b) -> a * b;

        System.out.println(multi.apply(7, 6));
    }
}
