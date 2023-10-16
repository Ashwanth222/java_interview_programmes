package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findDuplicatesInIntegerArrayUsingHashMap {
    public static void main(String[] args)
    {
        int[] inputArray = {7,8,4,6,2,9,7};
        HashMap<Integer, Integer> map = new HashMap();

        for (int element : inputArray)
        {
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }
}
