package Java8_programs;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenationOfTwoStreams {
    public static void main(String[] args){
        List<Integer> integerList1 = Arrays.asList(1,2,3,4);
        List<Integer> integerList2 = Arrays.asList(5,6,7);
       Stream st1 = integerList1.stream();
        Stream st2 = integerList2.stream();
       List<Integer> list =  Stream.concat(st1,st2).toList();


        List<Integer> integerList3 = Arrays.asList(1,2,3,4);
        List<Integer> integerList4 = Arrays.asList(5,6,7);
        Stream<Integer> concatStream = Stream.concat(integerList3.stream(), integerList4.stream());
        concatStream.forEach(System.out::print);
    }
}
