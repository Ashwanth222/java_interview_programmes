package Leetcode;

//Input: arr[] = {5, 2, 7, 13}
//Output: 4 1 9 16
//Explanation:
//The nearest perfect square of arr[0] (= 5) is 4.
//The nearest perfect square of arr[1] (= 2) is 1.
//The nearest perfect square of arr[2] (= 7) is 9.
//The nearest perfect square of arr[3] (= 13) is 16.
//
//Input: arr[] = {31, 18, 64}
//Output: 36 16 64
public class FindNearestPerfectSquareOfEachElementInEachArray {
    // Function to find the nearest perfect square
// for every element in the given array
    static void nearestPerfectSquare(int[] arr, int N)
    {

        // Traverse the array
        for(int i = 0; i < N; i++)
        {

            // Calculate square root of
            // current  element
            int sr = (int)Math.sqrt(arr[i]);

            // Calculate perfect square
            int a = sr * sr;
            int b = (sr + 1) * (sr + 1);

            // Find the nearest
            if ((arr[i] - a) < (b - arr[i]))
                System.out.print(a + " ");
            else
                System.out.print(b + " ");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 5, 2, 7, 13 };
        int N = arr.length;

        nearestPerfectSquare(arr, N);
    }

}
