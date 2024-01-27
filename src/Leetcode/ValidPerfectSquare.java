package Leetcode;
//Given a positive integer num, return true if num is a perfect square or false otherwise.
//
//A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
//
//You must not use any built-in library function, such as sqrt.
//
//
//
//Example 1:
//
//Input: num = 16
//Output: true
//Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
//Example 2:
//
//Input: num = 14
//Output: false
//Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer
public class ValidPerfectSquare {
    public static void main(String[] args){
      // int  num = 16;
       int num = 49;
       if(Math.sqrt(num) == Math.round(Math.sqrt(num))){
           System.out.println("it is perfect square");
       }else{
           System.out.println("it is not a perfect square");
       }

       //alternate
        int start = 1;
        int end = num;

        while(start <= end)
        {
            long mid = start + (end - start) / 2;

            if(mid * mid == num) {
                System.out.println("is a perfect square" + num);
                break;
            }
            else if(mid * mid > num) {
                end = (int) (mid - 1);
            }
            else{
                start = (int) (mid + 1);
            }
        }
        if(start > end)
        System.out.println("is not a perfect square" + num);



    }
}
