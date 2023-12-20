package Leetcode;
//Example 1:
//
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
//Example 2:
//
//Input: gain = [-4,-3,-2,-1,4,3,2]
//Output: 0
//Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
public class FindTheHighestAltitude {
    public static void main(String[] args){
        int[] input = {-4,-3,-2,-1,4,3,2};
        int max = 0;
        int sum = 0;
        for (int i = 0; i<input.length;i++){
            sum = sum +input[i];
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
        // int sum=0;
        //        int maxsum=0;
        //        for(int i=0; i<gain.length; i++){
        //            sum=gain[i]+sum;
        //            maxsum=Math.max(maxsum , sum);
        //        }
        //        return maxsum;
    }
}
