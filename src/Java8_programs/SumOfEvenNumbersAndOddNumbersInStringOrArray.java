package Java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfEvenNumbersAndOddNumbersInStringOrArray {
    public static void main(String[] args){
        int num1 = 11223456;
        Map<Boolean, List<String>> k = Arrays.stream(String.valueOf(num1).split(""))
                .collect(Collectors.partitioningBy(i -> Integer.parseInt(i)%2 == 0));
        System.out.println(k);
        IntStream evenSum = IntStream.of(k.entrySet().stream().filter(p->p.getKey()==Boolean.TRUE).flatMapToInt(o-> o.getValue().stream().mapToInt(p ->Integer.parseInt(p))).reduce(0,(a, b) -> a+b));
        System.out.println(evenSum.sum());
        IntStream oddSum = IntStream.of(k.entrySet().stream().filter(p->p.getKey()==Boolean.FALSE).flatMapToInt(o-> o.getValue().stream().mapToInt(p ->Integer.parseInt(p))).reduce(0,(a, b) -> a+b));
        System.out.println(oddSum.sum());

        //alternate
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Map<Boolean, Integer> result =
                Arrays
                        .stream(a) 	// IntStream
                        .boxed()	// Stream<Integer>
                        .collect(
                                Collectors.partitioningBy(
                                        // Partition based on Predicate
                                        val -> val.intValue() % 2 == 0,
                                        // add values partitioned by Predicate
                                        Collectors.summingInt(Integer::intValue)));

        System.out.println("result" + result);

    }
}
