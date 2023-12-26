package java_programs;

import java.util.Arrays;

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
    }
}
