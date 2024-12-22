package Java8_programs;
import java.util.Arrays;
import java.util.List;

public class TwoArraysEqualOrNotUsingArraysMethod {
    public static void  main(String[] args){
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};

        boolean flag = true;
        for(int i = 0; i<arrayOne.length; i++){
            if(arrayOne[i] != arrayTwo[i]){
                System.out.println("both are not equal");
                flag = false;
            }
        }
        if(flag){
            System.out.println("both are equal");
        }

        //alternate
        int l1 = arrayOne.length;
        int l2 = arrayTwo.length;
        if(l1 == l2){
            System.out.println(Arrays.equals(arrayOne,arrayTwo));
        }else{
            System.out.println("two arrays are not equal");
        }

        //alternate
        List<Integer> list1 = Arrays.asList(4,6,8,3,5,9);
        List<Integer> list2 = Arrays.asList(4,6,8,3,1,9);
        boolean containsOrNot = list1.containsAll(list2);
        System.out.println(containsOrNot);

        //alternate
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        Arrays.stream(arrayOne).forEach(e -> sb1.append(e));
        Arrays.stream(arrayTwo).forEach(e -> sb2.append(e));
        System.out.println("sb1 " + sb1);
        System.out.println("sb2 " + sb2);
        if(sb1.toString().equals(sb2.toString())){
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }
    }
}
