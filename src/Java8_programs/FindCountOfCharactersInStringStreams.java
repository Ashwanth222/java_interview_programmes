package Java8_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCountOfCharactersInStringStreams {
    public static void main(String[] args){


        String s1 = "JAVAEELLKK";
        int l = s1.length();
        char[] ch = s1.toCharArray();
        Map<Character,Integer> dCharactersCount = new HashMap<>();
        for(char c :ch){
            if(dCharactersCount.containsKey(c)){
                dCharactersCount.put(c,dCharactersCount.get(c)+1);
            }else{
                dCharactersCount.put(c,1);
            }
        }
        dCharactersCount.entrySet().stream().forEach(System.out::println);

        //alternate
        s1.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .forEach(e -> System.out.println(e.getKey() + " --- " + e.getValue()));

        System.out.println("----------------------------");
        //alternate
        Arrays.stream(s1.split(""))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .forEach(e -> System.out.println(e.getKey() + " --- " + e.getValue()));
    }
}
