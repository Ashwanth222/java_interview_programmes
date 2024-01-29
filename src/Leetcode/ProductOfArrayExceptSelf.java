package Leetcode;

import java.util.Arrays;
//Given an integer array nums, return an array answer such that answer[i] is
// equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
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
              if(i==j) {
                  continue;
              }else{
                  temp = temp * arr[j];
              }
           }
           result[i] = temp;
           temp = 1;
        }
        for(int i= 0; i<=arr.length-1;i++) {
            System.out.println(result[i]);
        }

        //alternate
        int pro = 1;
        int[] resultt = new int[arr.length];
        for(int i= 0; i<=arr.length-1;i++) {
            pro = pro*arr[i];
        }
        for(int i= 0; i<=arr.length-1;i++) {
            resultt[i] = pro/arr[i];
        }
        System.out.println("resultt" + Arrays.toString(resultt));




        //alternate java 8
        long product = Arrays.stream(arr).asLongStream().reduce(1L, (a, b) -> a * b);
        System.out.println(product);
        int [] brr =  Arrays.stream(arr).map(a -> (int) (product / a)).toArray();
        System.out.println(Arrays.toString(brr));


        //alternate
        int n = arr.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * arr[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * arr[i + 1];
        }

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        System.out.println(Arrays.toString(ans));

    }
}
