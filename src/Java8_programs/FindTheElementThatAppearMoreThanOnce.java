package Java8_programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
//        Output: 10 45
//
//        Input: arr[] = {1, 2, 3, 4, 2, 5}
//        Output:2

public class FindTheElementThatAppearMoreThanOnce {
    public static void main(String[] args){
       int arr[] = {12, 10, 9, 45, 2, 10, 10, 45, 2};
        Map<Integer,Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e->e, LinkedHashMap::new, Collectors.counting()));
        map.entrySet().stream().filter(k->k.getValue()>1)
                .forEach(e->System.out.println(e.getKey()));
    }
}
