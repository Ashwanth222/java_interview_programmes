package Java8_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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


    }
}
