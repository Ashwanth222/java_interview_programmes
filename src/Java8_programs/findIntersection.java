package Java8_programs;
import java.util.*;
import java.util.stream.Collectors;

public class findIntersection {
    static void intersection(Integer[] ... inputArrays)
    {
        //Printing input arrays

        System.out.println("Input Arrays :");

        System.out.println("======================");

        for (Integer[] inputArray : inputArrays)
        {
            System.out.println(Arrays.toString(inputArray));
        }

        //Creating HashSet object for first input array

        HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(inputArrays[0]));

        //Calling retainAll() method of first object by passing 2nd, 3rd, 4th... objects

        for (int i = 1; i < inputArrays.length; i++)
        {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));

            intersectionSet.retainAll(set);
        }

        System.out.println("===========================");

        System.out.println("Intersection Of All Input Arrays :");

        System.out.println("===========================");

        System.out.println(intersectionSet);
    }

    public static void main(String[] args)
    {
        Integer[] inputArray1 = {2, 3, 4, 7, 1};

        Integer[] inputArray2 = {4, 1, 3, 5};

        Integer[] inputArray3 = {8, 4, 6, 2, 1};

        Integer[] inputArray4 = {7, 9, 4, 1};

        intersection(inputArray1, inputArray2, inputArray3, inputArray4);

        //alternate
        Set<Integer> set = new HashSet<>();
        Arrays.asList(Arrays.stream(inputArray1).collect(Collectors.toList()),
                Arrays.stream(inputArray2).collect(Collectors.toList()),
                Arrays.stream(inputArray3).collect(Collectors.toList()),
                Arrays.stream(inputArray4).collect(Collectors.toList()))
                .stream().flatMap(List::stream).forEach(e -> set.add(e));
        System.out.println(set);

        //alternate
        Set<Integer> intersection =
                Arrays.stream(inputArray1)
                        .filter(num ->
                                Arrays.asList(inputArray2).contains(num) &&
                                        Arrays.asList(inputArray3).contains(num) &&
                                        Arrays.asList(inputArray4).contains(num))
                        .collect(Collectors.toSet());

        System.out.println(intersection);

        //alternate
        Set<Integer> result = new HashSet<>(Arrays.asList(inputArray1));

        result.retainAll(Arrays.asList(inputArray2));
        result.retainAll(Arrays.asList(inputArray3));
        result.retainAll(Arrays.asList(inputArray4));

        System.out.println(result);

        //Union Using flatMap()
        Set<Integer> union =
                Arrays.asList(inputArray1, inputArray2, inputArray3, inputArray4)
                        .stream()
                        .flatMap(Arrays::stream)
                        .collect(Collectors.toSet());

        System.out.println(union);
    }
}
