package Leetcode;

public class SumOfTwoEqualToTarget {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8};
        int target = 7;
        int a_pointer = 0;
        int b_pointer = arr.length-1;
        while(a_pointer<b_pointer){
            if(arr[a_pointer] + arr[b_pointer] > target){
                b_pointer --;
            } else if (arr[a_pointer] + arr[b_pointer] < target) {
                a_pointer ++;
            }else{
                System.out.println(arr[a_pointer] +"+"+arr[b_pointer] +"="+target );
                break;
            }
        }
    }
}
