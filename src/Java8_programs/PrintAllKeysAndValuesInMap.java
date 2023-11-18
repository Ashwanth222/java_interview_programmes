package Java8_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintAllKeysAndValuesInMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        // 1. Using an iterator
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 2. For-each loop
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // 3. Java 8 – Collection.iterator() + Iterator.forEachRemaining()
        map.keySet().iterator()
                .forEachRemaining(System.out::println);

        // 4. Java 8 – Collection.stream() + Stream.forEach()
        map.keySet().stream()
                .forEach(System.out::println);

        // Java 8 – Stream.of() + Collection.toArray() + Stream.forEach()
        Stream.of(map.keySet().toArray())
                .forEach(System.out::println);

        // 5. Convert to a string
        System.out.println(map.keySet().toString());

        // Java 8
        Stream.of(map.keySet().toString())
                .forEach(System.out::println);


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");

        // 1. Using an iterator
        Iterator<String> itr1 = map1.values().iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        // 2. For-each loop
        for (String key : map1.values()) {
            System.out.println(key);
        }

        // 3. Java 8 – Collection.iterator() + Iterator.forEachRemaining()
        map1.values().iterator()
                .forEachRemaining(System.out::println);

        // 4. Java 8 – Collection.stream() + Stream.forEach()
        map1.values().stream()
                .forEach(System.out::println);

        // Java 8 – Stream.of() + Collection.toArray() + Stream.forEach()
        Stream.of(map1.values().toArray())
                .forEach(System.out::println);

        // 5. Convert to a string
        System.out.println(map1.values().toString());

        // Java 8
        Stream.of(map1.values().toString())
                .forEach(System.out::println);

    }
}
