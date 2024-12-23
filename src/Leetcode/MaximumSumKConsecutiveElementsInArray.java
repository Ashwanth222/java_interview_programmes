package Leetcode;

//Input  : arr[] = {100, 200, 300, 400}, k = 2
//Output : 700
//
//Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
//Output : 39
//We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
//
//Input  : arr[] = {2, 3}, k = 3
//Output : Invalid
//There is no subarray of size 3 as size of whole array is 2.
public class MaximumSumKConsecutiveElementsInArray {

        static int maxSum(int arr[], int n, int k)
        {
            // Initialize result
            int max_sum = Integer.MIN_VALUE;

            // Consider all blocks starting with i.
            for (int i = 0; i < n - k + 1; i++) {
                int current_sum = 0;
                for (int j = 0; j < k; j++)
                    current_sum = current_sum + arr[i + j];

                // Update result if required.
                max_sum = Math.max(current_sum, max_sum);
            }

            return max_sum;
        }
        // Driver code
        public static void main(String[] args)
        {
            int arr[] = { 1, 4, 2, 20, 2, 3, 1, 0, 20 };
            int k = 4;
            int n = arr.length;
            System.out.println(maxSum(arr, n, k));
        }

}
