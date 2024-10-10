package Java8_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortHashMapByTreeMap {
    public static void main(String[] args){
        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);

        Map<String, Integer> map = new TreeMap<String, Integer>(studentMap);

        System.out.println("sorted tree map: " + map);

        Map<String, Integer> map1 = studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e2, LinkedHashMap::new));

        System.out.println(map1);

        Map<String, Integer> map2 = studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e2, LinkedHashMap::new));

        System.out.println(map2);


    }
}
