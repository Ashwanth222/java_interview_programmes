package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args){
       // int[] a = {3,0,1};
        int[] a = {1,2,4,6,7,8,3};
        Arrays.sort(a);
       int[] b = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder())
               .toList().stream().mapToInt(e-> e).toArray();
       System.out.println(Arrays.toString(b));
       int l = Arrays.stream(b).findFirst().getAsInt();
        int k = Arrays.stream(a).sorted().findFirst().getAsInt();
        List<Integer> integers = new ArrayList<>();
       for(int i = 0;i<a.length;i++){
           integers.add(a[i]);
       }
        for(int i = k;i<=l;i++){
            if(!integers.contains(i)){
                System.out.println(i);
            }
        }

        //alternate
        int originalsum = Arrays.stream(a).sum();
        int expectedSum = 0;
        for(int i = 0;i<l+1;i++ ){
            expectedSum = expectedSum + i;
        }
        System.out.println(originalsum);
        System.out.println(expectedSum);
        int missing = expectedSum-originalsum;
        System.out.println("missing: " + missing);



    }
}
