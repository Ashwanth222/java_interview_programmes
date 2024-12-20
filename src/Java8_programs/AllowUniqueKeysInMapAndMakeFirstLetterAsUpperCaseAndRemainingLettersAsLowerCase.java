package Java8_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AllowUniqueKeysInMapAndMakeFirstLetterAsUpperCaseAndRemainingLettersAsLowerCase {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("sachin" , 45);
        map.put("ganguly" , 55);
        map.put("kohli" , 25);
        map.put("dhoni" , 35);
        map.put("ganguly" , 10);

        Map<String, Integer> map1 = map.entrySet().stream()
                .distinct()
                .collect(Collectors.toMap(e -> e.getKey().substring(0,1).toUpperCase()+e.getKey().substring(1,e.getKey().length()).toLowerCase() , e -> e.getValue() ));
        // .forEach(e -> System.out.println(e.getKey() + " --> " + e.getValue()));
        System.out.println(map1);

    }
}
