package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicateElementsFromArrayList {
    public static void main(String[] args)
    {
        //Constructing An ArrayList

        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("J2EE");

        listWithDuplicateElements.add("JSP");

        listWithDuplicateElements.add("SERVLETS");

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("STRUTS");

        listWithDuplicateElements.add("JSP");

        //Printing listWithDuplicateElements

        System.out.print("ArrayList With Duplicate Elements :");

        System.out.println(listWithDuplicateElements);

        //Constructing HashSet using listWithDuplicateElements

        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);

        //Constructing listWithoutDuplicateElements using set

        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);

        //Printing listWithoutDuplicateElements

        System.out.print("ArrayList After Removing Duplicate Elements :");

        System.out.println(listWithoutDuplicateElements);

//Alternate
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(5);
//        numbers.add(5);
//        numbers.add(7);
//        numbers.add(9);
//        numbers.add(9);
//        Set<Integer> numbers1 = new HashSet<>();
//        numbers1.addAll(numbers);
//        System.out.println(numbers1);
    }

}
