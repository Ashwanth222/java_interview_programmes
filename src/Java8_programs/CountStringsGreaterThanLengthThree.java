package Java8_programs;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CountStringsGreaterThanLengthThree {
    public static void main(String[] args){
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        Long count = stringList.stream().filter(k -> k.length() > 3).collect(Collectors.counting());
        System.out.println(count);

        long count1 = stringList.stream().filter(str -> str.length() > 3).count();
        System.out.println(count1);

        stringList.stream().filter(str -> str.length() > 3).forEach(System.out::println);



    }
}
