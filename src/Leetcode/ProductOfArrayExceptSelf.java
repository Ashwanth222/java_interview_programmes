package Leetcode;
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        int[] arr = {2,6,8,3,5};
        int l = arr.length-1;
        int temp = 1;
        int[] result = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
           for(int j = 0; j<arr.length; j++){
              if(i!=j){
                  result[i] = result[i]+ (temp * arr[j]);
              }
           }
        }
        for(int i= 0; i<=arr.length-1;i++) {
            System.out.println(result[i]);
        }
    }
}
