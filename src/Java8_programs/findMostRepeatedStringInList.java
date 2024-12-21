package Java8_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findMostRepeatedStringInList {
    public static void main(String[] args){
    List<String> listOfCities = Arrays.asList("mumbai", "bangalore", "pune", "hyderabad", "delhi",
            "kolkata", "bangalore", "pune", "mumbai", "bangalore", "pune", "pune");

    Map<String, Long> countOfCities = listOfCities.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       System.out.println(countOfCities);


    String mostRepeatedCity = countOfCities.entrySet().stream()
            .sorted((entry1, entry2)-> entry2.getValue().intValue() - entry1.getValue().intValue())
            .findFirst().get().getKey();
    System.out.println(mostRepeatedCity);

    //alternate
        String mostRepeatedCity1 = countOfCities.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).skip(countOfCities.size()-1)
                .findFirst().get().getKey();
        System.out.println(mostRepeatedCity1);


        String leastRepeatedCity = countOfCities.entrySet().stream()
                .sorted((entry1, entry2)-> entry1.getValue().intValue() - entry2.getValue().intValue())
                .findFirst().get().getKey();
        System.out.println(leastRepeatedCity);

        //alternate
        String leastRepeatedCity1 = countOfCities.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .findFirst().get().getKey();
        System.out.println(leastRepeatedCity1);

}
}
