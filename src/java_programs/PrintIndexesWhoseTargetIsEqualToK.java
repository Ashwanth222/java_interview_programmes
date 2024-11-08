package java_programs;

public class PrintIndexesWhoseTargetIsEqualToK {
    public static void main(String[] args){
        int[] numbers = {3, 5, 7, 2, 8, 6};
//        Integer thirdHighest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
//        System.out.println(thirdHighest);

        //target 12
        for(int i = 0; i<numbers.length;i++){
            for(int j = i; j<numbers.length-1;j++){
                if(numbers[i] + numbers[j] == 12){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }

        System.out.println("--------------------------");
        //
        int j = 1;
        for(int i = 0; i<numbers.length-1;i++){
            if(numbers[i] + numbers[j] == 12){
                System.out.println(i);
                System.out.println(j);
            }
            j++;
        }
    }
}
