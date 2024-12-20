package Java8_programs;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoHashMapsWhileKeepingTheValuesOfCommonKeysIntact {

    public static void main(String[] args){
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "first");
        map1.put(2, "second");
        map1.put(3, "third");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "first");
        map2.put(2, "second");
        map2.put(3, "third");

    }
}
