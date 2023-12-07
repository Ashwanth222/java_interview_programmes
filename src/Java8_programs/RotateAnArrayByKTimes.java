package Java8_programs;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


public class RotateAnArrayByKTimes {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.rotate(list, 3);
        System.out.println(list);//[4, 5, 6, 1, 2, 3]
    }
}
