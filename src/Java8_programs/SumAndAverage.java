package Java8_programs;

import java.util.*;

public class SumAndAverage {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        int summ = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(summ);

        double averag = integerList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(averag);
    }
}
