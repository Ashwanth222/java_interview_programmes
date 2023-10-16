package Java8_programs;
import java.util.Arrays;

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
    }
}
