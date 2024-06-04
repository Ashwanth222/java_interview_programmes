package Java8_programs.java8.functionalInterface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args){
        Consumer<Integer> integerConsumer = (t) -> System.out.println(t);

        Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);

        consumer.accept(6);
        consumer.accept(9);
        integerConsumer.accept(10);


    }
}
