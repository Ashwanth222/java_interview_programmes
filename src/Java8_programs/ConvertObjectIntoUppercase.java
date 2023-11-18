package Java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ConvertObjectIntoUppercase {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("aa","bb", "cc", "dd");
        List<String> uppercaseStrings = strings.stream().map(s->s.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        System.out.println(uppercaseStrings);
    }
}
