package Java8_programs.java8.optional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class optional {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }

    public static  void main(String[] args) throws Exception {
        List<Customer> customers = getAll();
        Optional<Customer> customer = Optional.ofNullable(customers.stream().filter(i -> i.getEmail().equals("kely@gmail.com"))
                .findAny().orElseThrow(() -> new Exception("no customer present with this email id")));

        System.out.println(customer.get().getEmail());

        //------------------

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailOptional = Optional.of(customer.get().getEmail());
        System.out.println(emailOptional);

        Optional<String> emailOptional2 = Optional.ofNullable(customer.get().getEmail());
        if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }
        System.out.println(emailOptional2.orElse("default@email.com"));

        System.out.println(emailOptional2.orElseThrow(()->
                new IllegalArgumentException("email not present")));

        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email..."));

    }
}
