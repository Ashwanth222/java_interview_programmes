package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MoveZerosToEnd {
    public static void main(String[] args){
       int[] nums = {0,1,0,3,12};
        Arrays.sort(nums);
        System.out.println(Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
