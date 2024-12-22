package Java8_programs;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.Arrays;


public class StringListToString {
    public static void main(String[] args)
    {
        // Create a string list
        List<String> str = Arrays.asList("Geeks", "for", "Geeks");

        // Convert the string list into String
        // using Collectors.joining() method
        String chString
                = str.stream().collect(Collectors.joining(" "));

        // Print the concatenated String
       System.out.println("chString " + chString);

        //alternate
        StringBuffer sb = new StringBuffer();
       str.stream().forEach(e -> sb.append(e +" "));
       System.out.println(sb);

       //alternate
        StringJoiner sj = new StringJoiner(" ");
        str.stream().forEach( e -> sj.add(e+ ""));
        System.out.println("sj " + sj);

        //alternate
        StringBuilder sb1 = new StringBuilder();
        str.stream().forEach(e -> sb1.append(e + " "));
        System.out.println("sb1 " + sb1);
    }
}
