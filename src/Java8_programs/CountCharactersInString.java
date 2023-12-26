package Java8_programs;

import java.util.Map;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharactersInString {
    public static void main(String[] args) {
        String input = "gainjavaknowledge";
//method 1
        Map<String, Long> output = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output : "+output);

        output.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });

        //method2
        String str = "ashwanthtelanganahyderabadindia";

        Map<Character, Long> sb = new StringBuffer(str).chars()
                .mapToObj(ch1 -> (char) ch1)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(sb);
    }
}
