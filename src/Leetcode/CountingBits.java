package Leetcode;

import java.util.Arrays;
//Counting Bits
//Easy
//10.8K
//503
//Companies
//Given an integer n, return an array ans of length n + 1 such that
// for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
//Example 1:
//
//Input: n = 2
//Output: [0,1,1]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10
//Example 2:
//
//Input: n = 5
//Output: [0,1,1,2,1,2]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10
//3 --> 11
//4 --> 100
//5 --> 101
public class CountingBits {
    public static void main(String[] args){
        int n = 5;
       String s = Integer.toBinaryString(n);
     //  System.out.println(s);
       for(int i = 0; i<=n;i++){
           //System.out.println(Integer.toBinaryString(i));
           String s1 = Integer.toBinaryString(i);
           long count = Arrays.stream(s1.split("")).mapToInt(Integer::parseInt).filter(k-> k == 1).count();
           System.out.println(count);
       }

       //alternate
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int count=0;
// here only it is extra that is built in function for coversion of decimal to binary
            String temp=Integer.toBinaryString(i);
            for(int j=0;j<temp.length();j++)
            {
                if(temp.charAt(j)=='1')
                {
                    count++;
                }
            }
            arr[i]=count;
        }
        System.out.println(Arrays.toString(arr));
    }
}
