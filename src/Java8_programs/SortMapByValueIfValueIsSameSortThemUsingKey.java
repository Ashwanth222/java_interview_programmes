package Java8_programs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValueIfValueIsSameSortThemUsingKey {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Aman", 95);
        scores.put("Veer", 50);
        scores.put("Hari", 65);
        scores.put("Ashwin", 65);
        scores.put("Suraj", 65);

        //output {Veer=50, Ashwin=65, Hari=65, Suraj=65, Aman=95}

        //sort the map using value, if the value is same then sort them using the key
        Map<String, Integer> map = scores.entrySet().stream().sorted((e1, e2) -> e1.getValue() - e2.getValue())
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(map);

        Map<String, Integer> map1 = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(map1);

        Map<String, Integer> map2 = map1.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(map2);

    }
}
