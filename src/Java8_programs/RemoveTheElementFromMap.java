package Java8_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveTheElementFromMap {
    public static void main(String[] args){
//        All the previous answers provide a solution that creates a new Map. This may be inefficient if you want to remove just a few entries.
//
//        The following removes the elements from the existing Map:

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);

        myMap.keySet().removeAll(
                myMap.entrySet().stream()
                        .filter(a->a.getValue().equals(2))
                        .map(e -> e.getKey()).collect(Collectors.toList()));

        System.out.println(myMap);

    }
}
