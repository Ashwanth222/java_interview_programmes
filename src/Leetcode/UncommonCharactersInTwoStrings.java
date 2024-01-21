package Leetcode;

import java.util.*;

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

    }
}
