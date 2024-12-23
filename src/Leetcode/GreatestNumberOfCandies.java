package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//There are n kids with candies. You are given an integer array candies,
// where each candies[i] represents the number of candies the ith kid has,
// and an integer extraCandies, denoting the number of extra candies that you have.
//
//Return a boolean array result of length n, where result[i] is true if,
// after giving the ith kid all the extraCandies, they will have the greatest number
// of candies among all the kids, or false otherwise.
//
//Note that multiple kids can have the greatest number of candies.
//
//
//
//Example 1:
//
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//Example 2:
//
//Input: candies = [4,2,1,1,2], extraCandies = 1
//Output: [true,false,false,false,false]
//Explanation: There is only 1 extra candy.
//Kid 1 will always have the greatest number of candies, even if a different kid is given
// the extra candy.
//Example 3:
//
//Input: candies = [12,1,12], extraCandies = 10
//Output: [true,false,true]
public class GreatestNumberOfCandies {
    public static void main(String[] args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] arr = new boolean[candies.length];
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i = 0; i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                arr[i] = true;
            }else{
                arr[i] = false;
            }
        }
        System.out.println(Arrays.toString(arr));

        //alternate
        int maxCandies = 0;
        for(int c : candies)
        {
            maxCandies = Math.max(maxCandies, c);
        }

        List<Boolean> ans = new ArrayList<>();
        for(int candy : candies)
        {
            if(candy + extraCandies >= maxCandies)
                ans.add(true);
            else
                ans.add(false);
        }
        System.out.println(ans);

        //alternate
        int[] candies1 = {2,3,5,1,3};
        int maxCandies1 = 0;
        for(int c : candies1)
        {
            maxCandies1 = Math.max(maxCandies, c);
        }

        boolean[] greatestNumberOfCandies = new boolean[candies1.length-1];
        for(int i = 0; i<greatestNumberOfCandies.length; i++)
        {
            if(candies1[i] + extraCandies >= maxCandies1)
                greatestNumberOfCandies[i] = true;
            else
                greatestNumberOfCandies[i] = false;
        }
        System.out.println(ans);
    }
}
