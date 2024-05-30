package java_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//make array in reverse order  without using new
// array and time complexity should be O(n)
public class MakeArrayInReverseOrder {
    public static void main(String[] args){
        int [] arr = {1,2,5,3,9};
        int temp = 0;
        int j = arr.length-1;
        for(int i = 0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr).boxed().forEach(e -> list.add(e));
        Collections.reverseOrder();
        System.out.println(list);
    }
}
