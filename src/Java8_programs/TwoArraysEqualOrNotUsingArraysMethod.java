package Java8_programs;
import java.util.Arrays;
import java.util.List;

public class TwoArraysEqualOrNotUsingArraysMethod {
    public static void  main(String[] args){
        int[] arrayOne = {2, 5, 1, 7, 4};

        int[] arrayTwo = {2, 5, 1, 7, 4};

        int l1 = arrayOne.length;
        int l2 = arrayTwo.length;
        if(l1 == l2){
            System.out.println(Arrays.equals(arrayOne,arrayTwo));
        }else{
            System.out.println("two arrays are not equal");
        }

        List<Integer> list1 = Arrays.asList(4,6,8,3,5,9);
        List<Integer> list2 = Arrays.asList(4,6,8,3,1,9);
        boolean containsOrNot = list1.containsAll(list2);
        System.out.println(containsOrNot);


    }
}
