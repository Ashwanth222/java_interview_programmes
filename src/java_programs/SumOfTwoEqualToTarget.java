package java_programs;

public class SumOfTwoEqualToTarget {
    public static void main(String[] args){
        int[] arr = {5, 8, 7, 2, 9};
        int target = 11;
        for(int i = 0; i< arr.length;i++){
            for(int j = 1; j< arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i + " index and " + j + " index");
                }
            }
        }
    }
}
