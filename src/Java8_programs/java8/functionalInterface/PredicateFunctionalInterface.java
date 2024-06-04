package Java8_programs.java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void main(String[] args){
        int[] arr = {5, 7, 9, 2};
        Predicate<Integer> integerPredicate = (k) -> (k >6);

        System.out.println(integerPredicate.test(7));
        System.out.println(integerPredicate.test(5));
    }
}
