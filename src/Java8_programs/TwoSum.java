package Java8_programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {5, 7, 9, 3, 2};
        int target = 8;
        int expected = 0;
        for (int i = 0; i < arr.length; i++) {
            int finalI = i;
            List<Integer> res = IntStream.of(arr).boxed().filter(x -> x + arr[finalI] == target)
                    .collect(Collectors.toList());
                           System.out.println(res.stream().mapToInt(e->e).sum());
           expected = res.stream().mapToInt(e->e).sum() + expected;
        }
        if(expected == target) {
            System.out.println("target found: " + expected);
        }else {
            System.out.println("target not found");
        }
    }
}
