package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindIndexOfSecondHighestNumberAndThirdHighestNumber {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(4,7,9,2,8,3,5);

        System.out.println();

        List<Integer> integerList = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(integerList);

        Integer secondHighest = integerList.stream().skip(1).findFirst().get();
        System.out.println(secondHighest);
        Integer thirdHighest =  integerList.stream().skip(2).findFirst().get();
        System.out.println(thirdHighest);
        System.out.println(numbers.indexOf(secondHighest));
        System.out.println(numbers.indexOf(thirdHighest));
    }
}
