package Leetcode;
//Power of Two
//Easy
//6.2K
//395
//Companies
//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.
//
//
//
//Example 1:
//
//Input: n = 1
//Output: true
//Explanation: 20 = 1
//Example 2:
//
//Input: n = 16
//Output: true
//Explanation: 24 = 16
//Example 3:
//
//Input: n = 3
//Output: false
public class PowerOfTwo {
    public static void main(String[] args){
        int n = 42;
        Integer i = Integer.parseInt(String.valueOf(n));
        System.out.println(i);
        boolean b = false;
        for(i =n;i >1;i = i/2) {
            if (i % 2 == 0 ) {
                System.out.println("if  "+i);
                b = true;
            }else{
                System.out.println("else  "+i);
                b = false;
                break;
            }
        }
        if(b){
             System.out.println("power of two");
        }else {
            System.out.println("not power of two");
        }
    }
}
