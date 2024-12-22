package Java8_programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTheMapUsingValueInAscAndDesc {
    public static void main(String[] ags){
        List<String> names = Arrays.asList("tejas", "ramani", "sitha", "lakshman");

        Map<String, Integer> ascendingByValues = names.stream()
                .collect(Collectors.toMap(e->e, e->e.length()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(e->e.getKey(), e-> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

        System.out.println(ascendingByValues);

        Map<String, Integer> ascendingByKeys = names.stream()
                .collect(Collectors.toMap(e->e, e->e.length()))
                .entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(e->e.getKey(), e-> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

        System.out.println(ascendingByKeys);

        Map<String, Integer> descendingByValues = names.stream()
                .collect(Collectors.toMap(e->e, e->e.length()))
                .entrySet().stream().sorted((e1,e2)-> e2.getValue()-e1.getValue())
                .collect(Collectors.toMap(e->e.getKey(), e-> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

        System.out.println(descendingByValues);

        Map<String, Integer> descendingByKeys = names.stream()
                .collect(Collectors.toMap(e->e, e->e.length()))
                .entrySet().stream().sorted((e1,e2)-> e2.getKey().compareTo(e1.getKey()))
                .collect(Collectors.toMap(e->e.getKey(), e-> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

        System.out.println(descendingByKeys);

    }
}
