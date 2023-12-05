package Java8_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RetainAllAndRemoveAllMethods {
    public static void main(String[] args){
        int[] arr = {6, 8, 4, 9, 3, 7, 3, 8};
        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueIntegers = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        System.out.println(uniqueIntegers);
        List<Integer> duplicateIntegers = Arrays.stream(arr).boxed()
                .filter(i -> !set.add(i)).collect(Collectors.toList());
        System.out.println(duplicateIntegers);

        System.out.println(uniqueIntegers.retainAll(duplicateIntegers));
        System.out.println(duplicateIntegers.retainAll(uniqueIntegers));
        System.out.println(uniqueIntegers.removeAll(duplicateIntegers));
        System.out.println(duplicateIntegers.removeAll(uniqueIntegers));
    }
}
