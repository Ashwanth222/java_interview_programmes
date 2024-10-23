package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class UncommonCharactersInTwoStrings {
    public static void main(String[] args) {
        String a = "abcdefg";
        String b = "bdacxekl";
        Map<String, Integer> stringCountA = new HashMap<String, Integer>();
        char[] chars1 = a.toCharArray();
        for (char c : chars1) {
            if (stringCountA.containsKey(c)) {
                stringCountA.put(String.valueOf(c), stringCountA.get(c) + 1);
            } else {
                stringCountA.put(String.valueOf(c), 1);
            }
        }
        Map<String, Integer> stringCountB = new HashMap<String, Integer>();

        char[] chars2 = b.toCharArray();
        for (char c1 : chars2) {
            if (stringCountB.containsKey(c1)) {
                stringCountB.put(String.valueOf(c1), stringCountB.get(c1) + 1);
            } else {
                stringCountB.put(String.valueOf(c1), 1);
            }
        }
        Set<String> ch1 = stringCountA.keySet();
        Set<String> ch2 = stringCountB.keySet();
        Set<String> setCharacters = new HashSet<>();
        for(String c: ch1){
            setCharacters.add(c);
        }
        for(String c: ch2){
            setCharacters.add(c);
        }
        System.out.println(stringCountA);
        System.out.println(stringCountB);
        System.out.println(setCharacters);

        setCharacters.stream().filter(e ->!stringCountA.keySet().removeAll(Collections.singleton(e))).forEach(System.out::println);
        setCharacters.stream().filter(e ->!stringCountB.keySet().removeAll(Collections.singleton(e))).forEach(System.out::println);

        //alternate
        Map<String, Long> map1 = Arrays.stream(a.split("")).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
        Map<String, Long> map2 = Arrays.stream(b.split("")).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
        Set<String> set1 =map1.keySet();
        Set<String> set2 =map2.keySet();
        Set<String> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println("set3" + set3);

    }
}
