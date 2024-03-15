package Java8_programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTheMapUsingValueInAscAndDesc {
    public static void main(String[] ags){
        List<String> name = Arrays.asList("tejas", "ramani", "sitha", "lakshman");

        Map<String, Integer> ascendingByValues = name.stream()
                .collect(Collectors.toMap(e->e, e->e.length()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(e->e.getKey(), e-> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

        System.out.println(ascendingByValues);

        Map<String, Integer> descendingByValues = name.stream()
                .collect(Collectors.toMap(e->e, e->e.length()))
                .entrySet().stream().sorted((e1,e2)-> e2.getValue()-e1.getValue())
                .collect(Collectors.toMap(e->e.getKey(), e-> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));

        System.out.println(descendingByValues);


    }
}
