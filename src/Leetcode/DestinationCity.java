package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DestinationCity {
    public static void main(String[] args){
        String destination = null;
        List<List<String>> listOfLists = new ArrayList<>();
        List<String> innerList1 = new ArrayList<>();

        // Adding elements to innerList
        innerList1.add("London");
        innerList1.add("New York");

        // Adding innerList to listOfLists
        listOfLists.add(innerList1);

        // Creating another inner list
        List<String> innerList2 = new ArrayList<>();

        // Adding elements to innerList2
        innerList2.add("New York");
        innerList2.add("Lama");

        listOfLists.add(innerList2);

        // Creating another inner list
        List<String> innerList3 = new ArrayList<>();

        // Adding elements to innerList2
        innerList3.add("Lama");
        innerList3.add("Wesley");

        // Adding innerList2 to listOfLists
        listOfLists.add(innerList3);

        // Printing listOfLists elements
        System.out.println(listOfLists);

       Set<String> uniqueCities = listOfLists.stream()
               .flatMap(e->e.stream().distinct()).collect(Collectors.toSet());
       System.out.println(uniqueCities);
       List<String> cities1 = new ArrayList<>();
        List<String> cities2 = new ArrayList<>();
        for(List<String> list1: listOfLists){
          String innerList11= list1.get(0);
           cities1.add(innerList11);
           System.out.println("cities1" + cities1);
       }
        for(List<String> list2: listOfLists){
            String innerList12=   list2.get(1);
            cities2.add(innerList12);
            System.out.println("cities2" + cities2);
            if(!cities1.contains(innerList12)){
                destination = innerList12;
                System.out.println("destination " + destination);
                break;
            }
        }
    }
}
