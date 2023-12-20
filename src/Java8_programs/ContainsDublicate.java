package Java8_programs;

import java.util.*;
import java.util.stream.Collectors;

public class ContainsDublicate {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(1,2,4,6,7,4);
  //method 1
     List<Integer> listIntegers = integerList.stream().collect(Collectors.toList());

   Set<Integer> setIntegers = new HashSet<>();
   setIntegers.addAll(listIntegers);
   System.out.println(setIntegers);
   System.out.println(listIntegers);
   if(listIntegers.size() == setIntegers.size()){
       System.out.println("true");
   }else{
       System.out.println("false");

   }

   //method2

        List<Integer> distinctIntegers = integerList.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctIntegers.size());
        System.out.println(listIntegers.size());
        if(listIntegers.size() == distinctIntegers.size()){
            System.out.println("true");
        }else{
            System.out.println("false");

        }

      Set<Integer> noDublicates =  integerList.stream().collect(Collectors.toSet());  //method3
        System.out.println(noDublicates);

    }
}
