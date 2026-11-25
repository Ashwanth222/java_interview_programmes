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

        //alternate
        List<Integer> sorted = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int secondHighest1 = sorted.get(1);
        int thirdHighest1 = sorted.get(2);

        System.out.println("Second Highest = " + secondHighest1 +
                ", Index = " + numbers.indexOf(secondHighest1));

        System.out.println("Third Highest = " + thirdHighest1 +
                ", Index = " + numbers.indexOf(thirdHighest1));

        //alternate
        List<Integer> numberss = Arrays.asList(4, 7, 9, 2, 8, 3, 5);

        numberss.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //alternate
        List<Integer> top3 = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Second Highest : " + top3.get(1));
        System.out.println("Third Highest : " + top3.get(2));
    }
}
