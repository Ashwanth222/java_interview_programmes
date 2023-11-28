package Java8_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args){
        List<String> users = Arrays.asList("name1","name2","name3","name4","name5");
        Map<String,List<String>> members = users.stream().collect(Collectors.toMap(Function.identity(), u -> new ArrayList()));
        System.out.println(members);
    }
}
