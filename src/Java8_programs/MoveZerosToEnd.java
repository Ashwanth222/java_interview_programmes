package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosToEnd {
    public static void main(String[] args){
       int[] nums = {0,1,0,3,12};
        Arrays.sort(nums);
        System.out.println(Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        //preserving positions
        List<Integer> zeroes = Arrays.stream(nums).boxed().filter(i -> i.equals(0)).collect(Collectors.toList());
        List<Integer> nonZeroes = Arrays.stream(nums).boxed().filter(i -> !i.equals(0)).collect(Collectors.toList());
        List<Integer> all = Stream.concat(nonZeroes.stream(), zeroes.stream()).collect(Collectors.toList());
        System.out.println(all);
    }
}
