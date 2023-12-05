package Java8_programs;

import java.util.*;
import java.util.stream.Collectors;

public class FindAllDuplicatesInArray {
    public static void main(String[] args){
        int[] arr = {6, 8, 4, 9, 3, 7, 3, 8};
        Set<Integer> set = new HashSet<>();
       List<Integer> uniqueIntegers = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
       System.out.println(uniqueIntegers);
        List<Integer> duplicateIntegers = Arrays.stream(arr).boxed()
                .filter(i -> !set.add(i)).collect(Collectors.toList());
        System.out.println(duplicateIntegers);
    }
}
