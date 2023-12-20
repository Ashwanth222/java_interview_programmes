package Java8_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamJava8HighestValue {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(5,7,3,9,1,7,3);
        List<Integer> uniqueIntegers = integerList.parallelStream()
                .distinct().collect(Collectors.toList());
        System.out.println(uniqueIntegers);
    }
}
