package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ProgramToFindMaximum {
    public static void main(String[] args){
        Integer in = Stream.of(8, 7, 5, 9, 4, 6, 2).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(in);       //method 1

        int[] i = {8, 7, 5, 9, 4, 6, 2};
        int i2 = Arrays.stream(i).max().getAsInt();  //method 2
        System.out.println(i2);


        int i3 =Arrays.stream(i).sorted().skip(i.length-1).findFirst().getAsInt();
        System.out.println(i3);  // method 3

    }
}
