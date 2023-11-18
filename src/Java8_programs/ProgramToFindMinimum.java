package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ProgramToFindMinimum {
    public static void main(String[] args){
        Integer i = Stream.of(6,9,7,2,3,1,6,8).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(i);  //method1

        int[] i1 = {8,3,6,9,2,4,1,7};
        Arrays.stream(i1).min().ifPresent(System.out::println); //method2

        int i3 =Arrays.stream(i1).sorted().findFirst().getAsInt();
        System.out.println(i3); //method3

        int l = i1.length;
        int i4 =Arrays.stream(i1).sorted().limit(l-1).findFirst().getAsInt();
        System.out.println(i4);  //method4
    }
}
