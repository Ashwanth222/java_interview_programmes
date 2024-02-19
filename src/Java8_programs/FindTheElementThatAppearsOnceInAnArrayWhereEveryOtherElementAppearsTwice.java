package Java8_programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Given an array of integers. All numbers occur twice except one
//number which occurs once. Find the number in O(n) time & constant extra space.
//
//Example :
//
//Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
//Output: 2
public class FindTheElementThatAppearsOnceInAnArrayWhereEveryOtherElementAppearsTwice {
    public static void main(String[] args){
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        Map<Integer,Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e->e, LinkedHashMap::new, Collectors.counting()));

                map
               .entrySet()
               .stream()
               .filter(k->k.getValue()==1)
               .forEach(e->System.out.println(e.getKey()));
    }
}
