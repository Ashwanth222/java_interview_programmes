package Java8_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoHashMapsWhileKeepingTheValuesOfCommonKeysIntact {

    public static void main(String[] args){
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "first");
        map1.put(2, "second");
        map1.put(3, "third");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "first1");
        map2.put(2, "second1");
        map2.put(3, "third3");

        Map<Integer, String> map = Stream.concat(map1.entrySet().stream(), map1.entrySet().stream())
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (v1, v2) -> v1+v2, LinkedHashMap::new));
        System.out.println("map" + map);
    }
}
