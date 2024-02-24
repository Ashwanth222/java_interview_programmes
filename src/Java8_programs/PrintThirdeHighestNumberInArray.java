package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class PrintThirdeHighestNumberInArray {
    public static void main(String[] args){
        int[] arr = {5,8,6,3,9,2,8,9};
        //if we have dublicates this will not work
        int thirdhighest = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        // System.out.println(thirdhighest);

        //alternate
        int third = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.groupingBy(e->e, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().skip(2).findFirst().get().getKey();

        System.out.println(third);

        //alternate
        int third2 = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder())
                .skip(2).findFirst().get();
        System.out.println(third2);
    }
}
