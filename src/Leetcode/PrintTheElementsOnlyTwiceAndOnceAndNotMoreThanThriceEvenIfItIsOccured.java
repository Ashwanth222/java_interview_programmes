package Leetcode;

import java.util.*;
import java.util.stream.Collectors;
//if number is repeated more than thrice also print the number only
// twice and single repeated as single time
public class PrintTheElementsOnlyTwiceAndOnceAndNotMoreThanThriceEvenIfItIsOccured {
    public static void main(String[] args){
        int[] Input = {1,1,1,2,3,3,3,3,4,4};
       Map<Integer,Long> map =  Arrays.stream(Input).boxed()
               .collect(Collectors.groupingBy(e->e, LinkedHashMap::new,Collectors.counting()));
System.out.println(map);
        List<Long> arr = new ArrayList<>();
                map.entrySet().stream()
             .filter(k->k.getValue() == 1).forEach(o->arr.add(Long.valueOf(o.getKey())));
     //System.out.println(arr);
        List<Long> arr2 = new ArrayList<>();
       map.entrySet().stream()
                .filter(k->k.getValue() > 1).forEach(o->arr2.add(Long.valueOf(o.getKey())));
        map.entrySet().stream()
                .filter(k->k.getValue() > 1).forEach(o->arr2.add(Long.valueOf(o.getKey())));
       //System.out.println(arr2);
       //System.out.println(arr);
       arr.addAll(arr2);
       arr.stream().sorted().forEach(System.out::println);
    }
}
