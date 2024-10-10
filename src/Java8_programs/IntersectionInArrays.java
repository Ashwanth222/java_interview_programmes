package Java8_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntersectionInArrays {
        //Printing input arrays
//        static void intersection(Integer[] ... inputArrays)
//        {
//            System.out.println("Input Arrays :");
//        System.out.println("======================");
//        for (Integer[] inputArray : inputArrays)
//        {
//            System.out.println(Arrays.toString(inputArray));
//        }
//        //Creating HashSet object for first input array
//        HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(inputArrays[0]));
//        //Calling retainAll() method of first object by passing 2nd, 3rd, 4th... objects
//        for (int i = 1; i < inputArrays.length; i++)
//        {
//            HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));
//            intersectionSet.retainAll(set);
//        }
//        System.out.println("===========================");
//        System.out.println("Intersection Of All Input Arrays :");
//        System.out.println("===========================");
//        System.out.println(intersectionSet);
//    }
//
//    public static void main(String[] args)
//    {
//        Integer[] inputArray1 = {2, 3, 4, 7, 1};
//        Integer[] inputArray2 = {4, 1, 3, 5};
//        Integer[] inputArray3 = {8, 4, 6, 2, 1};
//        Integer[] inputArray4 = {7, 9, 4, 1};
//        intersection(inputArray1, inputArray2, inputArray3, inputArray4);
//    }

public static void main(String[] args){
       int[] inputArray1 = {2, 3, 4, 7, 1};
       int[] inputArray2 = {4, 1, 3, 5};
      int[] inputArray3 = {8, 4, 6, 2, 1};
       int[] inputArray4 = {7, 9, 4, 1};

    Set<Integer> setOfIntegers = Arrays.asList(Arrays.stream(inputArray1).boxed().collect(Collectors.toSet()),
           Arrays.stream(inputArray2).boxed().collect(Collectors.toSet()),
                    Arrays.stream(inputArray3).boxed().collect(Collectors.toSet()),
                    Arrays.stream(inputArray4).boxed().collect(Collectors.toSet()))
            .stream().collect(Collectors.toSet())
            .stream().flatMap(l -> l.stream().distinct()).collect(Collectors.toSet());
    System.out.println(setOfIntegers);
    setOfIntegers.retainAll(Arrays.stream(inputArray1).boxed().collect(Collectors.toSet()));
    System.out.println(setOfIntegers);
    setOfIntegers.retainAll(Arrays.stream(inputArray2).boxed().collect(Collectors.toSet()));
    System.out.println(setOfIntegers);
    setOfIntegers.retainAll(Arrays.stream(inputArray3).boxed().collect(Collectors.toSet()));
    System.out.println(setOfIntegers);
    setOfIntegers.retainAll(Arrays.stream(inputArray4).boxed().collect(Collectors.toSet()));
    System.out.println(setOfIntegers);

    }
}

