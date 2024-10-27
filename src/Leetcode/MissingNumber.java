package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args){
       // int[] a = {3,0,1};
        int[] a = {1,2,4,6,7,8,3};
        Arrays.sort(a);
        for(int i = 0; i<a.length-1;i++){
            if(a[i]+1 != a[i+1]){
                System.out.println("missing number  "+ (a[i+1] - 1));
                System.out.println("missing number  "+ (a[i] + 1));
            }
        }


        //alternate
        Arrays.sort(a);
       int[] b = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder())
               .toList().stream().mapToInt(e-> e).toArray();
       System.out.println(Arrays.toString(b));
       int low = Arrays.stream(b).findFirst().getAsInt();
        int high = Arrays.stream(a).sorted().findFirst().getAsInt();
        List<Integer> integers = new ArrayList<>();
       for(int i = 0;i<a.length;i++){
           integers.add(a[i]);
       }
        for(int i = high;i<=low;i++){
            if(!integers.contains(i)){
                System.out.println(i);
            }
        }

        //alternate
        int originalsum = Arrays.stream(a).sum();
        int expectedSum = 0;
        for(int i = 0;i<low+1;i++ ){
            expectedSum = expectedSum + i;
        }
        System.out.println(originalsum);
        System.out.println(expectedSum);
        int missing = expectedSum-originalsum;
        System.out.println("missing: " + missing);


        //alternate
        List<Integer> integers1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        int low1 = Arrays.stream(a).findFirst().getAsInt();
        System.out.println(low1 + low1);
        int high1 = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(high1 + high1);
        int missingValue = IntStream.range(low1, high1+1)
                .boxed()
                .filter(i -> !integers1.contains(i)).findFirst().get();
        System.out.println("missingValue " + missingValue);
    }
}
