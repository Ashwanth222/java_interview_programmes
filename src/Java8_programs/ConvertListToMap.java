package Java8_programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args){
        List<String> users = Arrays.asList("name1","name2","name3","name4","name5");
        Map<String,String> members = users.stream().collect(Collectors.toMap(u -> u, Function.identity()));
        System.out.println(members);

        //alternate
        Map<String,String> members1 = users.stream()
                .collect(Collectors.toMap(e -> e, String::toUpperCase));
        System.out.println(members1);
    }
}
