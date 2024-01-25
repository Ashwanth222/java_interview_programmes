package Java8_programs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacterInString {
    public static void main(String[] args) {

        System.out.println("  Please  enter  the  input  string  :");
        Scanner in = new Scanner(System.in);    // read from System input
        String input = in.nextLine();
        Character firstNonRepeatedChar = logic(input);
        System.out.println("The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
        in.close();
    }

    private static Character logic(String input) {
        //method 1
        String nonRepetetedFirstCharacter = Arrays.stream(input.replaceAll(" ","")
                                    .split(""))
                                    .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
                                    .entrySet()
                .stream()
                .sorted((e1,e2)-> Math.toIntExact(e1.getValue() - e2.getValue()))
                .findFirst().get().getKey();

        System.out.println(nonRepetetedFirstCharacter);

        //method 2
        Character result = input.chars()           // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                .map(entry -> entry.getKey())              // get the keys of EntrySet
                .findFirst().get();                        // get the first entry from the keys

        return result;
    }
}
