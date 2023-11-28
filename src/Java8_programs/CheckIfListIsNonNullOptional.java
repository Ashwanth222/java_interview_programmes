package Java8_programs;

import java.util.Objects;
import java.util.Optional;

// How to check if list is empty in Java 8 using Optional,
// if not null iterate through the list and print the object?

public class CheckIfListIsNonNullOptional {
    public static void main(String[] args){
//        Optional.ofNullable(noteLst)
//                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
//                .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
//                .map(note -> Notes::getTagName) // method reference, consider only tag name
//                .forEach(System.out::println); // it will print tag names
    }
}
