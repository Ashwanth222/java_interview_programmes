package Java8_programs;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfLists {
    public static void main(String[] args){
        List<String> list = Arrays.asList("red", "blue", "blue", "green", "red");
        List<String> otherList = Arrays.asList("red", "green", "green", "yellow");
        Set<String> result = list.stream()
                .distinct()
                .filter(otherList::contains)
                .collect(Collectors.toSet());
        System.out.println(result);
    }
}
