package Java8_programs;

import java.util.*;
import java.util.stream.Collectors;

public class SumAndAverage {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        int summ = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(summ);

        double avrgee = integerList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(avrgee);

        //alternate
        Integer sum = integerList.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);
        int l = integerList.size();
        System.out.println("length " + l);
        double avrg = sum/l;
        System.out.println("avrg " + avrg);

        //alternate
        int s = integerList.stream().mapToInt(e -> e).sum();
        System.out.println(s);

        //alternate
        double avrge = integerList.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(avrge);

        double sum1 = integerList.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        System.out.println(sum1);

        double averag = integerList.stream().collect(Collectors.summarizingInt(Integer::intValue)).getAverage();
        System.out.println(averag);
    }
}
