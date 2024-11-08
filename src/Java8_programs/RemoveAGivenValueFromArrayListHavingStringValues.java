package Java8_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAGivenValueFromArrayListHavingStringValues {
    public static void main(String[] args){
        //first method
        String[] arr0=new String[]{"Apple","Banana","Orange"};

        //second method
        String[] arr1={"Apple","Banana","Orange"};

        List<String> list = Arrays.stream(arr0)
                .toList()
                .stream()
                .filter(e -> e != "Banana")
                .collect(Collectors.toList());

        System.out.println("list" + list);
    }
}
