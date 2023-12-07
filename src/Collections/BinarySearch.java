package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int indexPosition = Collections.binarySearch(Arrays.stream(arr).boxed().toList(), 3);
        System.out.println(indexPosition);
    }
}
