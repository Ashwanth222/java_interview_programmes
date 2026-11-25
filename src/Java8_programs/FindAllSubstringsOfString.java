package Java8_programs;//Java program to print all possible
// substrings of a given string

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class FindAllSubstringsOfString {

    // Function to print all sub strings
//    static void subString(char str[], int n) {
//        // Pick starting point
//        for (int len = 1; len <= n; len++) {
//            // Pick ending point
//            for (int i = 0; i <= n - len; i++) {
//                // Print characters from current
//                // starting point to current ending
//                // point.
//                int j = i + len - 1;
//                for (int k = i; k <= j; k++) {
//                    System.out.print(str[k]);
//                }
//
//                System.out.println();
//            }
//        }
//    }

    // Driver program to test above function
    public static void main(String[] args) {
        char str[] = {'a', 'b', 'c'};
        //subString(str, str.length);

        //alternate
        String st = "abcdef";
        IntStream.range(0, st.length()).boxed().forEach(i -> IntStream.rangeClosed(i + 1, st.length()).forEach(j -> System.out.println(st.substring(i, j))));

        //alternate
        List<String> substrings = IntStream.range(0, st.length()).boxed().flatMap(i -> IntStream.rangeClosed(i + 1, st.length()).mapToObj(j -> st.substring(i, j))).collect(Collectors.toList());

        System.out.println("substrings : " + substrings);

        //If we use map

       IntStream.range(0, st.length()).boxed().map(i -> IntStream.rangeClosed(i + 1, st.length()).mapToObj(j -> st.substring(i, j))).forEach(stream -> stream.forEach(System.out::println));

        //alternate
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j <= st.length(); j++) {
                System.out.println(st.substring(i, j));
            }
        }
    }
}
// This code is contributed by PrinciRaj1992
