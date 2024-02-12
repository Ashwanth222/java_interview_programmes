package Leetcode;
//You have a long flowerbed in which some of the plots are planted,
// and some are not. However, flowers cannot be planted in adjacent plots.
//
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty
// and 1 means not empty, and an integer n, return true if n new flowers can be
// planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//
//
//
//Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false
public class CanPlaceFlowers {
    public static void main(String[] args){
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n = 3;
        int count = 0;
        for(int i =0; i<flowerbed.length-2;i++){
            if(flowerbed[i] + flowerbed[i+1] + flowerbed[i+2] == 0){
                count = count +1;
                i = i+1;
            }
        }
        if(count == n){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
