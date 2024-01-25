package Java8_programs;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortHashMapByUsingValue {
    public static void main(String[] args){
        Map<Integer, String> idNameMap = new HashMap<Integer, String>();

        //Insert Id-Name pairs into idNameMap

        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");

        //Java 8 sorting using Entry.comparingByValue()

        Map<Integer, String> sortedIdNameMap
                = idNameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        //Print idNameMap before and after sorting

        System.out.println("Before Sorting : ");

        System.out.println(idNameMap);

        System.out.println("After Sorting : ");

        System.out.println(sortedIdNameMap);

        //descending order
        Map<Integer, String> sortedIdNameMap1
                = idNameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("descending order" + sortedIdNameMap1);

        //descending order
        Map<Integer, String> sortedIdNameMap2
                = idNameMap.entrySet()
                .stream()
                .sorted(Entry.comparingByValue((o1, o2) -> o2.length() - o1.length()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(" descending order using length of values"+ sortedIdNameMap2);

        //ascending order using length
        Map<Integer, String> sortedIdNameMap3
                = idNameMap.entrySet()
                .stream()
                .sorted(Entry.comparingByValue((o1, o2) -> o1.length() - o2.length()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(" descending order using length of values"+ sortedIdNameMap3);

        //ascending order using length using collections
        Map<Integer, String> sortedIdNameMap4 =
        idNameMap.entrySet().stream()
        .sorted(Collections.reverseOrder(Entry.comparingByValue((o1, o2) -> o1.length() - o2.length())))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2) -> e1,LinkedHashMap::new));

        System.out.println(sortedIdNameMap4);

    }

}
