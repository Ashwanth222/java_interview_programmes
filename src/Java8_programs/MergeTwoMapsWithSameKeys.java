package Java8_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoMapsWithSameKeys {
    public static void main(String[] args){
        //Map-1

        HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();

        subjectToStudentCountMap1.put("Maths", 45);
        subjectToStudentCountMap1.put("Physics", 57);
        subjectToStudentCountMap1.put("Chemistry", 52);
        subjectToStudentCountMap1.put("History", 41);

        //Map-2

        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();

        subjectToStudentCountMap2.put("Economics", 49);
        subjectToStudentCountMap2.put("Maths", 42);
        subjectToStudentCountMap2.put("Biology", 41);
        subjectToStudentCountMap2.put("History", 55);

        HashMap<String, Integer> subjectToStudentCountMap3 = new HashMap<>(subjectToStudentCountMap1);
        subjectToStudentCountMap2.forEach((key,value) -> subjectToStudentCountMap3.merge(key, value, (v1,v2) ->v1+v2)  );
        System.out.println(subjectToStudentCountMap3);

        Map<String,Integer> map = Stream.concat(subjectToStudentCountMap1.entrySet().stream(),subjectToStudentCountMap2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1+v2, LinkedHashMap::new));
        System.out.println("merge to maps and add the subject values"+map);

        Map<String,Integer> map1 = Stream.concat(subjectToStudentCountMap1.entrySet().stream(),subjectToStudentCountMap2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1>v2 ? v1:v2 , HashMap::new));
        System.out.println("merge to maps and print the subject values which is greater value"+map1);

        Map<String,Integer> map2 = Stream.concat(subjectToStudentCountMap1.entrySet().stream(),subjectToStudentCountMap2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1>v2 ? v2:v1 , ConcurrentHashMap::new));
        System.out.println("merge to maps and print the subject values which is the lowest subject value"+map2);

        //using flatmap merge the students

        Map<String,Integer> map3 = Stream.of(subjectToStudentCountMap1,subjectToStudentCountMap2).flatMap(e-> e.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1+v2  , HashMap::new));
        System.out.println("merge to maps and add the subject values using flatmap: "+map3);

        HashMap<String, Integer> subjectToStudentCountMap4 =
                subjectToStudentCountMap2.entrySet()
                        .stream()
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (v1, v2) -> v1<v2 ? v1 : v2, () -> new HashMap<>(subjectToStudentCountMap1)));
        System.out.println("merge to maps and add the subject values which is lowest one: "+subjectToStudentCountMap4);






    }
}
