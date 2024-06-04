package Java8_programs.java8.functionalInterface;

import java.util.function.Function;

public class FunctionFunctionalInterface {
    public static void main(String[] args){
        Function<Integer, String> function = (h) -> h.toString();

        Function<Integer, Double> half = a -> a / 2.0;

        System.out.println(function.apply(8));

        System.out.println(half.apply(8));

    }
}
