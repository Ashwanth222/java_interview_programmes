package Java8_programs.java8.parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class parallelStream {
    public static void main(String[] args){

        long start11 = System.currentTimeMillis();
        long sum11 =IntStream.range(1, 101).parallel().asLongStream().reduce(0, (a, b) -> a+b);
        System.out.println(sum11);

        long end11 = System.currentTimeMillis();
        System.out.println(end11- start11);

       long start = System.currentTimeMillis();
        long sum =IntStream.range(1, 101).asLongStream().reduce(0, (a, b) -> a+b);
        System.out.println(sum);

        long end = System.currentTimeMillis();
        System.out.println(end- start);

        long start1 = System.currentTimeMillis();
        long sum1 =IntStream.range(1, 101).asLongStream().reduce(0, (a, b) -> a+b);
        System.out.println(sum1);

        long end1 = System.currentTimeMillis();
        System.out.println(end1- start1);

        long start12=0;
        long end12=0;

        start12=System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end12=System.currentTimeMillis();
        System.out.println("Plain stream took time : "+(end12-start12));

        System.out.println("============================================");

        start12=System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        end12=System.currentTimeMillis();
        System.out.println("Parallel stream took time : "+(end12-start12));



        IntStream.range(1,10).forEach(x->{
            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
        });

        IntStream.range(1,10).parallel().forEach(x->{
            System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
        });

        List<Java8_programs.java8.mapReduce.Employee> employees =  Stream.of(new Java8_programs.java8.mapReduce.Employee(101,"john","A",60000),
                        new Java8_programs.java8.mapReduce.Employee(109,"peter","B",30000),
                        new Java8_programs.java8.mapReduce.Employee(102,"mak","A",80000),
                        new Java8_programs.java8.mapReduce.Employee(103,"kim","A",90000),
                        new Java8_programs.java8.mapReduce.Employee(104,"json","C",15000))
                .collect(Collectors.toList());

        //normal
        start=System.currentTimeMillis();
        double salaryWithStream = employees.stream().map(e -> e.getSalary()).mapToInt(i -> i.intValue())
                .average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("Normal stream execution time : "+(end-start)+" : Avg salary : "+salaryWithStream);

        start=System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(r -> r.getSalary()).mapToInt(i -> i.intValue()).average().getAsDouble();

        end=System.currentTimeMillis();

        System.out.println("Parallel stream execution time : "+(end-start)+" : Avg salary : "+salaryWithParallelStream);


    }
}
