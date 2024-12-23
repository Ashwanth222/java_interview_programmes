package Leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//We are given an array asteroids of integers representing asteroids in a row.
//
//For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
//
//Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
//
//
//
//Example 1:
//
//Input: asteroids = [5,10,-5]
//Output: [5,10]
//Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
//Example 2:
//
//Input: asteroids = [8,-8]
//Output: []
//Explanation: The 8 and -8 collide exploding each other.
//Example 3:
//
//Input: asteroids = [10,2,-5]
//Output: [10]
//Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
public class AsteroidCollision {
    public static void main(String[] args){
       int[] asteroids = {-11, 10,2,-5};
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(a);
                }

                if (stack.peek() == -a) {
                    stack.pop();
                }
            }
        }

        int[] res = new int[stack.size()];
        int i = stack.size() - 1;

        while(!stack.isEmpty()) {
            res[i--] = stack.pop();
        }

        System.out.println(Arrays.toString(res));


        //alternate
        Deque<Integer> deque = new LinkedList<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                deque.addLast(asteroid);
            } else {
                while (!deque.isEmpty() && deque.peekLast() > 0 && Math.abs(asteroid) > deque.peekLast()) {
                    deque.removeLast();
                }

                if (!deque.isEmpty() && deque.peekLast() == Math.abs(asteroid)) {
                    deque.removeLast();
                } else if (deque.isEmpty() || deque.peekLast() < 0) {
                    deque.addLast(asteroid);
                }
            }
        }

        int[] result = new int[deque.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = deque.removeFirst();
        }
        System.out.println(Arrays.toString(result));
    }
}
