package Leetcode;

//Container With Most Water
//Medium
//Topics
//Companies
//Hint
//You are given an integer array height of length n. There are n vertical lines drawn such
// that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains
// the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.
//
//
//
//Example 1:
//
//
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
//In this case, the max area of water (blue section) the container can contain is 49.
//Example 2:
//
//Input: height = [1,1]
//Output: 1
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = 0;
        int j = 8;
        int a_pointer = height[i];
        System.out.println("a_pointer " + a_pointer);
        int b_pointer = height[j];
        System.out.println("b_pointer " + b_pointer);
        int minHight = Math.min(height[i], height[j]);
        System.out.println("minHight " + minHight);
        int gap = j-i;
        System.out.println("gap" + gap);
        int max = minHight*gap;
        System.out.println("max " + max);
        int temp;
        int mid = (j-i)/2;
        for(i = 0;i<j;i++) {
            minHight = Math.min(height[i], height[j]);
            gap = j - i;
            if ((minHight * gap) > max) {
                minHight = Math.min(height[i], height[j]);
                gap = j - i;
                max = minHight * gap;
                System.out.println("inner loop max" + max);
            }
        }
        int k=0;
        for( j = 8; j>k;j-- ) {
            minHight = Math.min(height[k], height[j]);
            gap = j - k;
            if ((minHight * gap) > max) {
                minHight = Math.min(height[i], height[j]);
                gap = j - i;
                max = minHight * gap;
                System.out.println("outer loop max" + max);
            }
        }
        System.out.println(max);

        //alternate

        // public int maxArea(int[] height) {
        //        int left = 0;
        //        int right = height.length - 1;
        //        int maxArea = 0;
        //
        //        while (left < right) {
        //            int currentArea = Math.min(height[left], height[right]) * (right - left);
        //            maxArea = Math.max(maxArea, currentArea);
        //
        //            if (height[left] < height[right]) {
        //                left++;
        //            } else {
        //                right--;
        //            }
        //        }
        //
        //        return maxArea;
        //    }

//        for(i = 0;i<j;i++) {
//            for(j = 8;j>i;j--) {
//                minHight = Math.min(height[i], height[j]);
//                gap = j - i;
//                if ((minHight * gap) > max) {
//                    minHight = Math.min(height[i], height[j]);
//                    gap = j - i;
//                    max = minHight * gap;
//                    System.out.println("inner loop max" + max);
//                }
//            }
//        }
    }
}
