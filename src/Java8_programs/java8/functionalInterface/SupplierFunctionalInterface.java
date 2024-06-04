package Java8_programs.java8.functionalInterface;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    public static void main(String[] args){
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());
    }
}
