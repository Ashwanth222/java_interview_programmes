package Java8_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class ReduceArraySize {
    public static int minSetSize(int[] arr) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store the frequencies in a list and sort it in descending order
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        frequencies.sort(Collections.reverseOrder());

        int removedCount = 0;
        int elementsRemoved = 0;
        int halfSize = arr.length / 2;

        // Step 3: Remove elements until we've removed enough to make the array size half
        for (int freq : frequencies) {
            removedCount += freq;
            elementsRemoved++;
            if (removedCount >= halfSize) {
                break;
            }
        }

        return elementsRemoved;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        int result = minSetSize(arr);
        System.out.println(result);  // Output: 2


        //alternate
        Map<Integer, Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
        Map<java.lang.Integer, java.lang.Long> sorted = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(sorted);
        List<Long> list = new ArrayList<>(map.values().stream().toList());
        System.out.println(list);
        int l = arr.length;
        System.out.println(l);
        int removedCount = 0;
        int elementsRemoved = 0;
        int halfSize = arr.length / 2;
        for (Long freq : list) {
            removedCount += freq;
            elementsRemoved++;
            if (removedCount >= halfSize) {
                break;
            }
        }
        System.out.println("elementsRemoved" + elementsRemoved);
    }
}
