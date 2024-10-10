package Java8_programs;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//print last element in the unique list
public class ProgramToPrintDistinctLastElementInTheArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int a = Arrays.stream(arr).boxed().skip(arr.length -1).findFirst().get().intValue();
        System.out.println(a);


        List<Map.Entry<Integer, Long>> entryList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .collect(Collectors.toList());
              //  .forEach(e -> System.out.println( "e.getKey()" + e.getKey() + "e.getValue()"+ e.getValue()));

        System.out.println("distinct last index + key and value is"+ entryList.get(entryList.size()-1));

    }
}
