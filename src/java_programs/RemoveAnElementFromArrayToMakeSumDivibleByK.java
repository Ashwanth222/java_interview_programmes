package java_programs;

import java.util.Arrays;

//Input: arr[ ] = {6, 7, 5, 1}, K = 7
//Output: 2
//Explanation:
//Removing arr[0] from arr[] modifies arr[] to { 7, 5, 1 }. Therefore, sum = 13
//Removing arr[1] from arr[] modifies arr[] to { 6, 5, 1 }. Therefore, sum = 12
//Removing arr[2] from arr[] modifies arr[] to { 6, 7, 1 }. Therefore, sum = 14
//Since the sum (= 14) is divisible by K(= 7), the required output is the index 2.
//
//Input: arr[ ] = {14, 7, 8, 2, 4}, K = 7
//Output: 1
public class RemoveAnElementFromArrayToMakeSumDivibleByK {
    static int findIndex(int arr[], int n, int K)
    {

        // Stores sum of array elements
        int sum = 0;

        // Stores index of the smallest element
        // removed from the array to make sum
        // divisible by K
        int res = -1;

        // Stores the smallest element removed
        // from the array to make sum divisible by K
        int mini = (int) 1e9;

        // Traverse the array, arr[]
        for (int i = 0; i < n; i++)
        {

            // Update sum
            sum += arr[i];
        }

        // Traverse the array arr[]
        for (int i = 0; i < n; i++)
        {

            // Calculate remaining sum
            int temp = sum - arr[i];

            // If sum is divisible by K
            if (temp % K == 0)
            {

                // If res ==-1 or mini is greater
                // than arr[i]
                if (res == -1 || mini > arr[i])
                {

                    // Update res and mini
                    res = i + 1;
                    mini = arr[i];
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {6, 7, 5, 1};
        int K = 7;
        int N = arr.length;
        System.out.print(findIndex(arr, N, K));
    }

//    private static boolean findIndex(int[] arr, int n, int k) {
//        int sum = 0;
//        int brr[] = new int[arr.length];
//        int replace = arr[0] ;
//        for(int i = 0; i<n;i++){
//            sum = sum + arr[i];
//        }
//        for(int j = 0; j<n;j++){
//            if(((sum - arr[j])%k) == 0){
//                System.out.println(arr[j]);
//                if(replace >arr[j] ){
//                    replace =arr[j];
//                }
//                replace = arr[j];
//
//            }else{
//
//                    brr[j] = arr[j];
//
//            }
//        }
//System.out.println(
//        Arrays.toString(Arrays.stream(brr).toArray()));
//        return false;
//    }
}
