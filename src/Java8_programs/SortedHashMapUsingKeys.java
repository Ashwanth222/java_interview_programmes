package Java8_programs;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortedHashMapUsingKeys {
    public static void main(String[] args){
        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);

        //method 1 ascending
     //   Map<String, Integer> studentMap3 = new TreeMap<>(Comparator.naturalOrder());
        //method 2 ascending
        Map<String, Integer> studentMap3 = new TreeMap<>();

        studentMap3.putAll(studentMap);
        System.out.println("By default it is sorted using keys -----------------" +studentMap3);

        System.out.println("ascending by values ----------------------------");
        //method 1 ascending
        Map<String, Integer> studentMap4 = new HashMap<>(studentMap);
        studentMap4.entrySet().stream()
                .sorted((e1,e2) -> e1.getValue() - e2.getValue())
                .forEach(System.out::println);

        System.out.println("descending by values -----------------------------------");
        //method 1 descending
        studentMap4.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue() - e1.getValue())
                .forEach(System.out::println);

        //method 1 descending
        Map<String, Integer> studentMap1 = new TreeMap<>(Comparator.reverseOrder());
        studentMap1.putAll(studentMap);
        System.out.println("By default it is sorted using keys" +studentMap1);

        //method 2 descending
        Map<String, Integer> studentMap2 = new TreeMap<>(Collections.reverseOrder()); //using Collections
        studentMap2.putAll(studentMap);
        System.out.println("By default it is sorted using keys" +studentMap2);


        //descending order of keys
        System.out.println("/descending order of keys");
        studentMap.entrySet().stream()
                .sorted((e1,e2)->e2.getKey().compareToIgnoreCase(e1.getKey()))
                .forEach(e-> System.out.println(e.getKey()+ " : " +e.getValue()));

        System.out.println("-------------------------------------//ascending order of keys\n");
        //ascending order of keys
        studentMap.entrySet().stream()
                .sorted((e1,e2)->e1.getKey().compareToIgnoreCase(e2.getKey()))
                .forEach(e-> System.out.println(e.getKey()+ " : " +e.getValue()));

        //ascending order by comparing length of keys
        System.out.println("ascending order by comparing length of keys");
        studentMap.entrySet().stream()
                .sorted((e1,e2)->e1.getKey().length() - e2.getKey().length())
                .forEach(e-> System.out.println(e.getKey()+ " : " +e.getValue()));

        //descending order by comparing length of keys
        System.out.println("descending order by comparing length of keys");
        studentMap.entrySet().stream()
                .sorted((e1,e2)->e2.getKey().length() - e1.getKey().length())
                .forEach(e-> System.out.println(e.getKey()+ " : " +e.getValue()));

        System.out.println("ascending order by using entry method for keys");
        Map<String,Integer> map = studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
            System.out.println(" ascending order using keys" + map);


        System.out.println("ascending order by using entry method for values");
        Map<String,Integer> DesMap = studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(" ascending order using values" + DesMap);

        System.out.println("descending order by using entry method for keys");
        Map<String,Integer> map3 = studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(" descending order using keys" + map3);


        System.out.println("descending order by using entry method for values");
        Map<String,Integer> DesMap3 = studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(" descending order using values" + DesMap3);

        System.out.println("ascending order by using entry method for keys using length");
        Map<String,Integer> map4 = studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey((o1,o2) -> o1.length() -o2.length()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(" ascending order using length of keys " + map4);


        System.out.println("descending order by  length using entry method for values ");
        Map<String,Integer> DesMap4 = studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey((o1,o2) -> o2.length() -o1.length()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(" descending order by length using values" + DesMap4);

        System.out.println("descending order by using entry method for keys using length");
        Map<String,Integer> map5 = studentMap.entrySet().stream()    //collections
                .sorted(Collections.reverseOrder(Entry.comparingByKey((o1,o2) -> o2.length() -o1.length())))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(" descending order using length of keys " + map5);

    }
}
