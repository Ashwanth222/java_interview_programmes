package java_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnElementFromAnArray {
    public static void main(String[] args){
        int[] integers = {4,7,9,2,6};
        int target = 9;
        int[] newIntegers = new int[integers.length-1];
        int k = 0;
        for(int i = 0; i<integers.length;i++){
            if(integers[i] != target){
               newIntegers[k] = integers[i];
               k++;
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(newIntegers).toArray()));

        //alternate
        int[] integers2 = {4,7,9,2,6};
        List<Integer> list2 = new ArrayList<>();
        Arrays.stream(integers2).filter(i -> i != 9).forEach(e -> list2.add(e));
        System.out.println(list2);

        //Alternate
        int[] integers1 = {4,7,9,2,6};
        int target1 = 9;
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        Arrays.stream(integers1).filter(i -> i != 9).forEach(e -> {
            if(Arrays.stream(integers1).anyMatch(g -> g == target1)){
                list.add(e);
            }else{
                list1.add(e);
            }
        });
        System.out.println(list);
        System.out.println(list1);
    }
}
