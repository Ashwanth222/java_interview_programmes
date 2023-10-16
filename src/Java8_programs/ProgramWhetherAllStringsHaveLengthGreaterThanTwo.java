package Java8_programs;

//program to check whether all strings have length greater than 2.

// Java code for Stream allMatch
// (Predicate predicate) to check whether
// all elements of this stream match
// the provided predicate.
import java.util.stream.Stream;

public class ProgramWhetherAllStringsHaveLengthGreaterThanTwo {
    public static void main(String[] args) {

        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        // Check if all elements of stream
        // have length greater than 2 using
        // Stream allMatch(Predicate predicate)
        boolean answer = stream.allMatch(str -> str.length() > 2);

        // Displaying the result
        System.out.println(answer);
    }
}
